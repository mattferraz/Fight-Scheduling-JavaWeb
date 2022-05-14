<%@ page import="com.ifpe.tads.mhsf.streetfighters.model.business.Lutador" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: mateus
  Date: 4/28/22
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="customtags" uri="https://devcaotics.org/customTags" %>
<html>
<head>
    <title>Show Fighters</title>
</head>
<body>
    <customtags:fetchTag desiredClass="lutador"></customtags:fetchTag>
    <h2>${pageContext.getAttribute("fetchedData").size()}</h2>
    <customtags:fetchTag desiredClass="lutador" index="1"></customtags:fetchTag>
    <!--Função getName() removida para não quebrar caso index inválido seja informado.-->
    <h2>${pageContext.getAttribute("fetchedData")}</h2>
    <h1>Lutadores</h1>
    <%
        if (request.getAttribute("msg") != null) {
    %>
    <h2><%= request.getAttribute("msg") %></h2>
    <%
            request.removeAttribute("msg");
        }
    %>
    <customtags:tableTag desiredClass="lutador"></customtags:tableTag>
</body>
</html>
