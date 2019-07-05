/**
	学生报名系统
	2019/06/28
	Li Xue
*/

var signSystem = {};

signSystem.common = {
	ajaxUrl: 'http://fh.xinkaoyun.com:65533/',
	getRequest: function(){
		var url = location.search;
	    var theRequest = new Object();
	    if (url.indexOf("?") != -1) {
	        var str = url.substr(1);
	        strs = str.split("&");
	        for (var i = 0; i < strs.length; i++) {
	            theRequest[strs[i].split("=")[0]] = decodeURI(strs[i].split("=")[1]);
	        }
	    }
	    return theRequest;
	},
	showOkMsg: function (msg, callback) {	// 成功提示
		layui.layer.msg(msg, {
			icon : 6,
			time: 1000
		}, function(){
			callback && callback();
		});
	},
	showFailMsg: function(msg, callback) {	// 失败提示
		layui.layer.msg(msg, {
			icon : 5,
			shift : 6
		}, function(){
			callback && callback();
		});
	},
	jumpToUrl: function(url, callback) {		// 网页跳转
		top.location = url;
	}
};

/**
	登录
*/
signSystem.login = {
	$dom: $('#J_loginPage'),
	api: {}
};
signSystem.login.api = {
	getPhoneCode: function(){
		signSystem.login.$dom.find('#J_getCodeBtn').on('click', function(){
			var $this = $(this),
				time = 60,
				phoneStr = signSystem.login.$dom.find('input[name="phone"]').val();
				//imgCode = signSystem.login.$dom.find('input[name="imgcode"]').val();

			if ($this.hasClass('on')) {
				return false;
			}
			if (!(/^1[3456789]\d{9}$/.test(phoneStr))) {
				signSystem.common.showFailMsg('请填写正确的手机号!');
				return false;
			}
			// if (!imgCode) {
			// 	signSystem.common.showFailMsg('请填写正确的图形验证码!');
			// 	return false;
			// }
			$.ajax({
				url : signSystem.common.ajaxUrl + 'app/isPhoneCanLogin',
				type : 'POST',
				data : {
					phone : phoneStr,
				},
				xhrFields : {
					withCredentials : true
				},
				dataType : 'json',
				beforeSend : function() {
					//layer.load(2);
				},
				success : function(data) {
					if (+data.code === 0) {
						if (+data.data === 0) {
							signSystem.common.showFailMsg('手机号未注册，请先去注册');
						} else {

							$this.addClass("on");
							$this.attr("disabled", true);
							$.ajax({
								url : signSystem.common.ajaxUrl + 'getValidateCode/sms',
								type : 'GET',
								data : {
									mobile : phoneStr,
									//image :imgCode
								},
								xhrFields : {
									withCredentials : true
								},
								dataType : 'json',
								beforeSend : function() {
									//layer.load(2);
								},
								success : function(data) {
									if (+data.code === 0) {
										signSystem.common.showOkMsg('短信发送成功!');
										var timer = setInterval(function() {
											if (time == 0) {
												clearInterval(timer);
												$this.attr("disabled", false);
												$this.html("获取验证码");
												$this.removeClass("on");
												
											} else {
												$this.html(time + "秒");
												time--;
											}
										}, 1000);
									} else {
										signSystem.common.showFailMsg(data.message ? data.message[0] : 'Error Info');
									}
								},
								error:function(){
									signSystem.common.showFailMsg('Error Info');
								}
							});
							
						}
					} else {
						signSystem.common.showFailMsg( 'Error Info');
					}
				},
				error:function(){
					signSystem.common.showFailMsg('Error Info');
				}
			});
		});
	},
	loginAction: function(){
		signSystem.login.$dom.find('#J_loginBtn').on('click', function(){
			var $this = $(this),
				phoneStr = signSystem.login.$dom.find('input[name="phone"]').val(),
				codeStr = signSystem.login.$dom.find('input[name="code"]').val();
			if (!(/^1[3456789]\d{9}$/.test(phoneStr))) {
				signSystem.common.showFailMsg('请填写正确的手机号!');
				return false;
			}

			if (codeStr.length < 6) {
				signSystem.common.showFailMsg('请填写正确的手机验证码!');
				return false;
			}

			$.ajax({
				url : signSystem.common.ajaxUrl + 'app/isRegCodeEmptyByPhone',
				type : 'GET',
				data : {
					phone : phoneStr,
				},
				xhrFields : {
					withCredentials : true
				},
				dataType : 'json',
				beforeSend : function() {
					//layer.load(2);
				},
				success : function(data) {
					if (+data.code === 0) {
						if (+data.data === 0) {
							$.ajax({
								url : signSystem.common.ajaxUrl + 'mobileLoginProcessingUrl',
								type : 'POST',
								data : {
									mobile : phoneStr,
									sms:codeStr,
								},
								xhrFields : {
									withCredentials : true
								},
								dataType : 'json',
								beforeSend : function() {
									//layer.load(2);
								},
								success : function(data) {
									if (+data.code === 0) {
										location.href = "edit.html";
									} else {
										signSystem.common.showFailMsg(data.message ? data.message[0] : 'Error Info');
									}
								},
								error:function(){
									signSystem.common.showFailMsg('Error Info');
								}
							});
						} else {
							signSystem.common.showFailMsg('审核未成功,预约号被清空！');
						}
					} else {
						signSystem.common.showFailMsg('Error Info');
					}
				},
				error:function(){
					signSystem.common.showFailMsg('Error Info');
				}
			});
		});
	},
	regAction: function(){
		var $dom = signSystem.login.$dom;
		$dom.on('click', '#J_regBtn', function(){
			$.ajax({
				url : signSystem.common.ajaxUrl + 'getZhaoShengTime',
				type : 'GET',
				xhrFields : {
					withCredentials : true
				},
				dataType : 'json',
				beforeSend : function() {
					//layer.load(2);
				},
				success : function(data) { 
					var curTime = new Date(),
						startTime = new Date(data.data.zhaoShengStartTimeKey.replace(/-/g, '/')),
						endTime = new Date(data.data.zhaoShengEndTimeKey.replace(/-/g, '/'));
						
					if (curTime >= startTime && curTime < endTime) {
						window.location.href = './index.html';
					} else if (curTime < startTime) {
						signSystem.common.showFailMsg('报名系统未开始');

					} else if (curTime > endTime){
						signSystem.common.showFailMsg('报名系统已结束');
					} else {
						signSystem.common.showFailMsg('Error Info');
					}
				},
				error:function(){
					signSystem.common.showFailMsg('Error Info');
				}
			});
			//location.href = "index.html";
		});
	},
	ImageCode: function(){
		signSystem.login.$dom.on('click', '#J_imageCode', function(){
			$(this).attr('src', signSystem.common.ajaxUrl + 'getValidateCode/image?length=6&width=200&height=100&fontSize=30&jiange=20');
		});
	},
	init: function(){
		signSystem.login.api.ImageCode();
		signSystem.login.api.regAction();
		signSystem.login.api.getPhoneCode();
		signSystem.login.api.loginAction();
		
	}
};

