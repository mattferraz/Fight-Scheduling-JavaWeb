<%@ page import="com.ifpe.tads.mhsf.streetfighters.model.business.Local" %><%--
  Created by IntelliJ IDEA.
  User: mateus
  Date: 4/28/22
  Time: 12:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<h1>Atualizar um Local</h1>

<%
    Local local = (Local)request.getAttribute("local");
%>

<form class="form" method="post"  action="LocalServletNovo">

    <input type="hidden" name="id" value="<%= local.getId() %>"/>
    <input type="hidden" name="op" value="update"/>


    <table class="table">
        <tr>
            <td>
                Apelidio:
            </td>
            <td>
                <input type="text" name="apelido" value="<%= local.getApelido()%>" />
            </td>
        </tr>
        <tr>
            <td>
                Endereço:
            </td>
            <td>
                <input type="text" name="endereco" value="<%= local.getEndereco()%>"/>
            </td>
        </tr>
        <tr>
            <td>
                Capacidade:
            </td>
            <td>
                <input type="text" name="capacidade" value="<%= local.getCapacidade() %>" />
            </td>
        </tr>
        <tr>
            <td rowspan="2">
                <input type="submit" class="btn btn-primary" value="atualizar"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
