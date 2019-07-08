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
        <input name="id" value="${chepai.id}" hidden/>

        <div class="layui-form-item">
            <label class="layui-form-label">联系人</label>
            <div class="layui-input-inline">
                <select name="personId" id="personId" lay-search>
                    <option value=""></option>
                    <c:forEach var="tmp" items="${persons}">
                        <option value="<c:out value="${tmp}" />"><c:out value="${tmp}"/></option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">车型</label>
            <div class="layui-input-inline">
                <select name="chexing" id="chexing">
                    <option value=""></option>
                    <c:forEach var="tmp" items="${chexings}">
                        <option value="<c:out value="${tmp}" />"><c:out value="${tmp}"/></option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">车牌号</label>
            <div class="layui-input-inline">
                <input type="text" name="chepaihao"
                       value="" lay-verify="required"
                       autocomplete="off" class="layui-input"/>
            </div>
            <div class="layui-form-mid layui-word-aux">*</div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">有效起日</label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" id="validStart" value="" name="validStart" lay-verify="required"/>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">有效止日</label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" id="validEnd" value="" name="validEnd" lay-verify="required"/>
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
</style>
<script src="${pageContext.request.contextPath }/static/js/chepai/chepai_addPage.js"></script>
<script>
</script>
</html>