/**
	学生报名信息
*/
signSystem.info = {
	$dom : $('#J_signPage'),
	api  : {}
};

signSystem.info.api = {
	uploadFiles: function(){
		var imgurl = '';
		$.ajax({
			type: "post",
			url: "http://usr.xinkaoyun.com/api/qiniu/getqiniutoken",
			dataType: "json",
			data: {},
			success: function(data) {
				var censusImages = [];
				var uploader3 = Qiniu.uploader({
					runtimes: 'html5,flash,html4', // 上传模式，依次退化
					browse_button: 'pickfiles', // 上传选择的点选按钮，必需
					uptoken: data.data.UpToken, // uptoken是上传凭证，由其他程序生成
					get_new_uptoken: false, // 设置上传文件的时候是否每次都重新获取新的uptoken
					domain: data.data.LinkUrl, // bucket域名，下载资源时用到，必需
					container: 'container', // 上传区域DOM ID，默认是browser_button的父元素
					max_file_size: '100mb', // 最大文件体积限制
					flash_swf_url: 'path/of/plupload/Moxie.swf', //引入flash，相对路径
					max_retries: 3, // 上传失败最大重试次数
					dragdrop: false,
					chunk_size: '4mb', // 分块上传时，每块的体积
					auto_start: true,
					multi_selection: false,
					init: {
						'FilesAdded': function(up, files) {
							$('#censusTable').show();
			                //$('#success').hide();
			                plupload.each(files, function(file) {
			                    
			                });
						},
						'BeforeUpload': function(up, file) {
							// 每个文件上传前，处理相关的事情
							
						},
						'UploadProgress': function(up, file) {
							
						},
						'FileUploaded': function(up, file, info) {
							// 每个文件上传成功后，处理相关的事情
							var html = '<tr style="border-top:1px solid #ddd;">'
									 + '<td style="text-align:center">'
									 + '<img src="' + data.data.LinkUrl + imgurl + '" style="max-width: 100%;max-height:100px;" />'
									 + '</td>'
									 + '<td style="text-align: center;">'
									 + '<labe style="color:#f00;" class="del">删除</labe>'
									 + '</td>' 
									 + '</tr>';

							$('#fsUploadProgress').html(html);
						},
						'Error': function(up, err, errTip) {
							//上传出错时，处理相关的事情
							signSystem.common.showFailMsg('Error Info');
						},
						'UploadComplete': function() {
							//队列文件处理完毕后，处理相关的事情
							$('#success').show();
						},
						'Key': function(up, file) {
							var key = data.data.Bucket + '/censusImages' + '/' + Math.floor(Math.random() * 999999) + file.name;
							
							imgurl = key
								// do something with key here
							return key
						}
					}
				});

				var uploader2 = Qiniu.uploader({
					runtimes: 'html5,flash,html4', // 上传模式，依次退化
					browse_button: 'birthImages', // 上传选择的点选按钮，必需
					uptoken: data.data.UpToken, // uptoken是上传凭证，由其他程序生成
					get_new_uptoken: false, // 设置上传文件的时候是否每次都重新获取新的uptoken
					domain: data.data.LinkUrl, // bucket域名，下载资源时用到，必需
					container: 'container1', // 上传区域DOM ID，默认是browser_button的父元素
					max_file_size: '100mb', // 最大文件体积限制
					flash_swf_url: 'path/of/plupload/Moxie.swf', //引入flash，相对路径
					max_retries: 3, // 上传失败最大重试次数
					dragdrop: false,
					chunk_size: '4mb', // 分块上传时，每块的体积
					auto_start: true,
					multi_selection: false,
					init: {
						'FilesAdded': function(up, files) {
							$('#birthTable').show();
			                //$('#success').hide();
			                plupload.each(files, function(file) {
			                    
			                });
						},
						'BeforeUpload': function(up, file) {
							// 每个文件上传前，处理相关的事情
							
						},
						'UploadProgress': function(up, file) {
							
						},
						'FileUploaded': function(up, file, info) {
							// 每个文件上传成功后，处理相关的事情
							var html = '<tr style="border-top:1px solid #ddd;">'
									 + '<td style="text-align:center">'
									 + '<img src="' + data.data.LinkUrl + imgurl + '" style="max-width: 100%;max-height:100px;" />'
									 + '</td>'
									 + '<td style="text-align: center;">'
									 + '<labe style="color:#f00;" class="del">删除</labe>'
									 + '</td>' 
									 + '</tr>';

							$('#birthProgress').html(html);
						},
						'Error': function(up, err, errTip) {
							//上传出错时，处理相关的事情
							signSystem.common.showFailMsg('Error Info');
						},
						'UploadComplete': function() {
							//队列文件处理完毕后，处理相关的事情
							$('#success').show();
						},
						'Key': function(up, file) {
							var key = data.data.Bucket + '/birthImages' + '/' + Math.floor(Math.random() * 999999) + file.name;
							
							imgurl = key
								// do something with key here
							return key
						}
					}
				});

				var uploader = Qiniu.uploader({
					runtimes: 'html5,flash,html4', // 上传模式，依次退化
					browse_button: 'houseImages', // 上传选择的点选按钮，必需
					uptoken: data.data.UpToken, // uptoken是上传凭证，由其他程序生成
					get_new_uptoken: false, // 设置上传文件的时候是否每次都重新获取新的uptoken
					domain: data.data.LinkUrl, // bucket域名，下载资源时用到，必需
					container: 'container2', // 上传区域DOM ID，默认是browser_button的父元素
					max_file_size: '100mb', // 最大文件体积限制
					flash_swf_url: 'path/of/plupload/Moxie.swf', //引入flash，相对路径
					max_retries: 3, // 上传失败最大重试次数
					dragdrop: false,
					chunk_size: '4mb', // 分块上传时，每块的体积
					auto_start: true,
					init: {
						FilesAdded: function(up, files) {
		                     $('#houseTable').show();
		                },
		                
						'BeforeUpload': function(up, file) {
							// 每个文件上传前，处理相关的事情
						
							
						},
						'UploadProgress': function(up, file) {
							//console.log('up3', up);
							//console.log('file3', file);
						},
						'FileUploaded': function(up, file, info) {
							// 每个文件上传成功后，处理相关的事情
							
							var html = '<tr style="border-top:1px solid #ddd;">'
									 + '<td style="text-align:center">'
									 + '<img src="' + data.data.LinkUrl + imgurl + '" style="max-width: 100%;max-height:100px;" />'
									 + '</td>'
									 + '<td style="text-align: center;">'
									 + '<labe style="color:#f00;" class="del">删除</labe>'
									 + '</td>' 
									 + '</tr>';

							$('#houseProgress').append(html);
						},
						'Error': function(up, err, errTip) {
							//上传出错时，处理相关的事情
							signSystem.common.showFailMsg('Error Info');
						},
						'UploadComplete': function() {
							//队列文件处理完毕后，处理相关的事情
							//$('#success').show();
						},
						'Key': function(up, file) {
							//console.log('keyfile', file);
							var key = data.data.Bucket + '/houseImages' + '/' + Math.floor(Math.random() * 999999) + file.name;
							
							imgurl = key
								// do something with key here
							return key
						}
					}
				});
			}
		});

		signSystem.info.$dom.on('click', '.del', function(){
			var $parents = $(this).parents('.images-list');
			$(this).parents('tr').remove();
			if ($parents.find('tbody').find('tr').length === 0) {
				$parents.hide();
			}
		})
		
	},
	getPhoneCode: function(){
		signSystem.info.$dom.find('#J_getCodeBtn').on('click', function(){
			var $this = $(this),
				time = 60,
				phoneStr = signSystem.info.$dom.find('input[name="phone"]').val();
			if (!(/^1[3456789]\d{9}$/.test(phoneStr))) {
				signSystem.common.showFailMsg('请填写正确的手机号!');
				return false;
			}
			if ($this.hasClass('on')) {
				return false;
			}
			$this.addClass("on");
			$this.attr("disabled", true);
			$.ajax({
				url : signSystem.common.ajaxUrl + 'getValidateCode/sms',
				type : 'GET',
				data : {
					mobile : phoneStr
				},
				xhrFields : {
					withCredentials : true
				},
				dataType : 'json',
				beforeSend : function() {
					//layer.load(2);
				},
				success : function(data) {
					if (+data.code === 0) {
						signSystem.common.showOkMsg('短信发送成功!');
					} else {
						signSystem.common.showFailMsg(data.message ? data.message[0] : 'Error Info');
					}
				},
				error:function(){
					signSystem.common.showFailMsg('Error Info');
				}
			});
			var timer = setInterval(function() {
				if (time == 0) {
					clearInterval(timer);
					$this.attr("disabled", false);
					$this.html("获取验证码");
					$this.removeClass("on");
				} else {
					$this.html(time + "秒");
					time--;
				}
			}, 1000);
		});
	},
	addAction:function(){
		var $dom = signSystem.info.$dom,
			fixedHouse = '',
			census = '',
			gender = '';
			
		
		layui.use(['form', 'jquery'], function(){
			 var form = layui.form,
			  	 $= layui.$;
			form.on('radio', function(data){
			    if (data.elem.name == 'fixedHouse') {
			    	fixedHouse = data.value;
			    	if (fixedHouse == '否') {
			    		fixedHouse = '';
			    		$dom.find("input[name=fixedHouse][value=否]").attr("checked", false);
			    		form.render();
			    		signSystem.common.showFailMsg('没有固定住房 即不可报名!');
			    	}
			    }

			    if (data.elem.name == 'census') {
			    	census = data.value;
			    }

			    if (data.elem.name == 'gender') {
			    	gender = data.value;
			    }
				
			});  
		});

		$dom.find('#J_addBtn').on('click', function(){
			var censusImageFiles = [],
				birthCertificateImageFiles = [],
				houseCeritificateImageFiles = []; 
			$dom.find('#fsUploadProgress').find('img').each(function(){
				censusImageFiles.push($(this).attr('src'))
			});
			$dom.find('#birthProgress').find('img').each(function(){
				birthCertificateImageFiles.push($(this).attr('src'))
			});
			$dom.find('#houseProgress').find('img').each(function(){
				houseCeritificateImageFiles.push($(this).attr('src'))
			});
			if (!fixedHouse) {
				signSystem.common.showFailMsg('请选择 是否固定住房!');
				return false;
			}
			if (fixedHouse == '否') {
				signSystem.common.showFailMsg('没有固定住房 即不可报名!');
				return false;
			}
			if (!$dom.find('input[name="name"]').val()) {
				signSystem.common.showFailMsg('请填写学生姓名!');
				return false;
			}
			if (!$dom.find('input[name="birthday"]').val()) {
				signSystem.common.showFailMsg('请填写学生出生年月!');
				return false;
			}
			if (!census) {
				signSystem.common.showFailMsg('请填写户籍类型!');
				return false;
			}
			if (!$dom.find('input[name="accountLocation"]').val()) {
				signSystem.common.showFailMsg('请填写学生户口所在地!');
				return false;
			}
			if (!$dom.find('input[name="father"]').val()) {
				signSystem.common.showFailMsg('请填写父亲姓名!');
				return false;
			}
			if (!$dom.find('input[name="fatherWorkunit"]').val()) {
				signSystem.common.showFailMsg('请填写父亲工作单位!');
				return false;
			}
			if (!$dom.find('input[name="mother"]').val()) {
				signSystem.common.showFailMsg('请填写母亲姓名!');
				return false;
			}
			if (!$dom.find('input[name="motherWorkunit"]').val()) {
				signSystem.common.showFailMsg('请填写母亲工作单位!');
				return false;
			}
			if (!(/^1[3456789]\d{9}$/.test($dom.find('input[name="phone"]').val()))) {
				signSystem.common.showFailMsg('请填写正确的手机号!');
				return false;
			}
			if ($dom.find('input[name="sms"]').val().length < 6) {
				signSystem.common.showFailMsg('请填写正确的手机验证码!');
				return false;
			}
			if (!$dom.find('input[name="address"]').val()) {
				signSystem.common.showFailMsg('请填写固定住址!');
				return false;
			}
			if (!gender) {
				signSystem.common.showFailMsg('请选择性别!');
				return false;
			}
			if (censusImageFiles.length === 0) {
				signSystem.common.showFailMsg('请上传户口本页照片!');
				return false;
			}
			if (birthCertificateImageFiles.length === 0) {
				signSystem.common.showFailMsg('请上传孩子出生证明照片!');
				return false;
			}
			if (fixedHouse == '是' && houseCeritificateImageFiles.length === 0) {
				signSystem.common.showFailMsg('请上传房产固定照片!');
				return false;
			}
			//设置身份证号填报格式不正确的，且第七位至第十四位不在“20120901-20130831”区间的，报名失败。
			var cardStr = /(^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$)|(^[1-9]\d{5}\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{2}$)/;
			if (!cardStr.test($dom.find('input[name="idcard"]').val())) {
				signSystem.common.showFailMsg('请填写正确的身份证号!');
				return false;
			}

			$.ajax({
				url : signSystem.common.ajaxUrl + 'app/signupAndRegisterUser',
				type : 'POST',
				xhrFields : {
					withCredentials : true
				},
				data : {
					fixedHouse: fixedHouse,
					name : $dom.find('input[name="name"]').val(),
					birthday : $dom.find('input[name="birthday"]').val(),
					census : census,
					accountLocation : $dom.find('input[name="accountLocation"]').val(),
					father : $dom.find('input[name="father"]').val(),
					fatherWorkunit : $dom.find('input[name="fatherWorkunit"]').val(),
					mother : $dom.find('input[name="mother"]').val(),
					motherWorkunit : $dom.find('input[name="motherWorkunit"]').val(),
					phone : $dom.find('input[name="phone"]').val(),
					sms : $dom.find('input[name="sms"]').val(),
					address : $dom.find('input[name="address"]').val(),
					gender : gender,
					idcard : $dom.find('input[name="idcard"]').val(),
					censusImageFiles: censusImageFiles.join(','),
					birthCertificateImageFiles: birthCertificateImageFiles.join(','),
					houseCeritificateImageFiles: houseCeritificateImageFiles.join(',')
				},
				dataType : 'json',
				beforeSend : function() {
					layui.use(['layer', 'jquery'], function(){
						layer.load(2);
					})
					
				},
				success : function(data) {
					layui.use(['layer', 'jquery'], function(){
						layer.closeAll();
					})
					if (+data.code === 0) {
						location.href = "info.html?id=" + data.data;
						//signSystem.common.showFailMsg('短信发送成功!');
					} else {
						signSystem.common.showFailMsg(data.message ? data.message[0] : 'Error Info');
					}
				},
				error:function(){
					layui.use(['layer', 'jquery'], function(){
						layer.closeAll();
					})
					signSystem.common.showFailMsg('Error Info');
				}
			});
		});
	},
	init: function(){
		signSystem.info.api.uploadFiles();
		signSystem.info.api.getPhoneCode();
		signSystem.info.api.addAction();

	}
};

