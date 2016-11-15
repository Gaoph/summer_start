<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="<c:url value="/js/picture/uploadify.css"/>" rel="stylesheet">
<script src="<c:url value="/js/picture/picture.js"/>"></script>

<div>
    <div>
        <input id="file_upload" name="file_upload" type="file" multiple="multiple"/>
    </div>
    <div id="queue"></div>
</div>