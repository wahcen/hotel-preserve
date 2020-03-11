<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>关于</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/theme.css">
</head>
<body>
<jsp:include page="nav.jsp"/>
<div class="py-5 text-center" style="background-image: url('https://static.pingendo.com/cover-bubble-dark.svg');background-size:cover;">
    <div class="container">
        <div class="row" style="">
            <div class="bg-white p-5 mx-auto col-md-8 col-10">
                <h3 class="display-3">welcome</h3>
                <p class="mb-4">全国各地我们有丰富的酒店，以及各种各样的房间，满足你任何地方对房间的需求，各个酒店的服务及环境经过考察，值得您放心使用<br></p>
            </div>
        </div>
    </div>
</div>
<div class="py-5 text-center" >
    <div class="container">
        <div class="row">
            <div class="mx-auto col-lg-10">
                <h1>现在</h1>
                <p class="mb-3 mx-auto w-75 lead">我们将提供优良的服务</p> <a class="btn btn-primary" href="${pageContext.request.contextPath}/hotel/showAllHotels.do">立即使用</a>
                <div class="row">
                    <div class="col-md-3 mt-4 px-4 col-6"> <i class="d-block fa fa-stop-circle fa-4x mb-3 text-muted"></i>
                        <h5> <b>Option #1</b> </h5>
                        <p class="mb-3 shadow-lg"><b>我们有丰富酒店</b></p>
                    </div>
                    <div class="col-md-3 mt-4 px-4 col-6"> <i class="d-block fa fa-stop-circle-o fa-4x mb-3 text-muted"></i>
                        <h5> <b>Option #2</b> </h5>
                        <p class="mb-3 shadow-lg"><b>各种价格的房间</b></p>
                    </div>
                    <div class="col-md-3 mt-4 px-4 col-6"> <i class="d-block fa fa-circle-o fa-4x mb-3 text-muted"></i>
                        <h5> <b>Option #3</b> </h5>
                        <p class="mb-3 shadow-lg"><b>干净舒适的环境</b></p>
                    </div>
                    <div class="col-md-3 mt-4 px-4 col-6"> <i class="d-block fa fa-circle fa-4x mb-3 text-muted"></i>
                        <h5> <b>Option #4</b> </h5>
                        <p class="mb-3 shadow-lg border-dark text-center text-uppercase text-body"><b>贴心的服务</b></p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp"/>
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/popper.js"></script>
</body>
</html>