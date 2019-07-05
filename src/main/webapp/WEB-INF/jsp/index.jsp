<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title></title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath }/static/layui/css/layui.css"/>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath }/static/lau/lau.css">
    <script>
        (window.top === window.self)
        || (window.top.location.href = window.self.location.href);
    </script>
</head>
<body class="layui-layout-body layui-unselect">
<input type="text" hidden id="contextPath"
       value="${pageContext.request.contextPath }"/>
<div class="layui-layout layui-layout-admin">
    <!--顶部导航开始-->
    <div class="layui-header">
        <a class="layui-logo">府兴小学招生预约系统</a>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item" style="margin-right: 35px;" lay-unselect>
                <a href="javascript:;"> <!-- <img src="http://t.cn/RCzsdCq" class="layui-nav-img"> -->欢迎
                    <sec:authentication property="principal.username"/>
                </a>
                <dl class="layui-nav-child">
                    <!--  <dd><a>基本资料</a></dd>
                    <dd>
                        <a href="javascript:;">修改密码</a>
                    </dd> -->
                    <dd>
                        <a href="javascript:logout();">安全退出</a>
                    </dd>
                </dl>
            </li>
        </ul>
    </div>
    <!--顶部导航结束-->

    <!--侧边菜单开始-->
    <div class="layui-side">
        <!-- data-href="/json/menu.json" -->
        <!-- <div class="lau-side-fold"><i class="layui-icon layui-icon-shrink-right"></i></div>  -->
        <div class="layui-side-scroll">
            <ul class="layui-nav layui-nav-tree">
                <!--这里可以写菜单结构,也可以放空,使用异步加载-->
                <li class="lau-nav-item"><a class="lau-nav-header layui-this"
                                            lau-href="${pageContext.request.contextPath }/welcome.html"> <i
                        class="layui-icon layui-icon-home"></i><cite>首页</cite>
                </a></li>


                <sec:authorize access="hasRole('school_manager')">
                    <li class="lau-nav-item"><a class="lau-nav-header"><i
                            class="layui-icon layui-icon-right"></i><cite>学生信息</cite></a>
                        <dl class="lau-nav-child">
                            <dd style="">
                                <a style="padding-left: 20px;"
                                   lau-href="${pageContext.request.contextPath }/browser/signup/listPage.html"><i
                                        class="layui-icon layui-icon-circle"></i><cite>报名列表</cite></a>
                            </dd>
                            <dd style="">
                                <a style="padding-left: 20px;"
                                   lau-href="${pageContext.request.contextPath }/settingZhaoshengRenshuIndex.html"><i
                                        class="layui-icon layui-icon-circle"></i><cite>招生人数设置</cite></a>
                            </dd>
                            <dd style="">
                                <a style="padding-left: 20px;"
                                   lau-href="${pageContext.request.contextPath }/settingZhaoShengTimeIndex.html"><i
                                        class="layui-icon layui-icon-circle"></i><cite>招生时间设置</cite></a>
                            </dd>
                        </dl>
                    </li>
                </sec:authorize>

                <%-- <li class="lau-nav-item"><a class="lau-nav-header"><i
                        class="layui-icon layui-icon-right"></i><cite>项目文档</cite></a>
                <dl class="lau-nav-child">
                    <dd><a lau-href="${pageContext.request.contextPath }/doc/quickstart.html"><i
                                class="layui-icon layui-icon-circle"></i><cite>快速开始</cite></a></dd>
                    <dd><a lau-href="${pageContext.request.contextPath }/doc/menu.html"><i
                                class="layui-icon layui-icon-circle"></i><cite>菜单操作</cite></a></dd>
                    <dd><a lau-href="${pageContext.request.contextPath }/doc/tabs.html"><i
                                class="layui-icon layui-icon-circle"></i><cite>标签操作</cite></a></dd>
                    <dd><a lau-href="${pageContext.request.contextPath }/doc/other.html"><i
                                class="layui-icon layui-icon-circle"></i><cite>其他操作</cite></a></dd>
                    <dd><a lau-href="${pageContext.request.contextPath }/doc/changelog.html"><i
                                class="layui-icon layui-icon-circle"></i><cite>更新日志</cite></a></dd>
                    <dd><a lau-href="http://www.baidu.com"><i
                                class="layui-icon layui-icon-circle"></i><cite>授权说明</cite></a></dd>
                </dl>
            </li> --%>

                <%-- <c:forEach items="${sessionScope.loginUserInformation.menuTree }"
                    var="oneMenu">
                    <li class="lau-nav-item"><a class="lau-nav-header"><i
                            class="layui-icon layui-icon-right"></i><cite>${oneMenu.name }</cite></a>
                        <dl class="lau-nav-child">
                            <c:forEach items="${oneMenu.children }" var="oneListMenu">
                                <c:set var="dateParts"
                                    value="${fn:split(oneListMenu.url, ',')}" />
                                <dd style="">
                                    <a style="padding-left: 20px;"
                                        lau-href="${pageContext.request.contextPath }${dateParts[0] }"><i
                                        class="layui-icon layui-icon-circle"></i><cite>${oneListMenu.name }</cite></a>
                                </dd>
                            </c:forEach>
                        </dl></li>
                </c:forEach> --%>
                <%--<c:if test="${sessionScope.loginUserInformation.user.username=='admin'}">
                <li class="lau-nav-item"><a class="lau-nav-header"><i
                        class="layui-icon layui-icon-right"></i><cite>管理中心</cite></a>
                    <dl class="lau-nav-child">
                        <dd style=""><a style="padding-left:20px;"
                                        lau-href="${pageContext.request.contextPath }/browser/permission/list"><i
                                class="layui-icon layui-icon-circle"></i><cite>权限管理</cite></a></dd>
                        <dd style=""><a style="padding-left:20px;"
                                        lau-href="${pageContext.request.contextPath }/browser/role/list"><i
                                class="layui-icon layui-icon-circle"></i><cite>角色管理</cite></a></dd>
                        <dd style=""><a style="padding-left:20px;"
                                        lau-href="${pageContext.request.contextPath }/browser/user/list"><i
                                class="layui-icon layui-icon-username"></i><cite>用户管理</cite></a></dd>
                    </dl>
                </li>
            </c:if>
            &lt;%&ndash; <c:if test="${sessionScope.loginUserInformation.user.username=='管理员'}"> &ndash;%&gt;
            <li class="lau-nav-item"><a class="lau-nav-header"><i
                    class="layui-icon layui-icon-right"></i><cite>体检项目管理</cite></a>
                <dl class="lau-nav-child">
                    <dd style=""><a style="padding-left:20px;"
                                    lau-href="${pageContext.request.contextPath }/browser/xm/listPage"><i
                            class="layui-icon layui-icon-circle"></i><cite>体检项目列表</cite></a></dd>
                </dl>
            </li>
            <li class="lau-nav-item"><a class="lau-nav-header"><i
                    class="layui-icon layui-icon-right"></i><cite>医生管理</cite></a>
                <dl class="lau-nav-child">
                    <dd style=""><a style="padding-left:20px;"
                                    lau-href="${pageContext.request.contextPath }/browser/checkRoom/listPage"><i
                            class="layui-icon layui-icon-circle"></i><cite>检查科室列表</cite></a></dd>
                    <dd style=""><a style="padding-left:20px;"
                                    lau-href="${pageContext.request.contextPath }/browser/doctor/listPage"><i
                            class="layui-icon layui-icon-circle"></i><cite>医生列表</cite></a></dd>

                </dl>
            </li>
            <li class="lau-nav-item"><a class="lau-nav-header"><i
                    class="layui-icon layui-icon-right"></i><cite>学生管理</cite></a>
                <dl class="lau-nav-child">
                    <dd style=""><a style="padding-left:20px;"
                                    lau-href="${pageContext.request.contextPath }/browser/student/listPage"><i
                            class="layui-icon layui-icon-circle"></i><cite>学生基础信息</cite></a></dd>
                    <dd style=""><a style="padding-left:20px;"
                                    lau-href="${pageContext.request.contextPath }/browser/xmStudent/listPage"><i
                            class="layui-icon layui-icon-circle"></i><cite>体检学生列表</cite></a></dd>
                </dl>
            </li>


            <li class="lau-nav-item"><a class="lau-nav-header"><i
                    class="layui-icon layui-icon-right"></i><cite>教师管理</cite></a>
                <dl class="lau-nav-child">
                    <dd style=""><a style="padding-left:20px;"
                                    lau-href="${pageContext.request.contextPath }/browser/teacher/listPage"><i
                            class="layui-icon layui-icon-circle"></i><cite>教师列表</cite></a></dd>
                </dl>
            </li>
            &lt;%&ndash; </c:if> &ndash;%&gt;

            <li class="lau-nav-item"><a class="lau-nav-header"><i
                    class="layui-icon layui-icon-right"></i><cite>基础体检</cite></a>
                <dl class="lau-nav-child">
                    <dd style=""><a style="padding-left:20px;"
                                    lau-href="${pageContext.request.contextPath }/browser/baseCheck/listPage"><i
                            class="layui-icon layui-icon-circle"></i><cite>基础体检列表</cite></a></dd>
                </dl>
            </li>
            <li class="lau-nav-item"><a class="lau-nav-header"><i
                    class="layui-icon layui-icon-right"></i><cite>内科体检</cite></a>
                <dl class="lau-nav-child">
                    <dd style=""><a style="padding-left:20px;"
                                    lau-href="${pageContext.request.contextPath }/browser/neikeCheck/listPage"><i
                            class="layui-icon layui-icon-circle"></i><cite>内科体检列表</cite></a></dd>
                </dl>
            </li>
            <li class="lau-nav-item"><a class="lau-nav-header"><i
                    class="layui-icon layui-icon-right"></i><cite>外科体检</cite></a>
                <dl class="lau-nav-child">
                    <dd style=""><a style="padding-left:20px;"
                                    lau-href="${pageContext.request.contextPath }/browser/waikeCheck/listPage"><i
                            class="layui-icon layui-icon-circle"></i><cite>外科体检列表</cite></a></dd>
                </dl>
            </li>
            <li class="lau-nav-item"><a class="lau-nav-header"><i
                    class="layui-icon layui-icon-right"></i><cite>眼科体检</cite></a>
                <dl class="lau-nav-child">
                    <dd style=""><a style="padding-left:20px;"
                                    lau-href="${pageContext.request.contextPath }/browser/eyeCheck/listPage"><i
                            class="layui-icon layui-icon-circle"></i><cite>眼科体检列表</cite></a></dd>
                </dl>
            </li>
            <li class="lau-nav-item"><a class="lau-nav-header"><i
                    class="layui-icon layui-icon-right"></i><cite>口腔体检</cite></a>
                <dl class="lau-nav-child">
                    <dd style=""><a style="padding-left:20px;"
                                    lau-href="${pageContext.request.contextPath }/browser/kouqiangCheck/listPage"><i
                            class="layui-icon layui-icon-circle"></i><cite>口腔体检列表</cite></a></dd>
                </dl>
            </li>
            <li class="lau-nav-item"><a class="lau-nav-header"><i
                    class="layui-icon layui-icon-right"></i><cite>实验室体检</cite></a>
                <dl class="lau-nav-child">
                    <dd style=""><a style="padding-left:20px;"
                                    lau-href="${pageContext.request.contextPath }/browser/shiyanshiCheck/listPage"><i
                            class="layui-icon layui-icon-circle"></i><cite>实验室体检列表</cite></a></dd>
                </dl>
            </li>
            <li class="lau-nav-item"><a class="lau-nav-header"><i
                    class="layui-icon layui-icon-right"></i><cite>体检总结</cite></a>
                <dl class="lau-nav-child">
                    <dd style=""><a style="padding-left:20px;"
                                    lau-href="${pageContext.request.contextPath }/browser/zongjiebaogaoCheck/listPage"><i
                            class="layui-icon layui-icon-circle"></i><cite>体检总结列表</cite></a></dd>
                </dl>
            </li>
            <li class="lau-nav-item"><a class="lau-nav-header"><i
                    class="layui-icon layui-icon-right"></i><cite>健康指导</cite></a>
                <dl class="lau-nav-child">
                    <dd style=""><a style="padding-left:20px;"
                                    lau-href="${pageContext.request.contextPath }/browser/healthZhidao/listPage"><i
                            class="layui-icon layui-icon-circle"></i><cite>健康指导列表</cite></a></dd>
                </dl>
            </li>
            <li class="lau-nav-item"><a class="lau-nav-header"><i
                    class="layui-icon layui-icon-right"></i><cite>体检报告管理</cite></a>
                <dl class="lau-nav-child">
                    <dd style=""><a style="padding-left:20px;"
                                    lau-href="${pageContext.request.contextPath }/browser/checkReport/listPage"><i
                            class="layui-icon layui-icon-circle"></i><cite>体检报告列表</cite></a></dd>
                </dl>
            </li>
