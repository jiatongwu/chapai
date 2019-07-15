<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<jsp:include page="/WEB-INF/jsp/common/header_css.jsp"></jsp:include>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/static/css/role.css" />
<style>
input.pw { -webkit-text-security: none; } 
input.pw { -webkit-text-security: circle; } 
input.pw { -webkit-text-security: square; } 
input.pw { -webkit-text-security: disc; /* Default */ }
</style>
</head>
<body>
		<input type="text" hidden id="contextPath" value="${pageContext.request.contextPath }" />
	<form class="layui-form popup" autocomplete="off">
		
		<div class="layui-form-item">
			<label class="layui-form-label" style="width: 120px;">用户名</label>
			<div class="layui-input-inline">
				<input type="text" value="${loginUserInformation.user.username }" readonly class="layui-input">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label" style="width: 120px;">请输入原密码</label>
			<div class="layui-input-inline">
	
				<input type="password" readonly onfocus="this.removeAttribute('readonly');"
				onblur="this.setAttribute('readonly','readonly');" id="oldPwd" name="oldPassword" lay-verify="required|oldPwd"  autocomplete="new-password" class="layui-input pw">
			</div>
			<div class="layui-form-mid layui-word-aux">必填</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label" style="width: 120px;">请输入新密码</label>
			<div class="layui-input-inline">
				<input type="password"  id="newPwd1" name="password" lay-verify="required|newPwd1" placeholder="请输入新密码" autocomplete="new-password" readonly onfocus="this.removeAttribute('readonly');"
				onblur="this.setAttribute('readonly','readonly');" class="layui-input pw">
			</div>
			<div class="layui-form-mid layui-word-aux">必填</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label" style="width: 120px;">请再次输入新密码</label>
			<div class="layui-input-inline">
				<input type="password" readonly onfocus="this.removeAttribute('readonly');"
				onblur="this.setAttribute('readonly','readonly');"  id="newPwd2" name="password2" lay-verify="required|newPwd2" placeholder="再次输入新密码" autocomplete="new-password" class="layui-input pw">
			</div>
			<div class="layui-form-mid layui-word-aux">必填</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label"></label>
			<div class="layui-input-inline">
				<button class="layui-btn layui-btn-normal" lay-submit lay-filter="update">提交</button>
		</div>
	</form>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/user/user_modifyPwdPage.js"></script>
</body>
<script>
$("#oldPwd").val("");
</script>
</html>