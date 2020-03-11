<%--
  Created by IntelliJ IDEA.
  User: Ace.ch
  Date: 2019/10/29
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户详情-Ace's Hotel</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/theme.css">
</head>
<body>
<jsp:include page="nav.jsp"/>
<div class="py-5">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <div class="list-group">
                    <a href="${pageContext.request.contextPath}/user/showUserDetail.do"
                       class="list-group-item list-group-item-action active"> 个人信息 </a>
                    <a href="${pageContext.request.contextPath}/user/showOrderDetail.do"
                       class="list-group-item list-group-item-action"> 我的订单 </a>
                    <a href="${pageContext.request.contextPath}/user/logout.do"
                       class="list-group-item list-group-item-action"> 退出 </a>
                </div>
            </div>
            <div class="col-md-8">
                <form id="form-update">
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="userName">用户名</label><input type="text" autocomplete required minlength="3"
                                                                    maxlength="10" class="form-control" id="userName"
                                                                    name="userName" value="${user.userName}">
                            <span class="msg-default" id="userNameSpan"></span>
                        </div>
                        <div class="form-group col-12">
                            <label for="phone">电话</label><input required type="text" class="form-control" id="phone"
                                                                name="phone" value="${user.phone}"
                                                                pattern="(\d{11})|^((\d{7,8})|(\d{4}|\d{3})-(\d{7,8})|(\d{4}|\d{3})-(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1})|(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1}))$">
                            <span class="msg-default" id="phoneSpan"></span>
                        </div>
                        <div class="form-group col-12">
                            <label for="idCard">身份证</label><input required type="text" class="form-control" id="idCard"
                                                                  name="idCard" value="${user.idCard}">
                            <span class="msg-default" id="idCardSpan"></span>
                        </div>
                        <div class="form-group col-12">
                            <label for="email">Email</label><input autocomplete required type="email"
                                                                   class="form-control" id="email" name="email"
                                                                   value="${user.email}">
                            <span class="msg-default" id="emailSpan"></span>
                        </div>
                        <div class="form-group" hidden>
                            <input name="uid" value="${user.uid}">
                        </div>
                    </div>
                    <button type="button" id="bt-update" class="btn btn-light">保存个人信息</button>
                    <span id="sp-update"></span>
                </form>
            </div>
        </div>
    </div>
