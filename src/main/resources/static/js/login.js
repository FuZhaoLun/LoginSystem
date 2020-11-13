function check(){
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
    xhr.open("GET","/Test/LoginCheck?userName="+userName);
    //发送POST请求
    xhr.send(null);
    //监听响应
    xhr.onreadystatechange = function(){
        if(xhr.readyState==4&&xhr.status==200){
            //获取响应
            tips.innerHTML = xhr.responseText;
        }
    }
}

function login(){
}

function empty(){
    document.getElementById("userName").value = "";
}