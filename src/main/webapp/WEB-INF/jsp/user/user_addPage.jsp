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
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title></title>
<jsp:include page="/WEB-INF/jsp/common/header_css.jsp"></jsp:include>
</head>
<body style="min-width: auto !important;">
	<input type="text" hidden id="contextPath"
		value="${pageContext.request.contextPath }" />
	<br />
	<div id="addApp">
		<form class="layui-form">
			<div class="layui-form-item">
				<label class="layui-form-label">登录名</label>
				<div class="layui-input-inline">
					<input type="text" name="username" lay-verify="required" placeholder="" autocomplete="off"
						class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">必填</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">真实姓名</label>
				<div class="layui-input-inline">
					<input type="text" name="name" lay-verify="required" placeholder="" autocomplete="off"
						   class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">必填</div>
			</div>
			<input type="text" hidden />
			<input type="password" hidden />
			<div class="layui-form-item">
				<label class="layui-form-label">密码</label>
				<div class="layui-input-inline">
					<input type="password" name="password" lay-verify="required" placeholder="" autocomplete="off"
						   class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">必填</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">再次输入密码</label>
				<div class="layui-input-inline">
					<input type="password" name="password2" lay-verify="required" placeholder="" autocomplete="off"
						   class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">必填</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label"></label>
				<div class="layui-input-inline">
					<button class="layui-btn layui-btn-normal" lay-submit lay-filter="save">提交</button>
				</div>
			</div>
		</form>
	</div>




</body>
<style>
	.layui-form-label {
		width:150px;
	}
</style>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>
<script src="${pageContext.request.contextPath }/static/js/user/user_addPage.js"></script>
</html>
