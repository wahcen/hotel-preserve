<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ace.ch
  Date: 2019/10/31
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/page/nav.jsp" %>
<html>
<head>
    <title>Ace's Hotel后台管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/theme.css">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/js/popper.js"></script>
</head>
<body>
<div class="py-2">
    <div class="container">
        <div class="row py-1">
            <div class="col-md-3">
                <input class="form-control shadow" placeholder="目的地" type="text" id="destiny"
                       style="	border-color: blue;">
            </div>
            <div class="col-md-2">
                <input class="form-control shadow" placeholder="关键词" id="tags">
            </div>
            <div class="col-md-2">
                <input class="form-control shadow" id="hid" placeholder="酒店ID" max="5" min="0">
            </div>
            <div class="col-md-3">
                <input class="form-control shadow" placeholder="联系电话" type="text" id="phone">
            </div>
            <div class="col-md-2">
                <button id="bt-search" class="btn w-100 btn-success shadow-lg border border-secondary" style="">搜索</button>
            </div>
        </div>
        <script>
            $('#bt-search').click(function () {
                var address = $('#destiny').val();
                var hid = $('#hid').val();
                var tags = $('#tags').val();
                var phone = $('#phone').val();
                location.href = "/hotel/admin/search.do?" + "address=" + address + "&hid=" + hid + "&tags=" + tags + "&phone=" + phone;
            })
        </script>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-4">
            <div class="list-group">
                <a href="${pageContext.request.contextPath}/admin/index.do"
                   class="list-group-item list-group-item-action active"> 酒店管理 </a>
                <a href="${pageContext.request.contextPath}/admin/showAddHotel.do"
                   class="list-group-item list-group-item-action"> 添加酒店 </a>
                <a href="${pageContext.request.contextPath}/admin/showUpdateRoom.do"
                   class="list-group-item list-group-item-action">房间管理</a>
                <a href="${pageContext.request.contextPath}/admin/showAddRoom.do"
                   class="list-group-item list-group-item-action">添加房间</a>
                <a href="${pageContext.request.contextPath}/user/logout.do"
                   class="list-group-item list-group-item-action"> 退出 </a>
            </div>
        </div>
        <div class="col-md-8">
            <c:forEach items="${hotelsInfo}" var="hotel" varStatus="i">
                <div class="py-2">
                    <div class="container shadow">
                        <div class="row">
                            <div class="col-md-4 py-0 px-0 p-2">
                                <div class="carousel slide m-0" data-ride="carousel" id="carousel${i.count}" data-interval="false"
                                     style="">
                                    <div class="carousel-inner">
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
                                    <a class="carousel-control-prev" href="#carousel${i.count}" role="button" data-slide="prev">
                                        <span class="carousel-control-prev-icon"></span> <span class="sr-only">Previous</span> </a>
                                    <a class="carousel-control-next" href="#carousel${i.count}" role="button" data-slide="next">
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
                                        <div class="col-md-4 p-2">
                                            <button class="btn btn-primary" data-toggle="modal" data-target="#myModal${i.count}">修改信息</button>
                                            <div class="modal fade" id="myModal${i.count}">
                                                <div class="modal-dialog">
                                                    <div class="modal-content">

                                                        <div class="modal-header">
                                                            <div class="modal-title">确认修改</div>
                                                            <button class="close" data-dismiss="modal">X</button>
                                                        </div>

                                                        <div class="modal-body">
                                                            <form>
                                                                <div class="container">
                                                                    <div class="row">
                                                                        <div class="col-md-12">
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">酒店ID</label>
                                                                                <div class="col-8">${hotel.key.hid}</div>
                                                                            </div>
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">酒店名</label>
                                                                                <div class="col-8"><input value="${hotel.key.hotelName}" id="hotelName${i.count}" class="form-control col-md-6" type="text" maxlength="50" required></div>
                                                                            </div>
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">地址</label>
                                                                                <div class="col-8"><input value="${hotel.key.address}" id="address${i.count}" class="form-control col-md-12" type="text" maxlength="255" required></div>
                                                                            </div>
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">电话</label>
                                                                                <div class="col-8"><input value="${hotel.key.phone}" id="phone${i.count}" class="form-control col-md-12" type="text" maxlength="20" required></div>
                                                                            </div>
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">Ace评分</label>
                                                                                <div class="col-8"><input value="${hotel.key.score}" id="score${i.count}" class="form-control col-md-12" type="number" min="1" max="5" required></div>
                                                                            </div>
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">标签</label>
                                                                                <div class="col-8"><input value="${hotel.key.tags}" id="tags${i.count}" class="form-control col-md-12" type="text" maxlength="255" required></div>
                                                                            </div>
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">描述</label>
                                                                                <div class="col-8"><input value="${hotel.key.description}" id="description${i.count}" class="form-control col-md-12" type="text" maxlength="255" required></div>
                                                                            </div>
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">修改房间信息</label>
                                                                                <div class="col-8"><a href="${pageContext.request.contextPath}/admin/showUpdateRoom.do?hid=${hotel.key.hid}">去修改</a> </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </form>
                                                        </div>

                                                        <div class="modal-footer">
                                                            <button class="btn btn-default" data-dismiss="modal">取消</button>
                                                            <button class="btn btn-primary" id="bt-confirm${i.count}">确认</button>
                                                        </div>
                                                        <script>
                                                            $('#bt-confirm${i.count}').click(function () {
                                                                var hotelName = document.getElementById("hotelName${i.count}");
                                                                var address = document.getElementById("address${i.count}");
                                                                var phone = document.getElementById("phone${i.count}");
                                                                var score = document.getElementById("score${i.count}");
                                                                var tags = document.getElementById("tags${i.count}");
                                                                var description = document.getElementById("description${i.count}");
                                                                if (hotelName.validity.valueMissing){
                                                                    alert('酒店名不能为空');
                                                                } else if (address.validity.valueMissing){
                                                                    alert('地址不能为空');
                                                                } else if (phone.validity.valueMissing){
                                                                    alert('电话不能为空');
                                                                } else if (score.validity.valueMissing){
                                                                    alert('评分不能为空')
                                                                } else {
                                                                    $.ajax({
                                                                        "url": "/hotel/admin/updateHotel.do",
                                                                        "data":{
                                                                            "hid": ${hotel.key.hid},
                                                                            "hotelName": $('#hotelName${i.count}').val(),
                                                                            "address": $('#address${i.count}').val(),
                                                                            "phone": $('#phone${i.count}').val(),
                                                                            "score": $('#score${i.count}').val(),
                                                                            "tags": $('#tags${i.count}').val(),
                                                                            "description": $('#description${i.count}').val()
                                                                        },
                                                                        "type": "POST",
                                                                        "dataType": "json",
                                                                        "success": function (obj) {
                                                                            alert(obj.message);
                                                                        },
                                                                        "error": function () {
                                                                            alert('出错了，请联系开发者!');
                                                                        }
                                                                    })
                                                                }
                                                            })
                                                        </script>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
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
</body>
</html>
<%@ include file="/page/footer.jsp" %>
