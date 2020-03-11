<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ace.ch
  Date: 2019/11/2
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单详情-Ace's Hotel</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/theme.css">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/js/popper.js"></script>
</head>
<body>
<jsp:include page="nav.jsp"/>
<div class="py-5">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <div class="list-group">
                    <a href="${pageContext.request.contextPath}/user/showUserDetail.do"
                       class="list-group-item list-group-item-action"> 个人信息 </a>
                    <a href="${pageContext.request.contextPath}/user/showOrderDetail.do"
                       class="list-group-item list-group-item-action active"> 我的订单 </a>
                    <a href="${pageContext.request.contextPath}/user/logout.do"
                       class="list-group-item list-group-item-action"> 退出 </a>
                </div>
            </div>
            <div class="col-md-8">
                <c:forEach items="${orders}" var="order" varStatus="status">
                    <div class="py-2">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-12 shadow">
                                    <div class="row">
                                        <div class="col-md-8 bg-light">
                                            <ul class="mb-0 my-2">
                                                <li><a href="${pageContext.request.contextPath}/hotel/showHotelDetail.do?hid=${order.hid}">酒店名：${order.hotelName}</a></li>
                                                <li>房型：${order.roomType}</li>
                                                <li>订单创建时间：${order.createdTime}</li>
                                                <li>总价：${order.totalCharge}</li>
                                                <li>支付方式：${order.payType}</li>
                                                <p id="status">订单状态：${order.comment}</p>
                                            </ul>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="row">
                                                <div class="col-md-6" >
                                                    <label>入住时间</label>
                                                    <p>${order.checkInTime}</p>
                                                </div>
                                                <div class="col-md-6">
                                                    <label>退房时间</label>
                                                    <p>${order.checkOutTime}</p>
                                                </div>
                                                <div class="col-md-6">
                                                    <label>入住人数</label>
                                                    <p>${order.tenantCount}</p>
                                                </div>
                                                <div class="col-md-6 py-1">
                                                    <a id="bt-cancel${status.count}" class="btn btn-warning btn-block <c:if test="${order.comment.equals(\"canceled\")}">disabled</c:if>">取消预订</a>
                                                </div>
                                            </div>
                                            <script>
                                                $('#bt-cancel${status.count}').click(function () {
                                                    $.ajax({
                                                        "url": "/hotel/order/cancelOrder.do",
                                                        "data": {
                                                            "phone": "${order.phone}",
                                                            "createdTime": "${order.createdTime}"
                                                        },
                                                        "type": "POST",
                                                        "dataType": "json",
                                                        "success": function (obj) {
                                                            alert(obj.message);
                                                        }
                                                    });
                                                })
                                            </script>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>