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
                        <label class="layui-form-label">姓名</label>
                        <div class="layui-input-inline">
                            <input type="text" name="name" id="name" placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">出生日期起始</label>
                        <div class="layui-input-inline">
                            <input type="text" class="layui-input" id="test1" name="birthdayStart"/>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">出生日期结束</label>
                        <div class="layui-input-inline">
                            <input type="text" class="layui-input" id="test2" name="birthdayEnd"/>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">预约号起始</label>
                        <div class="layui-input-inline">
                            <input type="number" step="1" class="layui-input" id="regCodeStart" name="regCodeStart"/>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">预约号结束</label>
                        <div class="layui-input-inline">
                            <input type="number" step="1" class="layui-input" id="regCodeEnd" name="regCodeEnd"/>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">预约号</label>
                        <div class="layui-input-inline">
                            <input type="text" class="layui-input" id="regCode" name="regCode"/>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">预约号被删除</label>
                        <div class="layui-input-inline">
                            <select name="isRegCodeDeleted" id="isRegCodeDeleted">
                                <option value=""></option>
                                <option value="1">被删除</option>
                                <option value="0">没有被删除</option>
                            </select>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">报名电话</label>
                        <div class="layui-input-inline">
                            <input type="text" name="phone" id="phone" placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">身份证号</label>
                        <div class="layui-input-inline">
                            <input type="text" name="idcard" id="idcard" placeholder=""
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">户籍</label>
                        <div class="layui-input-inline">
                            <select name="census" id="census">
                                <option value=""></option>
                                <c:forEach var="tmp" items="${censuses}">
                                    <option value="<c:out value="${tmp}" />"><c:out value="${tmp}"/></option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">报名时间排序</label>
                        <div class="layui-input-inline">
                            <select name="createTimeAsc" id="createTimeAsc">
                                <option value=""></option>
                                <option value="1">升序</option>
                                <option value="0">降序</option>
                            </select>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">初审状态</label>
                        <div class="layui-input-inline">
                            <select name="chushenStatus" id="chushenStatus">
                                <option value=""></option>
                                <c:forEach var="tmp" items="${firstTrialStatus}">
                                    <option value="<c:out value="${tmp.status}" />"><c:out
                                            value="${tmp.name}"/></option>
                                </c:forEach>
                                <option value="11">未进行初审</option>
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
                <a href="javascript:;" id="exportStudent" class="layui-btn layui-btn-normal">根据搜索条件导出报名信息</a>
            </div>
            <table id="table" lay-filter="table"></table>
            <script type="text/html" id="bar">
                <a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-normal" lay-event="viewPage">查看</a>
                <a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-normal" lay-event="shenhe">审核</a>
                <a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-normal" lay-event="emptyRegCode">删除预约号</a>
                <%--<a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-normal" lay-event="regeneratorRegCode">重新生成预约号</a>--%>

            </script>
        </div>
    </div>
</div>
</body>
<style>
    .layui-form-label {
        width: 120px;
    }
</style>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>
<script
        src="${pageContext.request.contextPath }/static/js/signup/signup_listPage.js"></script>
<script>

</script>
</html>
