<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="<c:url value="/js/picture/uploadify.css"/>" rel="stylesheet">
<script src="<c:url value="/js/picture/picture.js"/>"></script>

<div class="container">
    <div class="row">
        <input id="file_upload" name="file_upload" type="file" multiple="multiple"/>
    </div>
    <div class="row">
        <div id="queue"></div>
    </div>
</div>