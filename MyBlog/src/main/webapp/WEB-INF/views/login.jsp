<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<link href="<c:url value="/css/login.css"/>" rel="stylesheet">

<div class="signin">
    <div class="signin-head"><img src="<c:url value="/images/head_120.png"/>" class="img-circle"></div>
    <form class="form-signin" role="form">
        <input type="text" class="form-control" placeholder="用户名" required autofocus/>
        <input type="password" class="form-control" placeholder="密码" required/>
        <button class="btn btn-lg btn-warning btn-block" type="submit">登录</button>
        <label class="checkbox">
            <input type="checkbox" value="remember-me"> 记住我
        </label>
    </form>
</div>