--%>
            </ul>
        </div>
    </div>
    <!--侧边菜单结束-->
    <!--内容主体区域开始-->
    <div class="layui-body" data-type="" data-title="首页"
         data-icon="layui-icon-home"
         data-href="${pageContext.request.contextPath }/welcome.html"></div>
    <!--内容主体区域结束-->
</div>
</body>
<script
        src="${pageContext.request.contextPath }/static/js/jquery2.2.4.js"></script>
<script src="${pageContext.request.contextPath }/static/layui/layui.js"></script>

<script src="${pageContext.request.contextPath }/static/js/axios.min.js"></script>
<script src="${pageContext.request.contextPath }/static/js/myaxios.js"></script>
<script
        src="${pageContext.request.contextPath }/static/js/jquery.fileDownload.js"></script>

<script>
    function logout() {
        location.href = "/logout.html";
    }

    layui
        .config({
            base: '${pageContext.request.contextPath }/static/'
        })
        .extend({
            lau: 'lau/lau'
        })
        .use(
            ['lau'],
            function () {
                var lau = layui.lau, layer = layui.layer, $ = layui.$;

                //监听事件,这个不一定要用lau-event,可以自己写
                $(document)
                    .on(
                        'click',
                        '[lau-event]',
                        function () {
                            var _this = $(this);
                            switch (_this.attr('lau-event')) {
                                case 'about':
                                    $
                                        .get(
                                            '${pageContext.request.contextPath }/html/about.html',
                                            function (html) {
                                                lau
                                                    .drawer({
                                                        content: html
                                                    });
                                            });
                                    break;
                                case 'download':
                                    layer
                                        .confirm(
                                            '欢迎',
                                            function (index) {
                                                window
                                                    .open('https://github.com/carolkey/lying-admin/');
                                                layer
                                                    .close(index);
                                            });
                                    break;
                                case "sideMenu0":
                                    lau.sideMenuChange(0);
                                    break;
                                case "sideMenu1":
                                    lau.sideMenuChange(1);
                                    break;
                            }
                        });

            });
</script>
<script type="text/javascript"
        src="${pageContext.request.contextPath }/static/js/index.js"></script>
</html>