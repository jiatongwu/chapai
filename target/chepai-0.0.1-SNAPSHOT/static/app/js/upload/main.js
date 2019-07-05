///*global Qiniu */
///*global plupload */
///*global FileProgress */
///*global hljs */


var pcToken = $.cookie('pcToken');
var classId = $.cookie('classId');
var schoolId = $.cookie('schoolId');
var taskId = $.cookie('taskId');
var stuId = $.cookie('stuId');
// page=url
page = x_url;
$.ajax({
	type: "get",
	url: page + "holidaywork/getQiNiuToken",
	dataType: "json",
	data: {
		'token': pcToken
	},
	success: function(data) {
		var upToken = data.data;

		var uploader = Qiniu.uploader({
			runtimes: 'html5,flash,html4', // 上传模式，依次退化
			browse_button: 'pickfiles', // 上传选择的点选按钮，必需
			container: 'container',
			drop_element: 'container',
			max_file_size: '10mb', //最大文件体积限制
			flash_swf_url: 'bower_components/plupload/js/Moxie.swf',
			dragdrop: true,
			chunk_size: '4mb', //分块上传时，每块的体积
			max_retries: 3, // 上传失败最大重试次数
			filters: {
				max_file_size: '10mb',
				mime_types: [{
						title: "Image files",
						extensions: "jpg,jpeg,gif,png"
					} // 限定jpg,gif,png后缀上传
				]
			},

			//uptoken: "qSAdTDCSNplD6ETHqy9Whk0EbVhwzJCmDH4okTQi:xMSrewIJXtZHJ0NTMA3YtSOs1BQ=:eyJzY29wZSI6Imp4aGxhcHAiLCJkZWFkbGluZSI6MTQ5NTY4NTYwNH0=",
			uptoken: upToken,
			//uptoken_url: $('#uptoken_url').val(),
			// uptoken_func: function(){
			//     var ajax = new XMLHttpRequest();
			//     ajax.open('GET', $('#uptoken_url').val(), false);
			//     ajax.setRequestHeader("If-Modified-Since", "0");
			//     ajax.send();
			//     if (ajax.status === 200) {
			//         var res = JSON.parse(ajax.responseText);
			//         console.log('custom uptoken_func:' + res.uptoken);
			//         return res.uptoken;
			//     } else {
			//         console.log('custom uptoken_func err');
			//         return '';
			//     }
			// },

			multi_selection: true, //!(mOxie.Env.OS.toLowerCase() === "ios"), //一次只能选一个文
			domain: 'https://zuoye2.xinkaoyun.com/',
			get_new_uptoken: false,//设置上传文件的时候是否每次都重新获取新的uptoken
			unique_names: false, // 默认false，key为文件名。若开启该选项，JS-SDK会为每个文件自动生成key（文件名）
			save_key: false,
			// downtoken_url: '/downtoken',
			// unique_names: true,
			// save_key: true,
			// x_vars: {
			//     'id': '1234',
			//     'time': function(up, file) {
			//         var time = (new Date()).getTime();
			//         // do something with 'time'
			//         return time;
			//     },
			// },
			auto_start: true,// 选择文件后自动上传，若关闭需要自己绑定事件触发上传
			log_level: 5,
			init: {
				'FilesAdded': function(up, files) {
					$('table').show();
					$('#success').hide();
					plupload.each(files, function(file) {
						var progress = new FileProgress(file, 'fsUploadProgress');
						progress.setStatus("等待...");
						progress.bindUploadCancel(up);
					});
				},
				'BeforeUpload': function(up, file) {
					var progress = new FileProgress(file, 'fsUploadProgress');
					var chunk_size = plupload.parseSize(this.getOption('chunk_size'));
					if (up.runtime === 'html5' && chunk_size) {
						progress.setChunkProgess(chunk_size);
					}
				},
				'UploadProgress': function(up, file) {
					var progress = new FileProgress(file, 'fsUploadProgress');
					var chunk_size = plupload.parseSize(this.getOption('chunk_size'));
					progress.setProgress(file.percent + "%", file.speed, chunk_size);
				},
				'UploadComplete': function() {
					$('#success').show();
				},
				'FileUploaded': function(up, file, info) {
					var progress = new FileProgress(file, 'fsUploadProgress');
					progress.setComplete(up, info);
				},
				'Error': function(up, err, errTip) {
					$('table').show();
					var progress = new FileProgress(err.file, 'fsUploadProgress');
					progress.setError();
					progress.setStatus(errTip);
				},
				'Key': function(up, file) {
					var myDate = new Date();
					var aa = myDate.getFullYear(); //年
					var bb = myDate.getMonth(); //月
					var cc = myDate.getDate(); //日
					var dd = myDate.getHours(); //时
					var ee = myDate.getMinutes(); //分
					var ff = myDate.getSeconds(); //秒
					var gg = myDate.getMilliseconds(); //毫秒
					bb += 1;
					if (bb < 9) {
						bb = "0" + bb;
					}
					if (cc < 9) {
						cc = "0" + cc;
					}

					var abc = aa + '' + bb + '' + cc + '' + dd + '' + ee + '' + ff + '' + gg;
					var abd = aa + '' + bb + '' + cc;

					var aabb = Math.floor(Math.random() * 999999);
					//var key = "app/" + abd + "/" + file.name;
					var key = "awm/" + schoolId + "/" + classId + "/" + aabb + abc + file.name;
					// do something with key
					imgname = aabb + abc + file.name;
					imgurl = "awm/" + schoolId + "/" + classId + "/" + aabb + abc + encodeURIComponent(file.name);

					console.log(imgurl);

					return key;
				}
			}
		});

		uploader.bind('FileUploaded', function() {

			$.ajax({
				type: "post",
				url: page + "holidaywork/student/uploadTaskImg?" + Math.random(),
				dataType: "json",
				data: {
					token: pcToken,
					// classId: classId,
					path: $('#domain').val() + imgurl,
					taskId: taskId,
					// stuId: stuId
				},
				success: function(data) {
					console.log(data)
					if (data.state == 'ok') {
						console.log('hello man,a file is uploaded');

					}
				},
				error: function(data) {

					console.log('错误' + data.content);
				}
			});
		});
		$('#container').on(
			'dragenter',
			function(e) {
				e.preventDefault();
				$('#container').addClass('draging');
				e.stopPropagation();
			}
		).on('drop', function(e) {
			e.preventDefault();
			$('#container').removeClass('draging');
			e.stopPropagation();
		}).on('dragleave', function(e) {
			e.preventDefault();
			$('#container').removeClass('draging');
			e.stopPropagation();
		}).on('dragover', function(e) {
			e.preventDefault();
			$('#container').addClass('draging');
			e.stopPropagation();
		});


		$('#show_code').on('click', function() {
			$('#myModal-code').modal();
			$('pre code').each(function(i, e) {
				hljs.highlightBlock(e);
			});
		});


		$('body').on('click', 'table button.btn', function() {
			$(this).parents('tr').next().toggle();
		});


		var getRotate = function(url) {
			if (!url) {
				return 0;
			}
			var arr = url.split('/');
			for (var i = 0, len = arr.length; i < len; i++) {
				if (arr[i] === 'rotate') {
					return parseInt(arr[i + 1], 10);
				}
			}
			return 0;
		};

		$('#myModal-img .modal-body-footer').find('a').on('click', function() {
			var img = $('#myModal-img').find('.modal-body img');
			var key = img.data('key');
			var oldUrl = img.attr('src');
			var originHeight = parseInt(img.data('h'), 10);
			var fopArr = [];
			var rotate = getRotate(oldUrl);
			if (!$(this).hasClass('no-disable-click')) {
				$(this).addClass('disabled').siblings().removeClass('disabled');
				if ($(this).data('imagemogr') !== 'no-rotate') {
					fopArr.push({
						'fop': 'imageMogr2',
						'auto-orient': true,
						'strip': true,
						'rotate': rotate,
						'format': 'png'
					});
				}
			} else {
				$(this).siblings().removeClass('disabled');
				var imageMogr = $(this).data('imagemogr');
				if (imageMogr === 'left') {
					rotate = rotate - 90 < 0 ? rotate + 270 : rotate - 90;
				} else if (imageMogr === 'right') {
					rotate = rotate + 90 > 360 ? rotate - 270 : rotate + 90;
				}
				fopArr.push({
					'fop': 'imageMogr2',
					'auto-orient': true,
					'strip': true,
					'rotate': rotate,
					'format': 'png'
				});
			}

			$('#myModal-img .modal-body-footer').find('a.disabled').each(function() {

				var watermark = $(this).data('watermark');
				var imageView = $(this).data('imageview');
				var imageMogr = $(this).data('imagemogr');

				if (watermark) {
					fopArr.push({
						fop: 'watermark',
						mode: 1,
						image: 'http://www.b1.qiniudn.com/images/logo-2.png',
						dissolve: 100,
						gravity: watermark,
						dx: 100,
						dy: 100
					});
				}

				if (imageView) {
					var height;
					switch (imageView) {
						case 'large':
							height = originHeight;
							break;
						case 'middle':
							height = originHeight * 0.5;
							break;
						case 'small':
							height = originHeight * 0.1;
							break;
						default:
							height = originHeight;
							break;
					}
					fopArr.push({
						fop: 'imageView2',
						mode: 3,
						h: parseInt(height, 10),
						q: 100,
						format: 'png'
					});
				}

				if (imageMogr === 'no-rotate') {
					fopArr.push({
						'fop': 'imageMogr2',
						'auto-orient': true,
						'strip': true,
						'rotate': 0,
						'format': 'png'
					});
				}
			});

			var newUrl = Qiniu.pipeline(fopArr, key);

			var newImg = new Image();
			img.attr('src', 'images/loading.gif');
			newImg.onload = function() {
				img.attr('src', newUrl);
				img.parent('a').attr('href', newUrl);
			};
			newImg.src = newUrl;
			return false;
		});

	},
	error: function(data) {
		alert("请求错误");
		console.log('错误' + data);
	}
});
