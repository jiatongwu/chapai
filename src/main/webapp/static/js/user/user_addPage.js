
var contextPath = $("#contextPath").val();
	layui.config({
		base : contextPath + '/static/'
	}).extend({
		common : 'js/common'
	}).use([ 'common', 'code','jquery', 'form', 'table', 'laydate','layer', 'element' ], function() {
		var common = layui.common;
		var $ = layui.$;
		var form = layui.form;
		var table = layui.table;
		var layer = layui.layer;
		var element = layui.element;
		var laydate = layui.laydate;
	
	/*	$('.test').each(function(){
			laydate.render({
			  elem: this
			  ,type: 'date',trigger: 'click'
			});
		  });
*/

		form.on('submit(save)', function (data) {
			layer.load(2);
			let config = {
				headers: {
					'Content-Type': 'application/x-www-form-urlencoded; charset=utf-8',
				}
			}
			const params = new URLSearchParams();
			for (var key in data.field) {						
				params.append(key, data.field[key]);
			}
			instance.post(contextPath+'/user/add', params,config)
			.then(function (response) {
				layer.closeAll('loading');
				if(response.data.code==0){					
					console.log(typeof parent);
					console.log(parent);
					parent.layer.closeAll('iframe');
					parent.layer.msg("新增成功", {
						icon : 6
					});					
					$('button[lay-filter = "query"]', window.parent.document).click();
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
			})
			.catch(function (error) {
				console.log(error);
				layer.closeAll('loading');
					
			});
			return false;
		});
		

	});