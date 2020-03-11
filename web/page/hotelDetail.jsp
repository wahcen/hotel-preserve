<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ace.ch
  Date: 2019/11/3
  Time: 2:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>酒店详情-Ace's Hotel</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/theme.css">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/js/popper.js"></script>
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
<div class="py-3">
    <div class="container">
        <div class="row shadow">
            <div class="col-md-6"><img class="d-block img-fluid w-100" src="<c:if test="${hotelImages.size()>0}">${hotelImages.get(0).url}</c:if>"></div>
            <div class="col-md-6" style="">
                <div class="row">
                    <div class="col-md-6"><img class="d-block img-fluid w-100" src="<c:if test="${hotelImages.size()>1}">${hotelImages.get(1).url}</c:if>"></div>
                    <div class="col-md-6"><img class="d-block img-fluid w-100" src="<c:if test="${hotelImages.size()>2}">${hotelImages.get(2).url}</c:if>"></div>
                    <div class="col-md-6"><img class="d-block img-fluid w-100" src="<c:if test="${hotelImages.size()>3}">${hotelImages.get(3).url}</c:if>"></div>
                    <div class="col-md-6"><img class="d-block img-fluid w-100" src="<c:if test="${hotelImages.size()>4}">${hotelImages.get(4).url}</c:if>"></div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="py-1">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <ul class="nav nav-pills">
                    <li class="nav-item"> <a href="" class="active nav-link" data-toggle="pill" data-target="#tabone">房间</a> </li>
                    <li class="nav-item"> <a class="nav-link" href="" data-toggle="pill" data-target="#tabtwo">酒店介绍</a> </li>
                </ul>
                <div class="tab-content mt-2" style="">
                    <div class="tab-pane fade show active" id="tabone" role="tabpanel">
                        <div class="row py-2">
                            <div class="col-md-4 px-4">
                                <h5>房间照片</h5>
                            </div>
                            <div class="col-md-2 px-4">
                                <h5>房型信息</h5>
                            </div>
                            <div class="col-md-1 px-2">
                                <h5>早餐</h5>
                            </div>
                            <div class="col-md-2 px-4">
                                <h5>价格</h5>
                            </div>
                            <div class="col-md-1 px-2">
                                <h5>床型</h5>
                            </div>
                            <div class="col-md-2 px-4">
                                <h5>预订</h5>
                            </div>
                        </div>
                        <c:forEach items="${roomsDetail}" var="r" varStatus="i">
                            <div class="row shadow py-3">
                                <div class="col-md-4 px-1" style="" >
                                    <div class="carousel slide m-0" data-ride="carousel" id="carousel${i.count}" data-interval="false"
                                         style="">
                                        <div class="carousel-inner">
                                            <c:forEach items="${r.value}" var="img" varStatus="status">
                                                <div class="carousel-item <c:if test="${status.count == 1}">active</c:if>">
                                                    <img class="d-block img-fluid w-100" src="${img.url}">
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
                                <div class="col-md-2 p-4" style="">
                                    <h4>${r.key.roomType}</h4>
                                    <div class="row pt-2">
                                        <div class="col-md-12">
                                            <b style="color: #1b2646;">${r.key.facilities}</b>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-1 p-2 py-4" style="">
                                    <h5>${r.key.dinnerType}</h5>
                                </div>
                                <div class="col-md-2 p-4">
                                    <h4>${r.key.charge}</h4>
                                </div>
                                <div class="col-md-1 p-2 py-4">
                                    <h5>${r.key.bedType}</h5>
                                </div>
                                <div class="col-md-2 p-4">
                                    <button class="btn btn-primary" data-toggle="modal" data-target="#myModal${i.count}">预订</button>
