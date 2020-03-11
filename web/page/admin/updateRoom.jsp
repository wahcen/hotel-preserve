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
                       class="list-group-item list-group-item-action"> 添加酒店 </a>
                    <a href="${pageContext.request.contextPath}/admin/showUpdateRoom.do"
                       class="list-group-item list-group-item-action active">房间管理</a>
                    <a href="${pageContext.request.contextPath}/admin/showAddRoom.do"
                       class="list-group-item list-group-item-action">添加房间</a>
                    <a href="${pageContext.request.contextPath}/user/logout.do"
                       class="list-group-item list-group-item-action"> 退出 </a>
                </div>
            </div>
            <div class="col-md-8">
                <c:forEach items="${roomsInfo}" var="r" varStatus="i">
                    <div class="row shadow py-3">
                        <div class="col-md-4" style="" >
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
                        <div class="col-md-8">
                            <div class="row">
                                <div class="col-md-3" style="">
                                    <h4>${r.key.roomType}</h4>
                                </div>
                                <div class="col-md-3" style="">
                                    <h5>${r.key.dinnerType}</h5>
                                </div>
                                <div class="col-md-3">
                                    <h4>${r.key.charge}</h4>
                                </div>
                                <div class="col-md-3">
                                    <h5>${r.key.bedType}</h5>
                                </div>
                            </div>
                            <div class="row pt-3">
                                <div class="col-md-8">
                                    <b style="color: #1b2646;">${r.key.facilities}</b>
                                </div>
                                <div class="col-md-4">
                                    <button class="btn btn-primary" data-toggle="modal" data-target="#myModal${i.count}">修改信息</button>
                                        <%--                                        <a class="btn btn-primary" href="#">预定</a>--%>
                                    <div class="modal fade" id="myModal${i.count}">
                                        <div class="modal-dialog">
                                            <div class="modal-content">

                                                <div class="modal-header">
                                                    <div class="modal-title">确认修改</div>
                                                    <button class="close" data-dismiss="modal">X</button>
                                                </div>

                                                <div class="modal-body">
                                                    <form id="form${i.count}">
                                                        <div class="py-0" >
                                                            <div class="container">
                                                                <div class="row">
                                                                    <div class="col-md-12">
                                                                        <div class="form-group row">
                                                                            <label class="col-4 col-form-label">酒店ID</label>
                                                                            <div class="col-8"><input name="hid" type="hidden" value="${r.key.hid}">${r.key.hid}</div>
                                                                        </div>
                                                                        <div class="form-group row">
                                                                            <label class="col-4 col-form-label">房型</label>
                                                                            <div class="col-8"><input name="roomType" type="hidden" value="${r.key.roomType}">${r.key.roomType}</div>
                                                                        </div>
                                                                        <div class="form-group row">
                                                                            <label class="col-4 col-form-label">最大入住人数</label>
                                                                            <div class="col-8"><input id="maxTenant${i.count}" name="maxTenant" class="form-control" type="number" min="1" max="20" value="${r.key.maxTenant}" required></div>
                                                                        </div>
                                                                        <div class="form-group row">
                                                                            <label class="col-4 col-form-label">床型</label>
                                                                            <div class="col-8"><input name="bedType" class="form-control" type="text" maxlength="255" value="${r.key.bedType}"></div>
                                                                        </div>
                                                                        <div class="form-group row">
                                                                            <label class="col-4 col-form-label">餐点</label>
                                                                            <div class="col-8"><input name="dinnerType" class="form-control" type="text" maxlength="255" value="${r.key.dinnerType}"></div>
                                                                        </div>
                                                                        <div class="form-group row">
                                                                            <label class="col-4 col-form-label">价格(元/24小时)</label>
                                                                            <div class="col-8"><input id="charge${i.count}" name="charge" class="form-control" type="number" min="0" value="${r.key.charge}" required></div>
                                                                        </div>
                                                                        <div class="form-group row">
                                                                            <label class="col-4 col-form-label">设施描述</label>
                                                                            <div class="col-8"><input name="facilities" class="form-control" type="text" maxlength="255" value="${r.key.facilities}"></div>
                                                                        </div>
                                                                        <div class="form-group row">
                                                                            <label class="col-4 col-form-label">退房政策</label>
                                                                            <div class="col-8"><input name="policy" class="form-control" type="number" min="-1" value="${r.key.policy}"></div>
                                                                        </div>
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
                                                        var maxTenant = document.getElementById('maxTenant${i.count}');
                                                        var charge = document.getElementById('charge${i.count}');
                                                        if (maxTenant.validity.valueMissing){
                                                            alert('最大入住数不能为空');
                                                        } else if (maxTenant.validity.rangeUnderflow){
                                                            alert('最大入住数不能小于1');
                                                        } else if (maxTenant.validity.rangeOverflow){
                                                            alert('最大入住数超过上限');
                                                        } else if (charge.validity.valueMissing){
                                                            alert('价格不能为空');
                                                        } else if (charge.validity.rangeUnderflow){
                                                            alert('价格小于0？您认真的？');
                                                        } else {
                                                            $.ajax({
                                                                "url": "/hotel/admin/updateRoom.do",
                                                                "data": $('#form${i.count}').serialize(),
                                                                "type": "POST",
                                                                "dataType": "json",
                                                                "success": function (obj) {
                                                                    alert(obj.message);
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
                </c:forEach>
            </div>
        </div>
    </div>
</div>
</body>
</html>
<%@ include file="/page/footer.jsp" %>
