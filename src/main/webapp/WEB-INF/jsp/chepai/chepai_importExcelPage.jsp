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
<style>
.layui-form-label {
	width: 120px;
}
</style>

<jsp:include page="/WEB-INF/jsp/common/header_css.jsp"></jsp:include>
</head>
<body style="min-width: auto !important;">
	<input type="text" hidden id="contextPath"
		value="${pageContext.request.contextPath }" />
	<div id="addApp" style="margin-left: 80px;">
		<fieldset class="layui-elem-field layui-field-title"
			style="margin-top: 30px;">
			<legend style="font-size: 15px;">**请先下载excel模板，填写车牌信息后，进行导入操作**</legend>
		</fieldset>

		<div>
			<button type="button" class="layui-btn" id="downloadTemplate">下载模板</button>
		</div>
		<br /> <br />

		<div class="layui-upload">
			<button type="button" class="layui-btn layui-btn-normal" id="test8">选择文件</button>
			<div>待上传文件：</div>
			<div id="fileNameDiv" style="height: 10px;">无</div>
			<br /> <br />
			<button type="button" class="layui-btn" id="test9">开始上传</button>
			<div id="messageDiv" style="height: 10px;"></div>
		</div>
	</div>
</body>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>
<script
	src="${pageContext.request.contextPath }/static/js/chepai/chepai_importExcelPage.js"></script>
</html>
