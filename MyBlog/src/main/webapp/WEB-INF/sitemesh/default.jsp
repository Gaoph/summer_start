<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title><sitemesh:title/></title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <sitemesh:head/>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css"/>">

    <script src="<c:url value="/js/jquery-3.1.1.min.js"/>"></script>
    <script src="<c:url value="/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/uploadify/jquery.uploadify.min.js"/>"></script>
</head>

<body>
<div class="container">
    <div id="content">
        <sitemesh:body/>
    </div>
</div>
</body>
</html>