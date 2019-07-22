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
                        <label class="layui-form-label">车牌号</label>
                        <div class="layui-input-inline">
                            <input type="text" name="cph" id="cph" placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">操作人</label>
                        <div class="layui-input-inline">
                            <input type="text" name="personName" id="personName" placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">违规开始时间</label>
                        <div class="layui-input-inline">
                            <input type="text" class="layui-input test-item" name="startTime" id="startTime"/>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">违规结束时间</label>
                        <div class="layui-input-inline">
                            <input type="text" class="layui-input test-item" name="endTime" id="endTime"/>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">创建时间排序</label>
                        <div class="layui-input-inline">
                            <select name="createTimeAsc" id="createTimeAsc">
                                <option value=""></option>
                                <option value="1">升序</option>
                                <option value="0" selected>降序</option>
                            </select>
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
               <%-- <a href="javascript:;" id="add" class="layui-btn layui-btn-normal">添加短信模板</a>--%>
            </div>
            <table id="table" lay-filter="table"></table>
           <%-- <script type="text/html" id="bar">
                <a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-normal" lay-event="edit">修改</a>
                <a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-normal" lay-event="delete">删除</a>
            </script>--%>

            <script type="text/html" id="base64imageTpl">
                <img src="data:image/png;base64, {{d.base64image}}" alt="Red dot" onclick="showImage(this);" />
                <%--<input type="checkbox" myid="{{d.id}}" name="lock" title="禁用" lay-filter="lockDemo" {{ d.disabled == 1 ? 'checked' : '' }}>--%>
            </script>
        </div>
    </div>
</div>
</body>
<style>
    .layui-form-label {
        width: 160px;
    }
</style>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>
<script
        src="${pageContext.request.contextPath }/static/js/weiguijilu/weiguijilu_listPage.js"></script>
<script>

</script>
</html>
