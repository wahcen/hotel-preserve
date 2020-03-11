<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.ace.hotel.util.MsgUtil" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="https://static.pingendo.com/bootstrap/bootstrap-4.3.1.css">
<nav class="navbar navbar-expand-md bg-dark navbar-dark">
    <div class="container">
        <button class="navbar-toggler navbar-toggler-right border-0" type="button" data-toggle="collapse"
                data-target="#navbar12">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbar12"><a class="navbar-brand d-none d-md-block"
                                                               href="${pageContext.request.contextPath}/main/showIndex.do">
            <i class="fa d-inline fa-lg fa-circle"></i>
            <b> Ace's Hotel</b>
        </a>
            <ul class="navbar-nav mx-auto">
                <li class="nav-item"><a class="nav-link"
                                        href="${pageContext.request.contextPath}/main/showIndex.do">主页</a></li>
                <li class="nav-item"><a class="nav-link"
                                        href="${pageContext.request.contextPath}/hotel/showAllHotels.do">酒店预定</a></li>
                <li class="nav-item"><a class="nav-link"
                                        href="${pageContext.request.contextPath}/page/about.jsp">关于</a></li>
            </ul>
            <ul class="navbar-nav" id="profile">
                <li class="nav-item"><a class="nav-link"
                                        href="${pageContext.request.contextPath}/main/showLogin.do">登录</a></li>
                <li class="nav-item"><a class="nav-link text-primary"
                                        href="${pageContext.request.contextPath}/main/showRegister.do">注册</a></li>
            </ul>
            <div class="btn-group" hidden id="bt-user">
                <button class="btn btn-primary dropdown-toggle" data-toggle="dropdown"> ${user.userName} </button>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/user/showUserDetail.do">个人中心</a>
                    <div class="dropdown-divider"></div>
                    <c:if test="${user.authType.equals(MsgUtil.ADMIN) }">
                        <a class="dropdown-item" href="${pageContext.request.contextPath}/admin/index.do">后台管理</a>
                        <div class="dropdown-divider"></div>
                    </c:if>
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/user/logout.do">退出</a>
                </div>
            </div>
        </div>
    </div>
</nav>
<script>
    var session = "${user.userName}";
    if (session !== "") {
        document.getElementById("profile").hidden = true;
        document.getElementById("bt-user").hidden = false;
    }
</script>