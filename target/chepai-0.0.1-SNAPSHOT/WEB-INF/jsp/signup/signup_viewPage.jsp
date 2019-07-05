<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title></title>
    <jsp:include page="/WEB-INF/jsp/common/header_css.jsp"></jsp:include>
    <style>

        .leftTd {
            text-align: right;
            width: 20%;
        }

        .tableTr {
            height: 35px;
        }

        .rightTd {
            padding-left: 100px;
            text-align: left;
        }

        .imageCenter {
            display: block;
            margin-left: auto;
            margin-right: auto;
            width: 50%;
        }
    </style>
</head>
<body style="min-width: auto !important;">
<input type="text" hidden id="contextPath"
       value="${pageContext.request.contextPath }"/>

<br/>
<div style="margin:0 20px;">
    <div style="margin:auto;width:300px;">
        <c:choose>
            <c:when test="${empty signup.firstTrial }">
            </c:when>
            <c:otherwise>
                <c:if test="${signup.firstTrial ==1 }">
                    <h2 style="color:green;">此学生初审通过</h2>
                </c:if>
                <c:if test="${signup.firstTrial ==2 }">
                    <h2 style="color:red;">此学生初审未通过</h2>
                </c:if>
            </c:otherwise>
        </c:choose>
    </div>
    <ol class="breadcrumb">
        <li>预约信息</li>
    </ol>

    <table width="100%">
        <tr class="tableTr">
            <td class="leftTd">学生姓名:</td>
            <td class="rightTd">${signup.name}</td>
        </tr>
        <tr class="tableTr">
            <td class="leftTd">身份证号:</td>
            <td class="rightTd">${signup.idcard}</td>
        </tr>
        <tr class="tableTr">
            <td class="leftTd">报名预约号:</td>
            <td class="rightTd">${signup.regCode}</td>
        </tr>
        <tr class="tableTr">
            <td class="leftTd">出生年月:</td>
            <td class="rightTd">${signup.birthday}</td>
        </tr>
        <tr class="tableTr">
            <td class="leftTd">户籍:</td>
            <td class="rightTd">${signup.census}</td>
        </tr>
        <tr class="tableTr">
            <td class="leftTd">户口所在地:</td>
            <td class="rightTd">${signup.accountLocation}</td>
        </tr>
        <tr class="tableTr">
            <td class="leftTd">父亲姓名:</td>
            <td class="rightTd">${signup.father}</td>
        </tr>
        <tr class="tableTr">
            <td class="leftTd">工作单位:</td>
            <td class="rightTd">${signup.fatherWorkunit}</td>
        </tr>
        <tr class="tableTr">
            <td class="leftTd">母亲姓名:</td>
            <td class="rightTd">${signup.mother}</td>
        </tr>
        <tr class="tableTr">
            <td class="leftTd">工作单位:</td>
            <td class="rightTd">${signup.motherWorkunit}</td>
        </tr>
        <tr class="tableTr">
            <td class="leftTd">手机:</td>
            <td class="rightTd">${signup.phone}</td>
        </tr>
        <tr class="tableTr">
            <td class="leftTd">固定地址:</td>
            <td class="rightTd">${signup.address}</td>
        </tr>
    </table>


    <ol class="breadcrumb">
        <li>预约信息</li>
    </ol>
    <div>
        <ul id="census_image_files">
            <c:if test="${not empty signup.censusImageFiles}">
                <c:set var="censusImageFilesTmp" value="${fn:split(signup.censusImageFiles,',')}"/>
                <c:forEach items="${censusImageFilesTmp}" var="oneTmp">
                    <li><img width="550" height="320" src="${oneTmp}" alt="" class="imageCenter"/></li>
                    <br/>
                </c:forEach>
            </c:if>
            <br/><br/>
            <c:if test="${not empty signup.birthCertificateImageFiles}">
                <c:set var="birthCertificateImageFilesTmp" value="${fn:split(signup.birthCertificateImageFiles,',')}"/>
                <c:forEach items="${birthCertificateImageFilesTmp}" var="oneTmp">
                    <li><img width="550" height="320" src="${oneTmp}" alt="" class="imageCenter"></li>
                    <br/>
                </c:forEach>
            </c:if>
            <br/><br/>
            <c:if test="${not empty signup.houseCeritificateImageFiles}">
                <c:set var="houseCeritificateImageFilesTmp"
                       value="${fn:split(signup.houseCeritificateImageFiles,',')}"/>
                <c:forEach items="${houseCeritificateImageFilesTmp}" var="oneTmp">
                    <li><img width="550" height="320" src="${oneTmp}" alt="" class="imageCenter"></li>
                    <br/>
                </c:forEach>
            </c:if>
        </ul>


    </div>
    <div class="layui-block">
        <div style="margin:auto;width:400px;" id="chushenStatusDiv">
            <c:choose>
                <c:when test="${empty signup.firstTrial }">
                </c:when>
                <c:otherwise>
                    <c:if test="${signup.firstTrial ==1 }">
                        <h2 style="color:green;">此学生初审通过</h2>
                    </c:if>
                    <c:if test="${signup.firstTrial ==2 }">
                        <h2 style="color:red;">此学生初审未通过</h2>
                    </c:if>
                </c:otherwise>
            </c:choose>
            <div class="layui-form-item layui-form-text">
                <label class="layui-form-label">审核意见</label>
                <div class="layui-input-block">
                    <textarea name="yijian" id="yijian" readonly placeholder="" class="layui-textarea">${signup.firstTrialInformation}</textarea>
                </div>
            </div>
        </div>
    </div>
</div>


</body>
<style>
    .layui-form-label {
        width: 90px;
    }
</style>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>
<script>

    new Viewer(document.getElementById('census_image_files'));

    var contextPath = $("#contextPath").val();
    layui.config({
        base: contextPath + '/static/'
    }).extend({
        common: 'js/common'
    }).use(['common', 'code', 'jquery', 'form', 'table', 'layer', 'element'], function () {
        var common = layui.common;
        var $ = layui.$;
        var form = layui.form;
        var table = layui.table;
        var layer = layui.layer;
        var element = layui.element;


    });
</script>
</html>