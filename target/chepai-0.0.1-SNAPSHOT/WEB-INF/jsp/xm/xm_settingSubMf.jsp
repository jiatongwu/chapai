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
</head>
<body>
<input type="text" hidden id="contextPath"
       value="${pageContext.request.contextPath }"/>

<br/>
<div id="addApp">
    <h2>设置${txms.xm}各科满分值</h2>
    <form class="layui-form">

        <input type="text" hidden name="xmid" value="${txms.xmid}"/>
        <c:forEach items="${subs}" var="sub">
            <div class="layui-form-item">
                <label class="layui-form-label">${sub.sub}</label>
                <div class="layui-input-inline">
                    <input type="text" name="${sub.subid}" placeholder="" autocomplete="off"
                           value="<fmt:formatNumber type="number" value="${sub.score }" maxFractionDigits="0"/>" class="layui-input">
                </div>
            </div>
        </c:forEach>
        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <div class="layui-input-inline">
                <button class="layui-btn layui-btn-normal" lay-submit lay-filter="update">提交</button>
            </div>
        </div>
    </form>
</div>
</body>
<style>
    /* .layui-form-label {
            width:90px;
        } */
</style>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>
<script
        src="${pageContext.request.contextPath }/static/js/xm/xm_settingSubMf.js"></script>
<script>

</script>
</html>