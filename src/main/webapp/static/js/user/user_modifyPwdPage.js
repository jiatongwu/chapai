
var contextPath = $("#contextPath").val();
layui.use(['jquery', 'form', 'table', 'layer', 'element'], function () {

	var $ = layui.$;
	var form = layui.form;
	var table = layui.table;
	var layer = layui.layer;
	var element = layui.element;



	form.verify({
		oldPwd: function (value, item) {
			if (value.length == 0) {
				return '请输入旧密码';
			}
		},
		newPwd1: function (value, item) {
			if (value.length < 6) {
				return "密码长度不能小于6位";
			}
		},
		newPwd2: function (value, item) {
			var pass = $("#newPwd1").val();

			if (pass != value) {
				return "两次输入密码不一致，请重新输入！";
			}
		}
	});
	/** 编辑 */
	form.on('submit(update)', function (data) {




		var config = {
			headers: {
				'Content-Type': 'application/x-www-form-urlencoded; charset=utf-8',
			}
		}
		var params = new URLSearchParams();
		for (var key in data.field) {
			params.append(key, data.field[key]);
		}
		instance.post(contextPath + '/user/modifyPwd', params, config)
			.then(function (response) {
				layer.closeAll('loading');
				if(response.data.code==0){
					parent.layer.closeAll('iframe');
					parent.layer.msg("修改密码成功", {
						icon : 6
					});
					//$('button[lay-filter = "query"]', window.parent.document).click();
				}else{
					var message=response.data.message;
					var alertMessage='操作失败';
					if(message.length>0){
						alertMessage='';
						for(var i=0;i<message.length;i++){
							alertMessage=alertMessage.concat(message[i]+" ");
						}
					}
					parent.layer.msg(alertMessage, {
						icon : 5,
						shift : 6
					});
				}
			}).catch(function (error) {
				//top.layer.close(loginLoading);
			});
		/*$.ajax({
			url: contextPath + '/browser/user/modifyPwd',
			type: 'post',
			data: data.field,
			dataType: 'json',
			beforeSend: function () {
				layer.load(2);
			},
			success: function (data) {
				layer.closeAll('loading');
				if (data.state == 'ok') {
					parentShowOkMsg(data.msg);
					$('.layui-laypage-btn', window.parent.document).click();
				} else if (data.state == 'fail') {
					showFailMsg(data.msg);
				} else if (data.state == 'over') {
					jumpToUrl(contextPath + data.url);
				}
			}
		});
		*/
		return false;
	});
});

