
$(document).ready(function(){
    $("#user").blur(usename);
    $("#pwd").blur(passw);

    $("#myform").submit(function(){
        var lang=true;
        if(!usename()||!passw()){
            lang=false;
        }
        return lang;
    });
});


function usename(){
    var n=$("#user").val();
    var reg=/^[a-z0-9_-]{4,16}$/;
    if(n==""||n==null){
        $("#user_prompt").html("用户名不能为空");
        return false;
    }
    if(!reg.test(n)){
        $("#user_prompt").html("用户名由英文字母和数字组成的4-16位字符，以字母开头");
        return false;
    }
    $("#user_prompt").html("");
    return true;
}
function passw(){
    var pass=$("#pwd").val();
    var reg=/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{4,10}$/;
    if(pass==""||pass==null){
        $("#pwd_prompt").html("密码不能为空");
        return false;
    }
    if(!reg.test(pass)){
        $("#pwd_prompt").html("密码由英文字母和数字组成的4-10位字符");
        return false;
    }
    $("#pwd_prompt").html("");
    return true;
}