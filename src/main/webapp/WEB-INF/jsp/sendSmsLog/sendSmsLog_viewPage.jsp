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

    <jsp:include page="/WEB-INF/jsp/common/header_css.jsp"></jsp:include>
    <style>
        .layui-col-xs3 {
            height: 20px;
        }
    </style>
</head>
<body style="min-width: auto !important;">
<input type="text" hidden id="contextPath"
       value="${pageContext.request.contextPath }"/>
<br/>
<fieldset class="layui-elem-field">
    <legend style="width:220px;border-bottom:none;">发送短信详情</legend>
    <div class="layui-field-box">
        <div class="layui-row">
            <div class="layui-col-xs3">
                操作人:
            </div>
            <div class="layui-col-xs9">
                ${sendSmsLog.name}
            </div>
        </div>
        <br/>
        <div class="layui-row">
            <div class="layui-col-xs3">
                操作时间:
            </div>
            <div class="layui-col-xs9">
                <fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${sendSmsLog.createtime}"/>
            </div>
        </div>
        <br/>
        <div class="layui-row">
            <div class="layui-col-xs3">
                车牌号所有人姓名:
            </div>
            <div class="layui-col-xs9">
                ${sendSmsLog.ownerName}
            </div>

        </div>
        <br/>
        <div class="layui-row">
            <div class="layui-col-xs3">
                车牌号所有人手机:
            </div>
            <div class="layui-col-xs9">
                ${sendSmsLog.phone}
            </div>
        </div>
        <br/>
        <div class="layui-row">
            <div class="layui-col-xs3">
                车牌号:
            </div>
            <div class="layui-col-xs9">
                ${sendSmsLog.cph}
            </div>

        </div>
        <br/>
        <div class="layui-row">
            <div class="layui-col-xs3">
                短信内容:
            </div>
            <div class="layui-col-xs9">
                ${sendSmsLog.sms_message}
            </div>
        </div>
        <br/>
        <br/>
    </div>
</fieldset>

</body>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>
<script>
    var contextPath = $("#contextPath").val();
    layui.config({
        base: contextPath + '/static/'
    }).extend({
        common: 'js/common'
    }).use(['common', 'code', 'jquery', 'form', 'table', 'layer', 'element'], function () {
        var common = layui.common;
        var $ = layui.$;
        var form = layui.form;
        var table = layui.table;
        var layer = layui.layer;
        var element = layui.element;


    });
</script>
</html>