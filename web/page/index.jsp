<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ace.ch
  Date: 2019/10/28
  Time: 0:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>主页-Ace's Hotel</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/theme.css">
</head>
<body>
<jsp:include page="nav.jsp"/>
<div class="py-5 text-center text-white" style="position: relative; overflow: hidden;"> <video autoplay="" loop="" muted="" plays-inline="" style="position: absolute; right: 0; top: 0; min-width:100%; z-index: -100;">
    <source src="${pageContext.request.contextPath}/video/Ocean%20-%2019609.mp4" type="video/mp4"> </video>
    <div class="container py-5">
        <div class="row">
            <div class="col-lg-8 col-md-10 mx-auto">
                <h1 class="mb-4 display-3">Flow</h1>
                <p class="lead mb-5">A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart. I am alone, and feel the charm of existence in this spot, which was created for the bliss of souls like mine.</p>
                <a href="${pageContext.request.contextPath}/main/showRegister.do" class="btn btn-lg btn-primary mx-1">加入 Ace's Hotel</a>
            </div>
        </div>
    </div>
</div>
<div class="py-5">
    <div class="container">
        <div class="row">
            <div class="col-md-12 text-center">
                <h1>Ace's Hotel</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 p-3">
                <p>Ace's Hotel为您提供最舒适的预订服务</p>
            </div>
            <div class="col-md-6 p-3">
                <p>简洁的界面和预订功能让您专注于选择最适合您的需要的酒店</p>
            </div>
        </div>
    </div>
</div>
<div class="pt-2">
    <div class="container-fluid">
        <div class="row">
            <div class="text-center mx-auto col-md-12">
                <h1 class="mb-4" >Ace's Marked Hotel</h1>
            </div>
        </div>
        <div class="row col-12">
            <div class="col-6 col-md-4 col-lg-2 p-0"> <img class="img-fluid d-block" src="${pageContext.request.contextPath}/img/1.jpg"> </div>
            <div class="col-6 col-md-4 col-lg-2 p-0"> <img class="img-fluid d-block" src="${pageContext.request.contextPath}/img/2.jpg"> </div>
            <div class="col-6 col-md-4 col-lg-2 p-0"> <img class="img-fluid d-block" src="${pageContext.request.contextPath}/img/3.jpg"> </div>
            <div class="col-6 col-md-4 col-lg-2 p-0"> <img class="img-fluid d-block" src="${pageContext.request.contextPath}/img/4.jpg"> </div>
            <div class="col-6 col-md-4 col-lg-2 p-0"> <img class="img-fluid d-block" src="${pageContext.request.contextPath}/img/5.jpg"> </div>
            <div class="col-6 col-md-4 col-lg-2 p-0"> <img class="img-fluid d-block" src="${pageContext.request.contextPath}/img/6.jpg"> </div>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp"/>
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/popper.js"></script>
</body>
</html>
