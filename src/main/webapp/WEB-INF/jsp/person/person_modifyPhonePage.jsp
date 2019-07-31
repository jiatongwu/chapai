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
<div id="addApp">
    <form class="layui-form">
        <input name="userno" value="${person.userno}" hidden/>
        <div class="layui-form-item">
            <label class="layui-form-label">联系人姓名</label>
            <div class="layui-input-inline">
                <input type="text" name="personName" readonly
                       value="${person.username }"
                       autocomplete="off" class="layui-input"/>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">联系人手机号</label>
            <div class="layui-input-inline">
                <input type="text" name="phone"
                       value="${person.mobnumber }"
                       autocomplete="off" class="layui-input"/>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <div class="layui-input-inline">
                <%-- <c:if test="${comFromFastInput =='1'}">
                     <a class="layui-btn layui-btn-normal" id="returnToFastInputPage">返回</a>
                 </c:if>--%>
                <button class="layui-btn layui-btn-normal" lay-submit
                        lay-filter="update">提交
                </button>
            </div>
        </div>
    </form>
</div>
</body>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>
<style>

    .layui-form-label {
        width: 160px;
    }

</style>
<script src="${pageContext.request.contextPath }/static/js/person/person_modifyPhonePage.js"></script>
<script>
</script>
</html>
