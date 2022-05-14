<%@ page import="com.ifpe.tads.mhsf.streetfighters.model.business.Local" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: mateus
  Date: 4/28/22
  Time: 12:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="customtags" uri="https://devcaotics.org/customTags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


    <title>JSP Page</title>
</head>
<body>
<h1>LocaisCadastrados</h1>

<%
    String mensagem = request.getParameter("msg");

    if(mensagem != null){
%>
<h3><%= mensagem %></h3>
<%
    }
%>
<customtags:tableTag desiredClass="local"></customtags:tableTag>

</body>
</html>