<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title></title>
    <style>
    </style>
    <jsp:include page="/WEB-INF/jsp/common/header_css.jsp"></jsp:include>
</head>
<body style="min-width: auto !important;">
<input type="text" hidden id="contextPath"
       value="${pageContext.request.contextPath }"/>
<br/>
<div id="addApp" style="padding: 10px 10px;">
    <form class="layui-form layui-form-pane">
        <div class="layui-form-item">
            <label class="layui-form-label">模板名称</label>
            <div class="layui-input-inline">
                <input type="text" name="name"
                       value="" lay-verify="required"
                       autocomplete="off" class="layui-input"/>
            </div>
            <div class="layui-form-mid layui-word-aux">*</div>
        </div>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">短信模板内容 车牌号使用${'${'}cph}替代 汽车所有人姓名使用${'${'}personName}替代</label>
            <div class="layui-input-block">
                <textarea name="content" placeholder="请输入短信模板"   lay-verify="required" class="layui-textarea"></textarea>
            </div>
        </div>
        <div class="layui-form-item">
            <button class="layui-btn layui-btn-normal" lay-submit
                    lay-filter="update">提交
            </button>
        </div>
    </form>
</div>
</body>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>
<style>
</style>
<script src="${pageContext.request.contextPath }/static/js/smsTemplate/smsTemplate_addPage.js"></script>
<script>
</script>
</html>
