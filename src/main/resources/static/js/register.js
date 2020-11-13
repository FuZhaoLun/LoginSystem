function register(){
    window.location.href='register.html';
}

function checkUserName(){
    //获取用户名
    var userName = document.getElementById("userName").value;
    var xhr;
    //创建XMLHttpRequest对象
    if(window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }
    else{
        xhr = new ActiveXObject("Microsoft.XMLHTTP");
    }
    //发送GET请求
    xhr.open("GET","/Test/RegisterCheck?userName="+userName);
    //发送POST请求
    xhr.send(null);
    //监听响应
    xhr.onreadystatechange = function(){
        if(xhr.readyState==4&&xhr.status==200){
            //获取响应
            userNameTip.innerHTML = xhr.responseText;
        }
    }
}

function checkPassword(){
    //获取密码
    var password1 = document.getElementById("password1").value;
    var password2 = document.getElementById("password2").value;
    var xhr;
    //创建XMLHttpRequest对象
    if(window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }
    else{
        xhr = new ActiveXObject("Microsoft.XMLHTTP");
    }
    //发送GET请求
    xhr.open("GET","/Test/CheckPassword?password1="+password1+"&password2="+password2);
    //发送POST请求
    xhr.send(null);
    //监听响应
    xhr.onreadystatechange = function(){
        if(xhr.readyState==4&&xhr.status==200){
            //获取响应
            passwordTip.innerHTML = xhr.responseText;
        }
    }
}