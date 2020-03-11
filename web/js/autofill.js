$(document).ready(function () {
    //记住密码功能
    var uid = getCookie("uid");
    var pwd = getCookie("pwd");
    $("#user").val(uid);
    $("#pwd").val(pwd);
});

//获取cookie
function getCookie(cname) {
    var name = cname + "=";
    var ca = document.cookie.split(';');
    for (var i = 0; i < ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) == ' ') c = c.substring(1);
        if (c.indexOf(name) != -1) return c.substring(name.length, c.length);
    }
    return "";
}

//记住密码功能
function remFunc() {
    var remFlag = $("input[type='checkbox']").is(':checked');
    if (remFlag == true) { //如果选中设置remFlag为true
        //cookie存用户名和密码,回显的是真实的用户名和密码,存在安全问题.
        var conFlag = confirm("记录密码功能不宜在公共场所(如网吧等)使用,以防密码泄露.您确定要使用此功能吗?");
        if (conFlag) { //确认标志
            $("#remFlag").val(true);
        } else {
            $("input[type='checkbox']").removeAttr('checked');
            $("#remFlag").val(false);
        }
    } else { //如果没选中设置remFlag为false
        $("#remFlag").val(false);
    }
}
