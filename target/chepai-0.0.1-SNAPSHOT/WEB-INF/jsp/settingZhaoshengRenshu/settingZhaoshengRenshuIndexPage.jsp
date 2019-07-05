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
<div style="width:500px;margin:auto;">
    <input type="text" hidden id="contextPath"
           value="${pageContext.request.contextPath }"/>
    <br/><br/>
    <h2>设置招生人数</h2>
    <br/><br/>
    <form class="layui-form">

        <div class="layui-form-item">
            <label class="layui-form-label">招生人数</label>
            <div class="layui-input-inline">


                <input type="number" step="1" name="value" placeholder="" autocomplete="off"
                       value="${zhaoshengRenshu.value}"
                       class="layui-input" lay-verify="required"/>


            </div>
            <div class="layui-form-mid layui-word-aux">人</div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <div class="layui-input-inline">
                <button class="layui-btn layui-btn-normal" lay-submit lay-filter="update">确认</button>
            </div>
        </div>
    </form>
</div>
</body>
<style>
    .layui-form-label {
        width: 110px;
    }
</style>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>
<script
        src="${pageContext.request.contextPath }/static/js/settingZhaoshengRenshu/settingZhaoshengRenshuIndexPage.js"></script>
<script>

</script>
</html>