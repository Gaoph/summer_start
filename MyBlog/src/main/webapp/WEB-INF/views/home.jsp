<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<body>
<table border="1"  bordercolor="#00CCCC">
    <c:forEach items="${userList}" var="user" varStatus="vs">
        <tr>

            <td align="center">${user.userId}</td>
            <td align="center">${user.userName}</td>
            <td align="center">${user.userPassword}</td>
            <td align="center">${user.userNickname}</td>
            <td align="center">${user.userSex}</td>
        </tr>
    </c:forEach>
</table>
</body>
