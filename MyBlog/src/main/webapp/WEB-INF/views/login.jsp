<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="<c:url value="/css/login.css"/>" rel="stylesheet">

<div class="signin">

    <div class="signin-head">
        <img src="<c:url value="/images/head_120.png"/>" class="img-circle">
    </div>
    <form class="form-signin" role="form" action="/login/do_login" method="post">
        <input type="text" class="form-control" name="userName" placeholder="用户名" required autofocus/>
        <input type="password" class="form-control" name="userPassword" placeholder="密码" required/>
        <button class="btn btn-lg btn-warning btn-block" type="submit">登录</button>
        <label class="checkbox">
            <input type="checkbox" value="remember-me">记住我
        </label>

        <font color="red">注意，您有可能没有权限!</font>

    </form>
</div>