/**
	学生报名信息edit
*/
signSystem.info.edit = {
	$dom : $('#J_signPage'),
	api  : {},
	id : '',
	newData:''
};

signSystem.info.edit.api = {
	uploadFiles: function(){
		var imgurl = '';
		$.ajax({
			type: "post",
			url: "http://usr.xinkaoyun.com/api/qiniu/getqiniutoken",
			dataType: "json",
			data: {},
			success: function(data) {
				var censusImages = [];
				var uploader = Qiniu.uploader({
					runtimes: 'html5,flash,html4', // 上传模式，依次退化
					browse_button: 'pickfiles', // 上传选择的点选按钮，必需
					uptoken: data.data.UpToken, // uptoken是上传凭证，由其他程序生成
					get_new_uptoken: false, // 设置上传文件的时候是否每次都重新获取新的uptoken
					domain: data.data.LinkUrl, // bucket域名，下载资源时用到，必需
					container: 'container', // 上传区域DOM ID，默认是browser_button的父元素
					max_file_size: '100mb', // 最大文件体积限制
					flash_swf_url: 'path/of/plupload/Moxie.swf', //引入flash，相对路径
					max_retries: 3, // 上传失败最大重试次数
					dragdrop: false,
					chunk_size: '4mb', // 分块上传时，每块的体积
					auto_start: true,
					multi_selection: false,
					init: {
						'FilesAdded': function(up, files) {
							$('#censusTable').show();
			                //$('#success').hide();
			                plupload.each(files, function(file) {
			                    
			                });
						},
						'BeforeUpload': function(up, file) {
							// 每个文件上传前，处理相关的事情
							
						},
						'UploadProgress': function(up, file) {
							
						},
						'FileUploaded': function(up, file, info) {
							// 每个文件上传成功后，处理相关的事情
							var html = '<tr style="border-top:1px solid #ddd;">'
									 + '<td style="text-align:center">'
									 + '<img src="' + data.data.LinkUrl + imgurl + '" style="max-width: 100%;max-height:100px;" />'
									 + '</td>'
									 + '<td style="text-align: center;">'
									 + '<labe style="color:#f00;" class="del">删除</labe>'
									 + '</td>' 
									 + '</tr>';

							$('#fsUploadProgress').html(html);
						},
						'Error': function(up, err, errTip) {
							//上传出错时，处理相关的事情
							signSystem.common.showFailMsg('Error Info');
						},
						'UploadComplete': function() {
							//队列文件处理完毕后，处理相关的事情
							$('#success').show();
						},
						'Key': function(up, file) {
							var key = data.data.Bucket + '/censusImages' + '/' + Math.floor(Math.random() * 999999) + file.name;
							
							imgurl = key
								// do something with key here
							return key
						}
					}
				});

				var uploader2 = Qiniu.uploader({
					runtimes: 'html5,flash,html4', // 上传模式，依次退化
					browse_button: 'birthImages', // 上传选择的点选按钮，必需
					uptoken: data.data.UpToken, // uptoken是上传凭证，由其他程序生成
					get_new_uptoken: false, // 设置上传文件的时候是否每次都重新获取新的uptoken
					domain: data.data.LinkUrl, // bucket域名，下载资源时用到，必需
					container: 'container1', // 上传区域DOM ID，默认是browser_button的父元素
					max_file_size: '100mb', // 最大文件体积限制
					flash_swf_url: 'path/of/plupload/Moxie.swf', //引入flash，相对路径
					max_retries: 3, // 上传失败最大重试次数
					dragdrop: false,
					chunk_size: '4mb', // 分块上传时，每块的体积
					auto_start: true,
					multi_selection: false,
					init: {
						'FilesAdded': function(up, files) {
							$('#birthTable').show();
			                //$('#success').hide();
			                plupload.each(files, function(file) {
			                    
			                });
						},
						'BeforeUpload': function(up, file) {
							// 每个文件上传前，处理相关的事情
							
						},
						'UploadProgress': function(up, file) {
							
						},
						'FileUploaded': function(up, file, info) {
							// 每个文件上传成功后，处理相关的事情
							var html = '<tr style="border-top:1px solid #ddd;">'
									 + '<td style="text-align:center">'
									 + '<img src="' + data.data.LinkUrl + imgurl + '" style="max-width: 100%;max-height:100px;" />'
									 + '</td>'
									 + '<td style="text-align: center;">'
									 + '<labe style="color:#f00;" class="del">删除</labe>'
									 + '</td>' 
									 + '</tr>';

							$('#birthProgress').html(html);
						},
						'Error': function(up, err, errTip) {
							//上传出错时，处理相关的事情
							signSystem.common.showFailMsg('Error Info');
						},
						'UploadComplete': function() {
							//队列文件处理完毕后，处理相关的事情
							$('#success').show();
						},
						'Key': function(up, file) {
							var key = data.data.Bucket + '/birthImages' + '/' + Math.floor(Math.random() * 999999) + file.name;
							
							imgurl = key
								// do something with key here
							return key
						}
					}
				});

				var uploader3 = Qiniu.uploader({
					runtimes: 'html5,flash,html4', // 上传模式，依次退化
					browse_button: 'houseImages', // 上传选择的点选按钮，必需
					uptoken: data.data.UpToken, // uptoken是上传凭证，由其他程序生成
					get_new_uptoken: false, // 设置上传文件的时候是否每次都重新获取新的uptoken
					domain: data.data.LinkUrl, // bucket域名，下载资源时用到，必需
					container: 'container2', // 上传区域DOM ID，默认是browser_button的父元素
					max_file_size: '100mb', // 最大文件体积限制
					flash_swf_url: 'path/of/plupload/Moxie.swf', //引入flash，相对路径
					max_retries: 3, // 上传失败最大重试次数
					dragdrop: false,
					chunk_size: '4mb', // 分块上传时，每块的体积
					auto_start: true,
					init: {
						'FilesAdded': function(up, files) {
							$('#houseTable').show();
			                //$('#success').hide();
			                plupload.each(files, function(file) {
			                    
			                });
						},
						'BeforeUpload': function(up, file) {
							// 每个文件上传前，处理相关的事情
							
						},
						'UploadProgress': function(up, file) {
							
						},
						'FileUploaded': function(up, file, info) {
							// 每个文件上传成功后，处理相关的事情
							var html = '<tr style="border-top:1px solid #ddd;">'
									 + '<td style="text-align:center">'
									 + '<img src="' + data.data.LinkUrl + imgurl + '" style="max-width: 100%;max-height:100px;" />'
									 + '</td>'
									 + '<td style="text-align: center;">'
									 + '<labe style="color:#f00;" class="del">删除</labe>'
									 + '</td>' 
									 + '</tr>';

							$('#houseProgress').append(html);
						},
						'Error': function(up, err, errTip) {
							//上传出错时，处理相关的事情
							signSystem.common.showFailMsg('Error Info');
						},
						'UploadComplete': function() {
							//队列文件处理完毕后，处理相关的事情
							//$('#success').show();
						},
						'Key': function(up, file) {
							var key = data.data.Bucket + '/houseImages' + '/' + Math.floor(Math.random() * 999999) + file.name;
							
							imgurl = key
								// do something with key here
							return key
						}
					}
				});
			}
		});

		signSystem.info.$dom.on('click', '.del', function(){
			var $parents = $(this).parents('.images-list');
			$(this).parents('tr').remove();
			if ($parents.find('tbody').find('tr').length === 0) {
				$parents.hide();
			}
		})
	},
	getPhoneCode: function(){
		signSystem.info.$dom.find('#J_getCodeBtn').on('click', function(){
			var $this = $(this),
				time = 60,
				phoneStr = signSystem.info.$dom.find('input[name="phone"]').val();
			if (!(/^1[3456789]\d{9}$/.test(phoneStr))) {
				signSystem.common.showFailMsg('请填写正确的手机号!');
				return false;
			}
			if ($this.hasClass('on')) {
				return false;
			}
			$this.addClass("on");
			$this.attr("disabled", true);
			$.ajax({
				url : signSystem.common.ajaxUrl + 'getValidateCode/sms',
				type : 'GET',
				data : {
					mobile : phoneStr
				},
				xhrFields : {
					withCredentials : true
				},
				dataType : 'json',
				beforeSend : function() {
					//layer.load(2);
				},
				success : function(data) {
					if (+data.code === 0) {
						signSystem.common.showOkMsg('短信发送成功!');
					} else {
						signSystem.common.showFailMsg(data.message ? data.message[0] : 'Error Info');
					}
				},
				error:function(){
					signSystem.common.showFailMsg('Error Info');
				}
			});
			var timer = setInterval(function() {
				if (time == 0) {
					clearInterval(timer);
					$this.attr("disabled", false);
					$this.html("获取验证码");
					$this.removeClass("on");
				} else {
					$this.html(time + "秒");
					time--;
				}
			}, 1000);
		});
	},
	addAction:function(){
		var $dom = signSystem.info.$dom,
			fixedHouse = '',
			census = '',
			gender = '';
			
		
		layui.use(['form', 'jquery'], function(){
			 var form = layui.form,
			  	 $= layui.$;
			form.on('radio', function(data){
			    if (data.elem.name == 'fixedHouse') {
			    	fixedHouse = data.value;
			    }

			    if (data.elem.name == 'census') {
			    	census = data.value;
			    }

			    if (data.elem.name == 'gender') {
			    	gender = data.value;
			    }
				
			});  
		});

		$dom.on('click', '#J_addBtn', function(){
			var censusImageFiles = [],
				birthCertificateImageFiles = [],
				houseCeritificateImageFiles = [],
				newData = signSystem.info.edit.newData;
			$dom.find('#fsUploadProgress').find('img').each(function(){
				censusImageFiles.push($(this).attr('src'))
			});
			$dom.find('#birthProgress').find('img').each(function(){
				birthCertificateImageFiles.push($(this).attr('src'))
			});
			$dom.find('#houseProgress').find('img').each(function(){
				houseCeritificateImageFiles.push($(this).attr('src'))
			});
			if (!fixedHouse && !newData.fixedHouse) {
				signSystem.common.showFailMsg('请选择 是否固定住房!');
				return false;
			}
			if (!$dom.find('input[name="name"]').val()) {
				signSystem.common.showFailMsg('请填写学生姓名!');
				return false;
			}
			if (!$dom.find('input[name="birthday"]').val()) {
				signSystem.common.showFailMsg('请填写学生出生年月!');
				return false;
			}
			if (!census && !newData.census) {
				signSystem.common.showFailMsg('请填写户籍类型!');
				return false;
			}
			if (!$dom.find('input[name="accountLocation"]').val()) {
				signSystem.common.showFailMsg('请填写学生户口所在地!');
				return false;
			}
			if (!$dom.find('input[name="father"]').val()) {
				signSystem.common.showFailMsg('请填写父亲姓名!');
				return false;
			}
			if (!$dom.find('input[name="fatherWorkunit"]').val()) {
				signSystem.common.showFailMsg('请填写父亲工作单位!');
				return false;
			}
			if (!$dom.find('input[name="mother"]').val()) {
				signSystem.common.showFailMsg('请填写母亲姓名!');
				return false;
			}
			if (!$dom.find('input[name="motherWorkunit"]').val()) {
				signSystem.common.showFailMsg('请填写母亲工作单位!');
				return false;
			}
			if (!(/^1[3456789]\d{9}$/.test($dom.find('input[name="phone"]').val()))) {
				signSystem.common.showFailMsg('请填写正确的手机号!');
				return false;
			}
			// if ($dom.find('input[name="sms"]').val().length < 6) {
			// 	signSystem.common.showFailMsg('请填写正确的手机验证码!');
			// 	return false;
			// }
			if (!$dom.find('input[name="address"]').val()) {
				signSystem.common.showFailMsg('请填写固定住址!');
				return false;
			}
			if (!gender && !newData.gender) {
				signSystem.common.showFailMsg('请选择性别!');
				return false;
			}
			if (censusImageFiles.length === 0) {
				signSystem.common.showFailMsg('请上传户口本页照片!');
				return false;
			}
			if (birthCertificateImageFiles.length === 0) {
				signSystem.common.showFailMsg('请上传孩子出生证明照片!');
				return false;
			}
			if (fixedHouse == '是' && houseCeritificateImageFiles.length === 0) {
				signSystem.common.showFailMsg('请上传房产固定照片!');
				return false;
			}
			//设置身份证号填报格式不正确的，且第七位至第十四位不在“20120901-20130831”区间的，报名失败。
			var cardStr = /(^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$)|(^[1-9]\d{5}\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{2}$)/;
			if (!cardStr.test($dom.find('input[name="idcard"]').val())) {
				signSystem.common.showFailMsg('请填写正确的身份证号!');
				return false;
			}

			$.ajax({
				url : signSystem.common.ajaxUrl + 'app/updateSignupById',
				type : 'POST',
				xhrFields : {
					withCredentials : true
				},
				data : {
					fixedHouse: fixedHouse || newData.fixedHouse,
					name : $dom.find('input[name="name"]').val(),
					birthday : $dom.find('input[name="birthday"]').val(),
					census : census || newData.census,
					accountLocation : $dom.find('input[name="accountLocation"]').val(),
					father : $dom.find('input[name="father"]').val(),
					fatherWorkunit : $dom.find('input[name="fatherWorkunit"]').val(),
					mother : $dom.find('input[name="mother"]').val(),
					motherWorkunit : $dom.find('input[name="motherWorkunit"]').val(),
					phone : $dom.find('input[name="phone"]').val(),
					//sms : $dom.find('input[name="sms"]').val(),
					address : $dom.find('input[name="address"]').val(),
					gender : gender || newData.gender,
					idcard : $dom.find('input[name="idcard"]').val(),
					censusImageFiles: censusImageFiles.join(','),
					birthCertificateImageFiles: birthCertificateImageFiles.join(','),
					houseCeritificateImageFiles: houseCeritificateImageFiles.join(','),
					id: signSystem.info.edit.id
				},
				dataType : 'json',
				beforeSend : function() {
					layui.use(['layer', 'jquery'], function(){
						layer.load(2);
					})
					
				},
				success : function(data) {
					layui.use(['layer', 'jquery'], function(){
						layer.closeAll();
					})
					if (+data.code === 0) {
						location.href = "editInfo.html";
						//signSystem.common.showFailMsg('短信发送成功!');
					} else {
						signSystem.common.showFailMsg(data.message ? data.message[0] : 'Error Info');
					}
				},
				error:function(){
					layui.use(['layer', 'jquery'], function(){
						layer.closeAll();
					})
					signSystem.common.showFailMsg('Error Info');
				}
			});
		});
	},
	getStuInfo:function(){
		var $dom = signSystem.info.$dom;
		$.ajax({
			url : signSystem.common.ajaxUrl + 'app/getSignupStudents',
			type : 'GET',
			xhrFields : {
				withCredentials : true
			},
			dataType : 'json',
			beforeSend : function() {
				layui.use(['layer', 'jquery'], function(){
					layer.load(2);
				})
				
			},
			success : function(data) {
				layui.use(['layer', 'jquery'], function(){
					layer.closeAll();
				})
				if (+data.code === 0) {
					signSystem.info.edit.newData = data.data[0];
					signSystem.info.edit.id = data.data[0].id;
					var html = '';
					var newdata = data.data[0];
					data.data[0].houseCeritificateImageFiles && (newdata.houseCeritificateImageFiles = data.data[0].houseCeritificateImageFiles.split(','));
					data.data[0].censusImageFiles && (newdata.censusImageFiles = data.data[0].censusImageFiles.split(','));
					data.data[0].birthCertificateImageFiles && (newdata.birthCertificateImageFiles = data.data[0].birthCertificateImageFiles.split(','));

					$.ajax({
						url : signSystem.common.ajaxUrl + 'getZhaoShengTime',
						type : 'GET',
						xhrFields : {
							withCredentials : true
						},
						dataType : 'json',
						beforeSend : function() {
							//layer.load(2);
						},
						success : function(timeData) { 
							//timeData.data.zhaoShengEndTimeKey = '2019-07-02 00:00:00';
							
							var curTime = new Date(),
								startTime = new Date(timeData.data.zhaoShengStartTimeKey.replace(/-/g, '/')),
								endTime = new Date(timeData.data.zhaoShengEndTimeKey.replace(/-/g, '/'));

							if (curTime >= startTime && curTime < endTime) {
								html = template('J_formInnerTpl', {list: newdata, isEnd: false});
								$dom.find('form').html(html);
								layui.use(['layer', 'form'], function () {
								    var form=layui.form;
								    form.render();
								});

								layui.use('laydate', function(){
								  var laydate = layui.laydate;
								  
								  //常规用法
								  laydate.render({
								    elem: '#test1',
								    format: 'yyyyMMdd'
								  });
								});
							} else {
								html = template('J_formInnerTpl', {list: newdata, isEnd: true});
								$dom.find('form').html(html);
								layui.use(['layer', 'form'], function () {
								    var form=layui.form;
								    form.render();
								});

								layui.use('laydate', function(){
								  var laydate = layui.laydate;
								  
								  //常规用法
								  laydate.render({
								    elem: '#test1',
								    format: 'yyyyMMdd'
								  });
								});
							}
						},
						error:function(){
							signSystem.common.showFailMsg('Error Info');
						}
					});

					

					
					//location.href = "info.html?id=" + data.data;
					//signSystem.common.showFailMsg('短信发送成功!');
				} else {
					signSystem.common.showFailMsg(data.message ? data.message[0] : 'Error Info');
				}
			},
			error:function(){
				layui.use(['layer', 'jquery'], function(){
					layer.closeAll();
				})
				signSystem.common.showFailMsg('Error Info');
			}
		});
	},
	init: function(){
		signSystem.info.edit.api.getStuInfo();
		signSystem.info.edit.api.uploadFiles();
		signSystem.info.edit.api.getPhoneCode();
		signSystem.info.edit.api.addAction();

	}
};

// 报名成功

signSystem.info.action = {
	$dom : $('#J_infoPage'),
	api  : {}
}
signSystem.info.action.api = {
	init: function(){
		var theRequest = signSystem.common.getRequest();
		signSystem.info.action.$dom.find('#J_code').html('报名预约号: ' + theRequest.id);
	}
}