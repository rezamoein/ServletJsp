<%@ page import="ir.beans.Student" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: Producer
  Date: 3/10/2018
  Time: 6:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="student" class="ir.beans.Student" scope="request"/>

<html>
<head>
    <title>ServletJSP</title>
</head>
<body>
<h1>
    <a href="init">Init</a>
</h1>
<table border="1" cellpadding="3" translate="yes">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Birthday</th>
        <th>Branch</th>

    </tr>

    <%
        List<Student> studentList = student.getAll();
        for (Student s :
                studentList) {
    %>
    <tr>
        <td>
            <%=s.getPersonId()%>
        </td>
        <td>
            <%=s.getFirstName()%> <%=s.getLastName()%>
        </td>
        <td>
            <%=new SimpleDateFormat("yyyy-MM-dd").format(s.getBirthday())%>
        </td>
        <td>
            <%=s.getBranch()%>
        </td>
    </tr>
    <%
        }
    %>
</table>


</body>
</html>
