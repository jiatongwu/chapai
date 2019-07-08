<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />

	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	<title></title>
	<jsp:include page="/WEB-INF/jsp/common/header_css.jsp"></jsp:include>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/static/css/login.css" />

</head>

<body class="bg"
	style="background: url('${pageContext.request.contextPath }/static/img/bg.jpg') no-repeat center center;background-size: cover;background-attachment: fixed;height: 100%;">

	<input type="text" hidden id="contextPath" value="${pageContext.request.contextPath }" />
	<div class="box">
		<div class="logo">
			<!-- <img src="/static/img/logo.png" /> -->体检系统</div>
		<form class="layui-form layui-form-pane"  style="width:350px;">
			<div class="layui-form-item">
				<label class="layui-form-label">用户名</label>
				<div class="layui-input-block">
					<input type="text" name="username" lay-verify="username" placeholder="请输入用户名" autocomplete="off"
						class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">密码</label>
				<div class="layui-input-block">
					<input type="password" name="password" lay-verify="password" placeholder="请输入密码" autocomplete="off"
						class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">验证码</label>
				<div class="layui-input-inline">
					<input type="text" name="image" lay-verify="captcha" placeholder="请输入验证码" autocomplete="off"
						class="layui-input">
				</div>
				<img title="点击刷新" class="captcha" src="${pageContext.request.contextPath }/getValidateCode/image?length=5&width=550&height=80&fontSize=85&jiange=65" "
					onclick="this.src='${pageContext.request.contextPath }/getValidateCode/image?length=5&width=550&height=80&fontSize=85&jiange=65&v=' + Math.random()">
			</div>
			<div class="layui-form-item">
				<button class="layui-btn layui-btn-normal layui-btn-fluid" lay-submit lay-filter="login">登录</button>
			</div>
		</form>
	</div>

</body>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/index.js"></script>
<script>
<sec:authorize access="isAuthenticated()">
console.log(" is not null");
window.location.href="${pageContext.request.contextPath }/index.html";
</sec:authorize>

var contextPath=$("#contextPath").val();
layui.use([ 'jquery', 'form', 'layer' ], function() {

	var $ = layui.$;
	var form = layui.form;
	var layer = layui.layer;

	/** 自定义验证规则 */
	form.verify({
		username : [ /[\S]+/, '请输入用户名' ],
		//password : [ /[\S]+/, '请输入密码' ],
		captcha : [ /[\S]+/, '请输入验证码' ]
	});

	/** 登录 */
	// 默认焦点
	$('.box input[name = "username"]').focus();
	// 登录
	form.on('submit(login)', function(data) {
		$.ajax({
			url : contextPath+'/loginProcessingUrl',
			type : 'post',
			data : data.field,
			dataType : 'json',
			beforeSend : function() {
				layer.load(2);
			},
			success : function(data) {
				layer.closeAll('loading');
				if (data.code == 0) {
					//jumpToUrl( contextPath +data.url);
					window.location.href=contextPath+"/index.html";
				} else  {
					var message = data.message;
					var alertMessage = '操作失败,请联系管理员';
					if (message.length > 0) {
						alertMessage = '';
						for (var i = 0; i < message.length; i++) {
							alertMessage = alertMessage.concat(message[i] + " ");
						}
					}

					layer.msg(alertMessage, {
						icon: 5,
						shift: 6
					});




					//showFailMsg(data.message);
					$('.box .captcha').click();
					$('.box input[name = "image"]').val('');
				}
			}
		});
		return false;
	});

});

</script>

</html>