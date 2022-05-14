<%--
  Created by IntelliJ IDEA.
  User: mateus
  Date: 4/28/22
  Time: 12:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<h1>Cadastro de local</h1>

<form class="form" method="post"  action="LocalServletNovo">

    <table class="table">
        <tr>
            <td>
                Apelidio:
            </td>
            <td>
                <input type="text" name="apelido"  />
            </td>
        </tr>
        <tr>
            <td>
                Endereço:
            </td>
            <td>
                <input type="text" name="endereco" />
            </td>
        </tr>
        <tr>
            <td>
                Capacidade:
            </td>
            <td>
                <input type="text" name="capacidade"  />
            </td>
        </tr>
        <tr>
            <td rowspan="2">
                <input type="submit" class="btn btn-primary" value="cadastrar"/>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
