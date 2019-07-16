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
                        <label class="layui-form-label">操作者登录账号</label>
                        <div class="layui-input-inline">
                            <input type="text" name="username" id="username" placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">操作者真实姓名</label>
                        <div class="layui-input-inline">
                            <input type="text" name="name" id="name" placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">操作类型</label>
                        <div class="layui-input-inline">
                            <select name="operateName" id="operateName">
                                <option value=""></option>
                                <c:forEach var="tmp" items="${logMessageKeys}">
                                    <option value="<c:out value="${tmp}" />"><c:out value="${tmp}"/></option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">日志创建开始时间</label>
                        <div class="layui-input-inline">
                            <input type="text" class="layui-input test-item" name="startTime" id="startTime"/>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">日志创建结束时间</label>
                        <div class="layui-input-inline">
                            <input type="text" class="layui-input test-item" name="endTime" id="endTime"/>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">车牌联系人手机</label>
                        <div class="layui-input-inline">
                            <input type="text" name="phone" id="phone" placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">车牌号</label>
                        <div class="layui-input-inline">
                            <input type="text" name="cph" id="cph" placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">日志创建时间排序</label>
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
                <a href="javascript:;" id="exportLog" class="layui-btn layui-btn-normal">根据搜索条件导出日志信息</a>
            </div>
            <table id="table" lay-filter="table"></table>
            <script type="text/html" id="bar">
                <a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-normal" lay-event="viewPage">查看详情</a>
            </script>
        </div>
    </div>
</div>


</body>
<style>
    .layui-form-label {
        width: 150px;
    }
</style>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>
<script
        src="${pageContext.request.contextPath }/static/js/log/log_listPage.js"></script>
<script>

</script>
</html>
