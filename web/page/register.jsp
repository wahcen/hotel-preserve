<%--
  Created by IntelliJ IDEA.
  User: Ace.ch
  Date: 2019/10/31
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>加入Ace's Hotel-Ace's Hotel</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/theme.css">
</head>

<body>
<jsp:include page="nav.jsp"/>
<div class="py-3 text-center">
    <div class="container">
        <div class="row">
            <div class="mx-auto p-4 col-lg-7">
                <h1 class="mb-4">加入Ace's Hotel</h1>
                <form id="form-register">
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <input type="text" autocomplete required minlength="3" maxlength="10" class="form-control"
                                   id="userName" name="userName" placeholder="Name">
                            <span class="msg-default" id="userNameSpan"></span>
                        </div>
                        <div class="form-group col-md-3">
                            <label for="m">男</label>
                            <input type="radio" class="form-check-inline" id="m" name="sex" value="男" checked="checked">
                        </div>
                        <div class="form-group col-md-3">
                            <label for="f">女</label>
                            <input type="radio" class="form-check-inline" id="f" value="女" name="sex">
                        </div>
                        <div class="form-group col-md-12">
                            <input type="password" required minlength="6" maxlength="18" class="form-control"
                                   id="password" name="password" placeholder="Password">
                            <span class="msg-default" id="passwordSpan"></span>
                        </div>
                        <div class="form-group col-md-12">
                            <input type="password" required minlength="6" maxlength="18" class="form-control"
                                   id="passwordConfirm" placeholder="Confirm Password">
                            <span class="msg-default" id="passwordConfirmSpan"></span>
                        </div>
                        <div class="form-group col-12">
                            <input required type="text" class="form-control" id="phone" name="phone" placeholder="Tel"
                                   pattern="(\d{11})|^((\d{7,8})|(\d{4}|\d{3})-(\d{7,8})|(\d{4}|\d{3})-(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1})|(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1}))$">
                            <span class="msg-default" id="phoneSpan"></span>
                        </div>
                        <div class="form-group col-12">
                            <input required type="text" class="form-control" id="idCard" name="idCard"
                                   placeholder="ID-Card">
                            <span class="msg-default" id="idCardSpan"></span>
                        </div>
                        <div class="form-group col-12">
                            <input autocomplete required type="email" class="form-control" id="email" name="email"
                                   placeholder="Email">
                            <span class="msg-default" id="emailSpan"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <textarea class="form-control" id="form30" rows="3" placeholder="Your message"></textarea>
                    </div>
                    <button type="button" id="bt-register" class="btn btn-primary">注册</button>
                    <button type="button" id="bt-login" class="btn btn-primary">直接登录</button>
                </form>
            </div>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp"/>
<input type="hidden" value="${pageContext.request.contextPath}" id="pageContext"/>
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/popper.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/check_id.js"></script>
<script src="${pageContext.request.contextPath}/js/register.js"></script>
</body>
</html>