<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <div class="row">
        <div class="col-md-5"></div>
        <div class="col-md-4">
            <h3>用户表</h3>
        </div>
        <div class="col-md-4"></div>
    </div>
    <div class="row">
        <table class="table table-bordered">
            <thead>
            <tr class="success">
                <th>编号</th>
                <th>账号</th>
                <th>密码</th>
                <th>昵称</th>
                <th>性别</th>
                <th>年龄</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${userList}" var="user" varStatus="vs">
                <tr>
                    <td>${user.userId}</td>
                    <td>${user.userName}</td>
                    <td>${user.userPassword}</td>
                    <td>${user.userNickname}</td>
                    <td>${user.userSex}</td>
                    <td>${user.userAge}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>