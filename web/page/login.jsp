<%--
  Created by IntelliJ IDEA.
  User: Ace.ch
  Date: 2019/10/31
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">

<head>
    <title>登录-Ace's Hotel</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/theme.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/verify.css">
</head>

<body>
<jsp:include page="nav.jsp"/>
<div class="py-5 text-center"
     style="background-image: url('https://static.pingendo.com/cover-bubble-dark.svg');background-size:cover;">
    <div class="container">
        <div class="row">
            <div class="mx-auto col-md-6 col-10 bg-white p-5">
                <h1 class="mb-4">Log in</h1>
                <form id="form-login">
                    <div class="form-group">
                        <input required
                               pattern="(\d{11})|^((\d{7,8})|(\d{4}|\d{3})-(\d{7,8})|(\d{4}|\d{3})-(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1})|(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1}))$"
                               type="text" class="form-control" placeholder="Tel" id="phone" name="phone">
                        <span class="msg-default"></span>
                    </div>
                    <div class="form-group mb-3">
                        <input required minlength="6" maxlength="18" type="password" class="form-control"
                               placeholder="Password" id="password" name="password">
                        <span class="msg-default"></span>
                        <small class="form-text text-muted text-right">
                            <a href="#"> Forget password?</a>
                        </small>
                    </div>
                    <span id="sp-login"></span>
                    <button type="button" class="btn btn-primary" id="bt-login">Submit</button>
                </form>
                <div>验证码
                    <div class="con">
                        <div id="mpanel"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp"/>
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/verify.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/popper.js"></script>
<script src="${pageContext.request.contextPath}/js/login.js"></script>
<script>
    $(function() {

        $('#mpanel').codeVerify({
            type: 1,
            width: '80px',
            height: '27px',
            fontSize: '18px',
            codeLength: 4,
            btnId: 'bt-login', // 登陆按钮ID
            ready: function() {},
            success: function() {
                // 验证成功之后调用登陆方法
            },
            error: function() {
                alert("验证码错误");
            }
        });

    });
</script>
</body>

</html>