<%--
  Created by IntelliJ IDEA.
  User: Ace.ch
  Date: 2019/11/3
  Time: 2:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>酒店-Ace's Hotel</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/theme.css">
</head>
<body>
<jsp:include page="nav.jsp"/>
<div class="py-2">
    <div class="container">
        <div class="row py-1">
            <div class="col-md-2">
                <input class="form-control shadow" placeholder="目的地" type="text" id="destiny"
                       style="	border-color: blue;">
            </div>
            <div class="col-md-2">
                <input type="date" class="form-control shadow" style="">
            </div>
            <div class="col-md-2">
                <input class="form-control shadow" type="date">
            </div>
            <div class="col-md-2">
                <input class="form-control shadow" placeholder="关键词" id="tags">
            </div>
            <div class="col-md-2">
                <input class="form-control shadow" id="score" placeholder="评分" max="5" min="0">
            </div>
            <div class="col-md-2">
                <button id="bt-search" class="btn w-100 btn-success shadow-lg border border-secondary" style="">搜索
                </button>
            </div>
        </div>
    </div>
</div>
<c:forEach items="${hotelsInfo}" var="hotel">
    <div class="py-2">
        <div class="container shadow">
            <div class="row">
                <div class="col-md-4 py-0 px-0 p-2">
                    <div class="carousel slide m-0" data-ride="carousel" id="carousel${hotel.key.hid}" data-interval="false"
                         style="">
                        <div class="carousel-inner">
                            <c:if test="${hotel.value.size() == 0}">
                                <div class="carousel-item active"> <img class="d-block img-fluid w-100" src="../img/3.jpg">
                                    <div class="carousel-caption">
                                        <h5 class="m-0">Ace's Hotel</h5>
                                        <p>reserve service</p>
                                    </div>
                                </div>
                            </c:if>
                            <c:forEach items="${hotel.value}" var="img" varStatus="status">
                                <div class="carousel-item <c:if test="${status.count == 1}">active</c:if>"> <img class="d-block img-fluid w-100"
                                                                src="${img.url}">
                                    <div class="carousel-caption">
                                        <h5 class="m-0">Ace's Hotel</h5>
                                        <p>reserve service</p>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                        <a class="carousel-control-prev" href="#carousel${hotel.key.hid}" role="button" data-slide="prev">
                            <span class="carousel-control-prev-icon"></span> <span class="sr-only">Previous</span> </a>
                        <a class="carousel-control-next" href="#carousel${hotel.key.hid}" role="button" data-slide="next">
                            <span class="carousel-control-next-icon"></span> <span class="sr-only">Next</span> </a>
                    </div>
                </div>
                <div class="col-md-8">
                    <div class="row pt-2">
                        <div class="col-md-8">
                            <ul class="p-0 pl-4 m-1">
                                <li>${hotel.key.hotelName}</li>
                                <li>${hotel.key.address}</li>
                                <li>${hotel.key.phone}</li>
                            </ul>
                        </div>
                        <div class="col-md-4">
                            <p class="mb-0 m-1">${hotel.key.score}</p>
                        </div>
                    </div>
                    <div class="pt-2">
                        <div class="row">
                            <div class="col-md-8">
                                <ul class="py-0 pl-4 mb-0 m-1">
                                    <li>${hotel.key.tags}</li>
                                </ul>
                            </div>
                            <div class="col-md-4 p-2"><a class="btn btn-secondary btn-block shadow-lg my-2"
                                                         href="${pageContext.request.contextPath}/hotel/showHotelDetail.do?hid=${hotel.key.hid}">查看详情</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</c:forEach>
<jsp:include page="footer.jsp"/>
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/popper.js"></script>
<script>
    $('#bt-search').click(function () {
        var address = $('#destiny').val();
        var score = $('#score').val();
        var tags = $('#tags').val();
        location.href = "/hotel/hotel/searchHotel.do?" + "address=" + address + "&score=" + score + "&tags=" + tags;
    })
</script>
</body>
</html>
