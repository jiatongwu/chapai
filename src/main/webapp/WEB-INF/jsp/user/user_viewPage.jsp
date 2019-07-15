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
		<form class="layui-form">
			<div class="layui-form-item">
				<label class="layui-form-label">姓名</label>
				<div class="layui-input-inline">
					<input type="text" name="" lay-verify="required" placeholder="" autocomplete="off"
						class="layui-input" readonly value="${student.name}" />
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">性别</label>
				<div class="layui-input-inline">
					<input type="text" name="" lay-verify="required" placeholder="" autocomplete="off"
						class="layui-input" readonly value="${student.gender}" />
				</div>
			</div>

			
			<div class="layui-form-item">
				<label class="layui-form-label">区县</label>
				<div class="layui-input-inline">
					<input type="text" name="" lay-verify="required" placeholder="" autocomplete="off"
					 	class="layui-input" readonly  value="${student.countyName}" />
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">乡镇</label>
				<div class="layui-input-inline">
					<input type="text" name="" lay-verify="required" placeholder="" autocomplete="off"
					 	class="layui-input" readonly  value="${student.xiangName}" />
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">毕业学校</label>
				<div class="layui-input-inline">
					<input type="text" name="" lay-verify="required" placeholder="" autocomplete="off"
					 	class="layui-input" readonly  value="${student.schoolName}" />
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">家庭住址</label>
				<div class="layui-input-inline">
					<input type="text" name="" lay-verify="required" placeholder="" autocomplete="off"
					 	class="layui-input" readonly  value="${student.homeAddress}" />
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">手机号</label>
				<div class="layui-input-inline">
					<input type="text" name="" lay-verify="required" placeholder="" autocomplete="off"
					 	class="layui-input" readonly  value="${student.phone1}" />
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">备用手机号</label>
				<div class="layui-input-inline">
					<input type="text" name="" lay-verify="required" placeholder="" autocomplete="off"
					 	class="layui-input" readonly  value="${student.phone2}" />
				</div>
			</div>
		
		
		</form>
	



</body>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>
<script>
	var contextPath = $("#contextPath").val();
	layui.config({
		base : contextPath + '/static/'
	}).extend({
		common : 'js/common'
	}).use([ 'common', 'code','jquery', 'form', 'table', 'layer', 'element' ], function() {
		var common = layui.common;
			var $ = layui.$;
	var form = layui.form;
	var table = layui.table;
	var layer = layui.layer;
	var element = layui.element;


	
	

	});
</script>
</html>