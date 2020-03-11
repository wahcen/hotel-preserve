$('#bt-login').click(function () {
    var valid = 0;
    $('.form-group').each(function () {
        if ($(this).find('span').hasClass('msg-success')) {
            valid++;
        }
    });
    if (valid === 2) {
        $.ajax({
            "url": "/hotel/user/login.do",
            "data": $("#form-login").serialize(),
            "type": "POST",
            "dataType": "json",
            "success": function (obj) {
                if (obj.state == 0) {
                    document.getElementById("sp-login").innerText = obj.message;
                } else {
                    if(obj.message === "admin"){
                        location.href = "/hotel/admin/index.do"
                    }else{
                        location.href = "/hotel/main/showIndex.do";
                    }
                }
            }
        });
    }
});
var phone = document.getElementById("phone");
/*3.对身份证号进行验证*/
phone.onblur = function () {
    if (this.validity.valueMissing) {
        this.nextElementSibling.innerHTML = '电话不能为空';
        this.nextElementSibling.className = 'msg-error';
        this.setCustomValidity('电话不能为空');
    } else if (this.validity.patternMismatch) {
        this.nextElementSibling.innerHTML = '电话格式不正确';
        this.nextElementSibling.className = 'msg-error';
        this.setCustomValidity('电话格式不正确');
    } else {
        this.nextElementSibling.innerHTML = '';
        this.nextElementSibling.className = 'msg-success';
        this.setCustomValidity('');

        var data = document.getElementById("phone").value;
        if (!data) {   //用户没有输入任何内容
            return;
        }
    }
};
phone.onfocus = function () {
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
        this.nextElementSibling.innerHTML = '密码不少于6位';
        this.nextElementSibling.className = 'msg-error';
        this.setCustomValidity('密码不少于6位');
    } else {
        this.nextElementSibling.innerHTML = '';
        this.nextElementSibling.className = 'msg-success';
        this.setCustomValidity('');
    }
};