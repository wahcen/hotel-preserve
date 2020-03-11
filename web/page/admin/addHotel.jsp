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
<div class="py-0">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <div class="list-group">
                    <a href="${pageContext.request.contextPath}/admin/index.do"
                       class="list-group-item list-group-item-action"> 酒店管理 </a>
                    <a href="${pageContext.request.contextPath}/admin/showAddHotel.do"
                       class="list-group-item list-group-item-action active"> 添加酒店 </a>
                    <a href="${pageContext.request.contextPath}/admin/showUpdateRoom.do"
                       class="list-group-item list-group-item-action">房间管理</a>
                    <a href="${pageContext.request.contextPath}/admin/showAddRoom.do"
                       class="list-group-item list-group-item-action">添加房间</a>
                    <a href="${pageContext.request.contextPath}/user/logout.do"
                       class="list-group-item list-group-item-action"> 退出 </a>
                </div>
            </div>
            <div class="col-md-8">
                <div class="container">
                    <div class="row">
                        <form id="form-hotel">
                            <div class="container">
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="form-group row">
                                            <label class="col-4 col-form-label">酒店名</label>
                                            <div class="col-8"><input placeholder="hotel name" id="add_hotelName" name="hotelName" class="form-control" type="text" maxlength="50" required></div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-4 col-form-label">地址</label>
                                            <div class="col-8"><input placeholder="address" id="add_address" name="address" class="form-control col-md-12" type="text" maxlength="255" required></div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-4 col-form-label">电话</label>
                                            <div class="col-8"><input placeholder="phone" id="add_phone" name="phone" class="form-control col-md-12" type="text" maxlength="20" required></div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-4 col-form-label">Ace评分</label>
                                            <div class="col-8"><input placeholder="ace score" id="add_score" name="score" class="form-control col-md-12" type="number" min="1" max="5" required></div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-4 col-form-label">标签</label>
                                            <div class="col-8"><input placeholder="tags" id="add_tags" name="tags" class="form-control col-md-12" type="text" maxlength="255"></div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-4 col-form-label">描述</label>
                                            <div class="col-8"><input placeholder="description" id="add_description" name="description" class="form-control col-md-12" type="text" maxlength="255"></div>
                                        </div>
                                        <div class="form-group row">
                                            <span class="col-8"></span>
                                            <div class="col-4">
                                                <button id="bt-add" class="btn btn-primary">添加</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>
                        <script>
                            $('#bt-add').click(function () {
                                var hotelName = document.getElementById('add_hotelName');
                                var address = document.getElementById('add_address');
                                var phone = document.getElementById('add_phone');
                                var score = document.getElementById('add_score');
                                if(hotelName.validity.valueMissing){
                                    alert('酒店名不能为空');
                                } else if(address.validity.valueMissing){
                                    alert('地址不能为空');
                                } else if (phone.validity.valueMissing){
                                    alert('电话不能为空');
                                } else if(score.validity.valueMissing){
                                    alert('ace评分不能为空');
                                } else {
                                    $.ajax({
                                        "url": "/hotel/admin/addHotel.do",
                                        "data": $('#form-hotel').serialize(),
                                        "type": "POST",
                                        "dataType": "json",
                                        "success": function (obj) {
                                            alert(obj.message);
                                        },
                                        "error": function () {
                                            alert('出错了，请联系开发者！');
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
</body>
</html>
<%@ include file="/page/footer.jsp" %>
