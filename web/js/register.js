/**
 * 直接登录按钮动作
 * @type {HTMLElement}
 */
var bt_login = document.getElementById("bt-login");
bt_login.onclick = function (ev) {
    location.href = "/hotel/main/showLogin.do";
};
/**
 * 注册按钮动作
 */
$('#bt-register').click(function () {
    var lengths = 0;
    $('.form-group').each(function () {
        if ($(this).find('span').hasClass('msg-success')) {
            lengths++;
        }

    });
    if (lengths == 6) {
        $.ajax({
            "url": $('#pageContext').val() + "/user/register.do",
            "data": $("#form-register").serialize(),
            "type": "POST",
            "dataType": "json",
            "success": function (obj) {
                if (obj == 0) {
                    alert(obj.message);
                } else {
                    location.href = $('#pageContext').val() + "/main/showLogin.do";
                }
            }
        });
    }
});
/*1.对用户名进行验证*/
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

var password = document.getElementById("password");
password.onfocus = function () {
    this.nextElementSibling.className = 'msg-default';
};
password.onblur = function () {
    if (this.validity.valueMissing) {
        this.nextElementSibling.innerHTML = '密码不能为空';
        this.nextElementSibling.className = 'msg-error';
        this.setCustomValidity('密码不能为空');
    } else if (this.validity.tooShort) {
        this.nextElementSibling.innerHTML = '密码不能少于6位';
        this.nextElementSibling.className = 'msg-error';
        this.setCustomValidity('密码不能少于6位');
    } else {
        this.nextElementSibling.innerHTML = '';
        this.nextElementSibling.className = 'msg-success';
        this.setCustomValidity('');
    }

    //如果再次输入密码框中有信息，再去判断两次密码输入是否一致
    if (passwordConfirm.value) {
        passwordConfirm.onblur();
    }
};

var passwordConfirm = document.getElementById("passwordConfirm");
passwordConfirm.onfocus = function () {
    this.nextElementSibling.innerHTML = '密码长度在6到18位之间';
    this.nextElementSibling.className = 'msg-default';
};
passwordConfirm.onblur = function () {
    if (this.validity.valueMissing) {
        this.nextElementSibling.innerHTML = '密码不能为空';
        this.nextElementSibling.className = 'msg-error';
        this.setCustomValidity('密码不能为空');
    } else if (this.validity.tooShort) {
        this.nextElementSibling.innerHTML = '密码不能少于6位';
        this.nextElementSibling.className = 'msg-error';
        this.setCustomValidity('密码不能少于6位');
    } else {
        this.nextElementSibling.innerHTML = '';
        this.nextElementSibling.className = 'msg-success';
        this.setCustomValidity('');
    }


    //如果两次密码输入不一致，信息提示
    if (this.value != password.value) {
        this.nextElementSibling.innerHTML = '两次输入密码不一致';
        this.nextElementSibling.className = 'msg-error';
        this.setCustomValidity('两次输入密码不一致');
    }
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
};
email.onfocus = function () {
    this.nextElementSibling.className = 'msg-default';
};
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
};
phone.onfocus = function () {
    this.nextElementSibling.className = 'msg-default';
};


var idCard = document.getElementById("idCard");
/*3.对身份证号进行验证*/
idCard.onblur = function () {
    if (this.validity.valueMissing) {
        this.nextElementSibling.innerHTML = '身份证不能为空';
        this.nextElementSibling.className = 'msg-error';
        this.setCustomValidity('身份证不能为空');
    } else if (!checkIDCard(idCard.value)) {
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
};
idCard.onfocus = function () {
    this.nextElementSibling.className = 'msg-default';
};