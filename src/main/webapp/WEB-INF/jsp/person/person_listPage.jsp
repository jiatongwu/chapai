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
                    <!-- 	String personName = (String) params.get("personName");
		if (StringUtils.isNotBlank(personName)) {
			params.put("personName", "%" + personName + "%");
			where.and(MyjibenziliaoDynamicSqlSupport.username, SqlBuilder.isLike((String) params.get("personName")));
		}
		String personPhone = (String) params.get("personPhone");
		if (StringUtils.isNotBlank(personPhone)) {
			params.put("personPhone", "%" + personPhone + "%");
			where.and(MyjibenziliaoDynamicSqlSupport.mobnumber, SqlBuilder.isLike((String) params.get("personPhone")));
		}
		String personBianma = (String) params.get("personBianma");
		if (StringUtils.isNotBlank(personBianma)) {
			params.put("personBianma", "%" + personBianma + "%");
			where.and(MyjibenziliaoDynamicSqlSupport.userno, SqlBuilder.isLike((String) params.get("personBianma")));
		}
		String jiguan = (String) params.get("jiguan");
		if (StringUtils.isNotBlank(jiguan)) {
			params.put("jiguan", "%" + jiguan + "%");
			where.and(MyjibenziliaoDynamicSqlSupport.nativeplace, SqlBuilder.isLike((String) params.get("jiguan")));
		}
		String homeAddress = (String) params.get("homeAddress");
		if (StringUtils.isNotBlank(homeAddress)) {
			params.put("homeAddress", "%" + homeAddress + "%");
			where.and(MyjibenziliaoDynamicSqlSupport.homeaddress,
					SqlBuilder.isLike((String) params.get("homeAddress")));
		}-->
                    <div class="layui-inline">
                        <label class="layui-form-label">人员编码</label>
                        <div class="layui-input-inline">
                            <input type="text" class="layui-input" id="personBianma" name="personBianma"/>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">籍贯</label>
                        <div class="layui-input-inline">
                            <input type="text" class="layui-input" id="jiguan" name="jiguan"/>
                        </div>
                    </div>
                    <div class="layui-inline">
                        <label class="layui-form-label">家庭住址</label>
                        <div class="layui-input-inline">
                            <input type="text" class="layui-input" id="homeAddress" name="homeAddress"/>
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
                <a href="javascript:;" id="add" class="layui-btn layui-btn-normal">添加人员</a>
                <%-- <a href="javascript:;" id="exportStudent" class="layui-btn layui-btn-normal">根据搜索条件导出报名信息</a>--%>
            </div>
            <table id="table" lay-filter="table"></table>
            <script type="text/html" id="bar">
                <%-- <a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-normal" lay-event="viewPage">查看</a>--%>
                <a href="javascript:;" class="layui-btn layui-btn-xs layui-btn-normal" lay-event="edit">编辑人员</a>
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
        src="${pageContext.request.contextPath }/static/js/person/person_listPage.js"></script>
<script>

</script>
</html>
