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
<div class="layui-card">
    <div class="layui-card-body">
        <div class="layui-card">
            <form class="layui-form ">
                <div class="layui-form-item">
                    <div class="layui-inline">
                        <label class="layui-form-label">项目名称</label>
                        <div class="layui-input-inline">
                            <input type="text" name="name" placeholder="" autocomplete="off"
                                   class="layui-input">
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label"></label>
                        <div class="layui-input-inline">
                            <button class="layui-btn layui-btn-normal" lay-submit
                                    lay-filter="query">查询
                            </button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
        <div class="">
            <div class="layui-block">
                <%--<a href="javascript:;" id="add" class="layui-btn layui-btn-normal">新增</a>--%>
                <table id="table" lay-filter="table"></table>
                <script type="text/html" id="bar">
                    <a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-normal"
                       lay-event="exportExcel">各班统计报表导出</a>
                  <a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-normal" lay-event="settingSubMf">设置各科满分值</a>
                      <%--  <a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-danger" lay-event="delete">删除</a>--%>
                </script>
            </div>
        </div>
    </div>
</body>
<style>
    /* .layui-form-label {
            width:90px;
        } */
</style>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>
<script
        src="${pageContext.request.contextPath }/static/js/xm/xm_index.js"></script>
<script>

</script>
</html>