</div>
<input hidden id="pageContext" value="${pageContext.request.contextPath}">
<jsp:include page="footer.jsp"/>
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/popper.js"></script>
<script src="${pageContext.request.contextPath}/js/check_id.js"></script>
<script>
    $('#bt-update').click(function () {
        var def = 4;
        $('.form-group').each(function () {
            if ($(this).find('span').hasClass('msg-success')) {
                def--;
            }
        });
        if (def < 4) {
            alert("确定要修改个人信息？");
            $.ajax({
                "url": $('#pageContext').val() + "/user/updateUser.do",
                "data": $("#form-update").serialize(),
                "type": "POST",
                "dataType": "json",
                "success": function (obj) {
                    document.getElementById("sp-update").innerText = obj.message;
                }
            });
        }
    });
    var phone = document.getElementById("phone");
    /*3.对手机号进行验证*/
    phone.onblur = function () {
        if (this.validity.valueMissing) {
            this.nextElementSibling.innerHTML = '手机号不能为空';
            this.nextElementSibling.className = 'msg-error';
            this.setCustomValidity('手机号不能为空');
        } else if (this.validity.patternMismatch) {
            this.nextElementSibling.innerHTML = '手机号格式不正确';
            this.nextElementSibling.className = 'msg-error';
            this.setCustomValidity('手机号格式不正确');
        } else {
            this.nextElementSibling.innerHTML = '';
            this.nextElementSibling.className = 'msg-success';
            this.setCustomValidity('');

            var data = document.getElementById("phone").value;
            if (!data) {   //用户没有输入任何内容
                return;
            }
            /**发起异步GET请求，验证电话号码是否已经存在**/
            if (data !== '${user.phone}') {
                $(function () {
                    $.ajax({
                        "url": $('#pageContext').val() + "/user/checkPhone.do",
                        "type": "GET",
                        "data": "phone=" + $("#phone").val(),
                        "dataType": "json",
                        "success": function (obj) {
                            var phoneSpan = document.getElementById("phoneSpan");
                            phoneSpan.innerText = obj.message;
                            if (obj.state == 0) {
                                phoneSpan.className = "msg-error";
                            } else {
                                phoneSpan.className = "msg-success";
                            }
                        }
                    });
                });
            }
        }
    };
    phone.onfocus = function () {
        this.nextElementSibling.className = 'msg-default';
    };
    var userName = document.getElementById("userName");
    userName.onblur = function () {
        if (this.validity.valueMissing) {
            this.nextElementSibling.innerHTML = '用户名不能为空';
            this.nextElementSibling.className = 'msg-error';
            this.setCustomValidity('用户名不能为空');
        } else if (this.validity.tooShort) {
            this.nextElementSibling.innerHTML = '用户名不能少于3位';
            this.nextElementSibling.className = 'msg-error';
            this.setCustomValidity('用户名不能少于3位');
        } else {
            this.nextElementSibling.innerHTML = '';
            this.nextElementSibling.className = 'msg-success';
            this.setCustomValidity('');
        }
    };

    userName.onfocus = function () {
        this.nextElementSibling.className = 'msg-default';
    };
    var email = document.getElementById("email");
    /*3.对邮箱地址进行验证*/
    email.onblur = function () {
        if (this.validity.valueMissing) {
            this.nextElementSibling.innerHTML = '邮箱不能为空';
            this.nextElementSibling.className = 'msg-error';
            this.setCustomValidity('邮箱不能为空');
        } else if (this.validity.typeMismatch) {
            this.nextElementSibling.innerHTML = '邮箱格式不正确';
            this.nextElementSibling.className = 'msg-error';
            this.setCustomValidity('邮箱格式不正确');
        } else {
            this.nextElementSibling.innerHTML = '';
            this.nextElementSibling.className = 'msg-success';
            this.setCustomValidity('');

            var data = document.getElementById("email").value;
            if (!data) {   //用户没有输入任何内容
                return;
            }
            /**发起异步GET请求，询问服务器邮箱是否已经存在**/
            if (data !== '${user.email}') {
                $(function () {
                    $.ajax({
                        "url": $('#pageContext').val() + "/user/checkEmail.do",
                        "type": "GET",
                        "data": "email=" + $("#email").val(),
                        "dataType": "json",
                        "success": function (obj) {
                            var emailSpan = document.getElementById("emailSpan");
                            emailSpan.innerText = obj.message;
                            if (obj.state == 0) {
                                emailSpan.className = "msg-error";
                            } else {
                                emailSpan.className = "msg-success";
                            }
                        }
                    });
                });
            }
        }
    };
    email.onfocus = function () {
        this.nextElementSibling.className = 'msg-default';
    };
    var idCard = document.getElementById("idCard");
    /*3.对身份证号进行验证*/
    idCard.onblur = function () {
        if (this.validity.valueMissing) {
            this.nextElementSibling.innerHTML = '身份证不能为空';
            this.nextElementSibling.className = 'msg-error';
            this.setCustomValidity('身份证不能为空');
        } else if (checkIDCard(idCard.innerText)) {
            this.nextElementSibling.innerHTML = '身份证格式不正确';
            this.nextElementSibling.className = 'msg-error';
            this.setCustomValidity('身份证格式不正确');
        } else {
            this.nextElementSibling.innerHTML = '';
            this.nextElementSibling.className = 'msg-success';
            this.setCustomValidity('');

            var data = document.getElementById("idCard").value;
            if (!data) {   //用户没有输入任何内容
                return;
            }
            /**发起异步GET请求，验证身份证是否已经存在**/
            if (data !== '${user.idCard}') {
                $(function () {
                    $.ajax({
                        "url": $('#pageContext').val() + "/user/checkIdCard.do",
                        "type": "GET",
                        "data": "idCard=" + $("#idCard").val(),
                        "dataType": "json",
                        "success": function (obj) {
                            var idCardSpan = document.getElementById("idCardSpan");
                            idCardSpan.innerText = obj.message;
                            if (obj.state == 0) {
                                idCardSpan.className = "msg-error";
                            } else {
                                // idCardSpan.attr("class","msg-success");
                                idCardSpan.className = "msg-success";
                            }
                        }
                    });
                });
            }
        }
    };
    idCard.onfocus = function () {
        this.nextElementSibling.className = 'msg-default';
    };
</script>

</body>
</html>
