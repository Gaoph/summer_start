<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<div class="container">
    <div class="row">
        <div class="col-md-5"></div>
        <div class="col-md-4">
            <h3>图片列表</h3>
        </div>
        <div class="col-md-4"></div>
    </div>
    <div class="row">
        <table class="table table-bordered">
            <thead>
            <tr class="success">
                <th>名称</th>
                <th>上传时间</th>
                <th>图片</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${pictures}" var="pic" varStatus="vs">
                <tr>
                    <td>${pic.picName}</td>
                    <td><fmt:formatDate value="${pic.createdAt}" type="both" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                    <td><img src="${pic.picPath}" style="width: 120px;height: 120px"></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
