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
                        <label class="layui-form-label">联系人姓名</label>
                        <div class="layui-input-inline">
                            <input type="text" name="personName" id="personName" placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">联系人手机号</label>
                        <div class="layui-input-inline">
                            <input type="text" name="personPhone" id="personPhone" placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">车辆编码</label>
                        <div class="layui-input-inline">
                            <input type="text" class="layui-input" id="cheBianma" name="cheBianma"/>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">车型</label>
                        <div class="layui-input-inline">
                            <input type="text" class="layui-input" id="chexing" name="chexing"/>
                          <%--  <select name="chexing" id="chexing">
                                <option value=""></option>
                                <c:forEach var="tmp" items="${chexings}">
                                    <option value="<c:out value="${tmp}" />"><c:out value="${tmp}"/></option>
                                </c:forEach>
                            </select>--%>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">车牌号</label>
                        <div class="layui-input-inline">
                            <input type="text" class="layui-input" id="chepaihao" name="chepaihao"/>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">车辆是否在有效期内</label>
                        <div class="layui-input-inline">
                            <select name="isInDate" id="isInDate">
                                <option value=""></option>
                                <option value="1">在有效期内</option>
                                <option value="0">不在有效期内</option>
                            </select>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">车辆添加时间排序</label>
                        <div class="layui-input-inline">
                            <select name="createTimeAsc" id="createTimeAsc">
                                <option value=""></option>
                                <option value="1">升序</option>
                                <option value="0">降序</option>
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
                <a href="javascript:;" id="add" class="layui-btn layui-btn-normal">添加汽车</a>
                <%-- <a href="javascript:;" id="exportStudent" class="layui-btn layui-btn-normal">根据搜索条件导出报名信息</a>--%>
            </div>
            <table id="table" lay-filter="table"></table>
            <script type="text/html" id="bar">
                <%-- <a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-normal" lay-event="viewPage">查看</a>--%>
                <a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-normal" lay-event="view">查看</a>
                <a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-normal" lay-event="delete">删除</a>
                <%-- <a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-normal" lay-event="emptyRegCode">删除预约号</a>--%>
                <%--<a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-normal" lay-event="regeneratorRegCode">重新生成预约号</a>--%>

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
        src="${pageContext.request.contextPath }/static/js/chepai/chepai_listPage.js"></script>
<script>

</script>
</html>
