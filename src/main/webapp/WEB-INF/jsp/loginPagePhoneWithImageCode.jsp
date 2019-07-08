<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <title></title>
    <jsp:include page="/WEB-INF/jsp/common/header_css.jsp"></jsp:include>
    <link type="text/css" rel="stylesheet"
          href="${pageContext.request.contextPath }/static/css/login.css"/>
</head>
<body class="bg"
      style="background: url('${pageContext.request.contextPath }/static/img/bg.jpg') no-repeat center center;background-size: cover;background-attachment: fixed;height: 100%;">
<input type="text" hidden id="contextPath"
       value="${pageContext.request.contextPath }"/>
<div class="box">
    <div class="logo">
        <!-- <img src="/static/img/logo.png" /> -->
        报名系统
    </div>
    <form class="layui-form layui-form-pane" style="width:350px;">
        <div class="layui-form-item">
            <label class="layui-form-label">手机号</label>
            <div class="layui-input-block">
                <input type="text" name="mobile" lay-verify="phone" id="mobile"
                       placeholder="请输入手机号" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">图形验证码</label>
            <div class="layui-input-block">
                <img title="点击刷新" class="captcha" id="imageCodeId"
                     src="${pageContext.request.contextPath }/getValidateCode/image?length=5&width=550&height=80&fontSize=85&jiange=65" onclick="changeImage();"
                     style="display: inline; width: 100%;"/>

            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">图形验证码</label>
            <div class="layui-input-block">
                <input type="text" name="imageCode" id="imageCode"
                       - placeholder="" autocomplete="off" class="layui-input"
                       - style="display: inline; width: 48%;">
                <button type="button" id="sendSmsButton"
                        class="layui-btn layui-btn-primary"
                        style="display: inline; width: 50%;">发送短信
                </button>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">短信验证码</label>
            <div class="layui-input-block">
                <input type="text" name="sms"  id="sms"
                       placeholder="请输入短信验证码" autocomplete="off" class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <button class="layui-btn layui-btn-normal layui-btn-fluid"
                    lay-submit lay-filter="login">登录
            </button>
        </div>
    </form>
</div>
</body>
<jsp:include page="/WEB-INF/jsp/common/body_script.jsp"></jsp:include>

<script type="text/javascript"
        src="${pageContext.request.contextPath }/static/js/index.js"></script>
<script>
    var contextPath = $("#contextPath").val();

    function changeImage() {
        $("#imageCodeId").attr("src", contextPath + '/getValidateCode/image?length=5&width=550&height=80&fontSize=85&jiange=65&v=' + Math.random());
    }

    <sec:authorize access="isAuthenticated()">
    console.log(" is not null");
    window.location.href = "${pageContext.request.contextPath }/index.html";
    </sec:authorize>

    layui.use(['jquery', 'form', 'layer'], function () {
        var $ = layui.$;
        var form = layui.form;
        var layer = layui.layer;
        /** 自定义验证规则 */
        form.verify({
            phone: [/[\S]+/, '请输入手机号'],
            //password : [ /[\S]+/, '请输入密码' ],
            sms: [/[\S]+/, '请输入短信验证码']
        });
        /** 登录 */
        // 默认焦点
        $('.box input[name = "phone"]').focus();
        var count = 60;
        var flag = null;

        function show() {
            if (count <= 0 && flag != null) {
                clearInterval(flag);
                flag = null;
                count = 60;
                $("#sendSmsButton").html("发送验证码");
                $("#sendSmsButton").addClass("layui-btn-primary");
                $("#sendSmsButton").removeClass("layui-btn-disabled");
                $("#sendSmsButton").attr('disabled', false);

            } else {
                $("#sendSmsButton").html(count);
                count--;
            }
        }

        /** 弹出 增加页面 */
        $('#sendSmsButton').on('click', function () {
            //发送验证码 如果成功显示倒计时
            var mobile = $("#mobile").val();
            var imageCode = $("#imageCode").val();
            if (!(mobile != null && mobile != undefined && mobile != '')) {
                layer.msg("请输入手机号", {
                    icon: 5,
                    shift: 6
                });
                return;
            }
            var sendOk = false;
            var sendSmsReturnData = {};
            $.ajax({
                url: contextPath + '/getValidateCode/sms?mobile=' + mobile + '&image=' + imageCode,
                type: 'get',
                async: false,
                beforeSend: function () {
                    layer.load(2);
                },
                success: function (data) {
                    layer.closeAll('loading');
                    sendSmsReturnData = data;
                    if (data.code == 0) {
                        sendOk = true;
                        //jumpToUrl( contextPath +data.url);
                        //window.location.href=contextPath+"/index.html";
                    } else {
                        //showFailMsg(data.message);
                        //$('.box .captcha').click();
                        //$('.box input[name = "captcha"]').val('');
                    }
                }
            });
            if (sendOk) {
                //alert("发送成功，请查看手机短信");
                layer.msg("发送成功，请查看手机短信", {
                    icon: 6
                });
                $("#smsid").val("");
                $("#sendSmsButton").attr('disabled', true);
                $("#sendSmsButton").addClass("layui-btn-disabled");
                $("#sendSmsButton").removeClass("layui-btn-primary");
                flag = setInterval(show, 1000);
            } else {
                $("#imageCodeId").attr("src", contextPath + '/getValidateCode/image?length=5&width=550&height=80&fontSize=85&jiange=65&v=' + Math.random());
                //alert("发送短信失败");
                var message = sendSmsReturnData.message;
                var alertMessage = '操作失败,请联系管理员';
                if (message != null && message != undefined && message.length > 0) {
                    alertMessage = '';
                    for (var i = 0; i < message.length; i++) {
                        alertMessage = alertMessage.concat(message[i] + " ");
                    }
                }
                layer.msg(alertMessage, {
                    icon: 5,
                    shift: 6
                });

            }
        });
        // 登录
        form.on('submit(login)', function (data) {
            $.ajax({
                url: contextPath + '/mobileLoginProcessingUrl',
                type: 'post',
                data: data.field,
                dataType: 'json',
                beforeSend: function () {
                    layer.load(2);
                },
                success: function (data) {
                    layer.closeAll('loading');
                    console.log(data);
                    if (data.code == 0) {
                        //jumpToUrl( contextPath +data.url);
                        window.location.href = contextPath + "/index.html";
                    } else {
                        if (flag != null) {
                            clearInterval(flag);
                            flag = null;
                            count = 60;
                            $("#sendSmsButton").html("发送验证码");
                            $("#sendSmsButton").addClass("layui-btn-primary");
                            $("#sendSmsButton").removeClass("layui-btn-disabled");
                        }
                        showFailMsg(data.message[0]);

                        //$('.box .captcha').click();
                        //$('.box input[name = "captcha"]').val('');
                    }
                }
            });
            return false;
        });
    });
</script>
</html>