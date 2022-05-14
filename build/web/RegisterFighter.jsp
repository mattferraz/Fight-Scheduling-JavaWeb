<%--
  Created by IntelliJ IDEA.
  User: mateus
  Date: 4/28/22
  Time: 2:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Cadastrar Lutador</h1>
<form class="form" method="post" action="FightersServlet">
    <table class="table">
        <tr>
            <td>
                Nome:
            </td>
            <td>
                <input type="text" name="nome"/>
            </td>
        </tr>
        <tr>
            <td>
                Apelido:
            </td>
            <td>
                <input type="text" name="apelido"/>
            </td>
        </tr>
        <tr>
            <td>
                Peso:
            </td>
            <td>
                <input type="text" name="peso"/>
            </td>
        </tr>
        <tr>
            <td>
                Altura:
            </td>
            <td>
                <input type="text" name="altura"/>
            </td>
        </tr>
        <tr>
            <td>
                Nascimento:
            </td>
            <td>
                <input type="text" name="nascimento"/>
            </td>
        </tr>
        <tr>
            <td>
                Destro:
            </td>
            <td>
                <input type="text" name="destro"/>
            </td>
        </tr>
        <tr>
            <td>
                Curso:
            </td>
            <td>
                <input type="text" name="curso"/>
            </td>
        </tr>
        <tr>
            <td>
                Arte Marcial:
            </td>
            <td>
                <input type="text" name="arteMarcial"/>
            </td>
        </tr>
        <tr>
            <td>
                Contato de Emergência:
            </td>
            <td>
                <input type="text" name="contatoEmergencia"/>
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
