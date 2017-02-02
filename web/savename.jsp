<%--
  Created by IntelliJ IDEA.
  User: tkanchanawanchai6403
  Date: 1/31/2017
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="edu.nvcc.csc.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Savename</title>
</head>
<body>
<%!
    ArrayList studentList = new ArrayList();
    ArrayList getStudentList() {
        return studentList;
    }
%>
<h1>Student List before adding student</h1> <br/><%=getStudentList()%>
<%
    String studentID = request.getParameter("studentID");
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    int id = Integer.parseInt(studentID);
    Student student = new Student(id,firstName,lastName,username,password);
    studentList.add(student);
    out.print("<h1>After adding student<h1> <br/>"+ studentList+ " <br/>");
%>


</body>
</html>
