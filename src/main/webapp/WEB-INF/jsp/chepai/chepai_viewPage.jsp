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
        .layui-col-xs3{
            height: 20px;
        }
    </style>
    <jsp:include page="/WEB-INF/jsp/common/header_css.jsp"></jsp:include>
</head>
<body style="">

<input type="text" hidden id="contextPath"
       value="${pageContext.request.contextPath }"/>
<br/>
<div id="addApp" style="width:90%;margin: auto auto;">
    <fieldset class="layui-elem-field">
        <legend style="width:220px;border-bottom:none;">人员信息-${person.username}</legend>
        <div class="layui-field-box">
            <div class="layui-row">
                <div class="layui-col-xs3">
                    姓名:
                </div>
                <div class="layui-col-xs3">
                    ${person.username}
                </div>
                <div class="layui-col-xs3">
                    人员编号:
                </div>
                <div class="layui-col-xs3">
                    ${person.userno}
                </div>
            </div><br/>
            <div class="layui-row">
                <div class="layui-col-xs3">
                    身份证号:
                </div>
                <div class="layui-col-xs3">
                    ${person.idcard}
                </div>
                <div class="layui-col-xs3">
                    手机号:
                </div>
                <div class="layui-col-xs3">
                    ${person.mobnumber}
                </div>
            </div><br/>
            <div class="layui-row">
                <div class="layui-col-xs3">
                    户籍:
                </div>
                <div class="layui-col-xs3">
                    ${person.nativeplace}
                </div>
                <div class="layui-col-xs3">
                    家底住址:
                </div>
                <div class="layui-col-xs3">
                    ${person.homeaddress}
                </div>
            </div><br/>
        </div>
    </fieldset>

    <c:forEach var="car" items="${cars}">
        <fieldset class="layui-elem-field">
            <legend  style="width:120px;border-bottom:none;">${car.cph}</legend>
            <div class="layui-field-box">
                <div class="layui-row">
                    <div class="layui-col-xs3">
                        编号:
                    </div>
                    <div class="layui-col-xs3">
                            ${car.cardno}
                    </div>
                    <div class="layui-col-xs3">
                        车型:
                    </div>
                    <div class="layui-col-xs3">
                            ${car.cartype}
                    </div>
                </div><br/>
                <div class="layui-row">
                    <div class="layui-col-xs3">
                        车牌号:
                    </div>
                    <div class="layui-col-xs3">
                            ${car.cph}
                    </div>
                    <div class="layui-col-xs3">
                        创建时间:
                    </div>
                    <div class="layui-col-xs3">
                        <fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss"
                                        value="${car.carissuedate}" />
                    </div>
                </div><br/>
                <div class="layui-row">
                    <div class="layui-col-xs3">
                        有效起日:
                    </div>
                    <div class="layui-col-xs3">
                        <fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss"
                                        value="${car.carvalidstartdate}" />
                    </div>
                    <div class="layui-col-xs3">
                        有效止日:
                    </div>
                    <div class="layui-col-xs3">
                        <fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss"
                                        value="${car.carvalidenddate}" />
                    </div>
                </div><br/>
            </div>
        </fieldset>
    </c:forEach>


</div>
</body>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>
<style>
</style>
<%--<script src="${pageContext.request.contextPath }/static/js/chepai/chepai_editPage.js"></script>--%>
<script>
</script>
</html>
