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
    <legend style="width:220px;border-bottom:none;">日志信息-${person.username}</legend>
    <div class="layui-field-box">
        <div class="layui-row">
            <div class="layui-col-xs3">
                操作:
            </div>
            <div class="layui-col-xs3">
                ${log.operate_name}
            </div>
            <div class="layui-col-xs3">
                操作人:
            </div>
            <div class="layui-col-xs3">
                ${log.name}
            </div>
        </div>
        <br/>
        <div class="layui-row">
            <div class="layui-col-xs3">
                操作时间:
            </div>
            <div class="layui-col-xs3">
                <fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${log.createtime}"/>
            </div>
            <div class="layui-col-xs3">
                客户端ip:
            </div>
            <div class="layui-col-xs3">
                ${log.client_ip}
            </div>
        </div>
        <br/>
        <div class="layui-row">
            <div class="layui-col-xs3">
                车牌号所有人姓名:
            </div>
            <div class="layui-col-xs3">
                ${log.operate_username}
            </div>
            <div class="layui-col-xs3">
                车牌号所有人手机:
            </div>
            <div class="layui-col-xs3">
                ${log.operate_user_phone}
            </div>
        </div>
        <br/>
        <div class="layui-row">
            <div class="layui-col-xs3">
                车牌号:
            </div>
            <div class="layui-col-xs3">
                ${log.operate_cph}
            </div>
            <div class="layui-col-xs3">
              有效时间止日:
            </div>
            <div class="layui-col-xs3">
                <fmt:formatDate pattern="yyyy-MM-dd" value="${log.validEnd}"/>
            </div>
        </div>
        <br/>
        <div class="layui-row">
            <div class="layui-col-xs1">
                客户端:
            </div>
            <div class="layui-col-xs11">
                ${log.user_agent}
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