<%--                                        <a class="btn btn-primary" href="#">预定</a>--%>
                                    <div class="modal fade" id="myModal${i.count}">
                                        <div class="modal-dialog">
                                            <div class="modal-content">

                                                <div class="modal-header">
                                                    <div class="modal-title">确认订单</div>
                                                    <button class="close" data-dismiss="modal">X</button>
                                                </div>

                                                <div class="modal-body">
                                                    <c:if test="${user==null}">
                                                        <a href="${pageContext.request.contextPath}/main/showLogin.do">请登录后再预订</a>
                                                    </c:if>
                                                    <c:if test="${user!=null}">
                                                        <form>
                                                            <div class="py-0" >
                                                                <div class="container">
                                                                    <div class="row">
                                                                        <div class="col-md-12">
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">电话号码</label>
                                                                                <div class="col-8">${user.phone}</div>
                                                                            </div>
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">身份证</label>
                                                                                <div class="col-8">${user.idCard}</div>
                                                                            </div>
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">酒店名</label>
                                                                                <div class="col-8">${hotelDetail.hotelName}</div>
                                                                            </div>
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">房型</label>
                                                                                <div class="col-8">${r.key.roomType}</div>
                                                                            </div>
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">入住时间</label>
                                                                                <div class="col-8"><input id="inTime${i.count}" class="form-control col-md-8" type="date" required></div>
                                                                            </div>
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">退房时间</label>
                                                                                <div class="col-8"><input id="outTime${i.count}" class="form-control col-md-8" type="date" required></div>
                                                                            </div>
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">入住人数</label>
                                                                                <div class="col-8"><input id="tenant${i.count}" class="form-control col-md-6" type="number" min="1" max="${r.key.maxTenant}" required></div>
                                                                            </div>
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">价格(元/24小时)</label>
                                                                                <div class="col-8">${r.key.charge}</div>
                                                                            </div>
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">支付方式</label>
                                                                                <div class="col-8">
                                                                                    <select class="form-control col-md-6" id="payType${i.count}">
                                                                                        <option>支付宝</option>
                                                                                        <option>微信</option>
                                                                                        <option>银行卡</option>
                                                                                    </select>
                                                                                </div>
                                                                            </div>
                                                                            <div class="form-group row">
                                                                                <label class="col-4 col-form-label">退房政策</label>
                                                                                <div class="col-8">
                                                                                    <c:if test="${r.key.policy == 0}">不可退</c:if>
                                                                                    <c:if test="${r.key.policy == -1}">入住前可退</c:if>
                                                                                    <c:if test="${r.key.policy > 0}">下单后${r.key.policy}分钟内可退</c:if>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </form>
                                                    </c:if>
                                                </div>

                                                <div class="modal-footer">
                                                    <button class="btn btn-default" data-dismiss="modal">取消</button>
                                                    <button class="btn btn-primary" id="bt-confirm${i.count}">确认</button>
                                                </div>
                                                <script>
                                                    $('#bt-confirm${i.count}').click(function () {
                                                        var inT = document.getElementById("inTime${i.count}");
                                                        var outT = document.getElementById("outTime${i.count}");
                                                        var tenant = document.getElementById("tenant${i.count}");
                                                        var start = new Date(Date.parse(inT.value));
                                                        var end = new Date(Date.parse(outT.value));
                                                        if(inT.validity.valueMissing || outT.validity.valueMissing || tenant.validity.valueMissing){
                                                            alert('请填写所有可填字段！');
                                                        } else if (tenant.validity.rangeUnderflow){
                                                            alert('入住数不能小于1!');
                                                        } else if (tenant.validity.rangeOverflow){
                                                            alert('入住数超过上限!');
                                                        } else if (start > end){
                                                            alert('入住时间不能在退房时间后！');
                                                        } else if (start < new Date()){
                                                            alert('入住时间在不能今天之前！')
                                                        } else{
                                                            $.ajax({
                                                                "url": "/hotel/order/addOrder.do",
                                                                "data": {
                                                                    "phone": "${user.phone}",
                                                                    "idCard": "${user.idCard}",
                                                                    "hid": "${hotelDetail.hid}",
                                                                    "hotelName": "${hotelDetail.hotelName}",
                                                                    "roomType": "${r.key.roomType}",
                                                                    "checkInTime": $('#inTime${i.count}').val(),
                                                                    "checkOutTime": $('#outTime${i.count}').val(),
                                                                    "tenantCount": $('#tenant${i.count}').val(),
                                                                    "payType": $('#payType${i.count} option:selected').val()
                                                                },
                                                                "type": "POST",
                                                                "dataType": "json",
                                                                "success": function (obj) {
                                                                    alert(obj.message);
                                                                    if (obj.state == 1){
                                                                        location.href="/hotel/user/showOrderDetail.do";
                                                                    }
                                                                }
                                                            });
                                                        }
                                                    })
                                                </script>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <div class="tab-pane fade" id="tabtwo" role="tabpanel">
                        <div class="row">
                            <div class="col-md-12 my-2">
                                <div class="h-25 py-0" style="">
                                    <div class="container">
                                        <div class="row">
                                            <div class="col-md-12">
                                                <ul class="list-group list-group-flush">
                                                    <li class="list-group-item"><i class="fa fa-cloud text-primary mr-2" style="">&nbsp; &nbsp;酒店名称:${hotelDetail.hotelName}</i></li>
                                                    <li class="list-group-item"><i class="fa fa-bookmark text-primary mr-2">&nbsp; &nbsp; 酒店地址:${hotelDetail.address}</i></li>
                                                    <li class="list-group-item"><i class="fa fa-bell text-primary mr-2">&nbsp; &nbsp;酒店电话:${hotelDetail.phone}</i></li>
                                                    <li class="list-group-item"><i class="fa fa-life-ring text-primary mr-2">&nbsp; &nbsp;标签:${hotelDetail.tags}</i></li>
                                                    <li class="list-group-item"><i class="fa fa-life-ring text-primary mr-2">&nbsp; &nbsp;Ace评分:${hotelDetail.score}</i></li>
                                                    <li class="list-group-item"><i class="fa fa-life-ring text-primary mr-2">&nbsp; &nbsp;概况:${hotelDetail.description}</i></li>
                                                </ul>
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
    </div>
</div>
<jsp:include page="footer.jsp"/>
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

<!--<div class="tab-pane fade" id="tabthree" role="tabpanel">-->
<!--    <p class="">A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy.</p>-->
<!--</div>-->
<!--<div class="tab-pane fade" role="tabpanel"></div>-->
