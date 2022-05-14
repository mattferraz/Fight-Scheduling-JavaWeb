<%@ page import="com.ifpe.tads.mhsf.streetfighters.model.business.Lutador" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: mateus
  Date: 4/28/22
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Alterar Lutador</title>
</head>
<body>
    <h1>Alterar lutador</h1>
    <%
        final Lutador fighter = (Lutador)request.getAttribute("fighter");
    %>
    <form class="form" method="post" action="FightersServlet?id=<%=fighter.getId()%>&operation=update">
        <table class="table">
            <tr>
                <td>
                    Nome:
                </td>
                <td>
                    <input type="text" name="nome" value="<%=fighter.getNome()%>"/>
                </td>
            </tr>
            <tr>
                <td>
                    Apelido:
                </td>
                <td>
                    <input type="text" name="apelido" value="<%=fighter.getApelido()%>"/>
                </td>
            </tr>
            <tr>
                <td>
                    Peso:
                </td>
                <td>
                    <input type="text" name="peso" value="<%=fighter.getPeso()%>"/>
                </td>
            </tr>
            <tr>
                <td>
                    Altura:
                </td>
                <td>
                    <input type="text" name="altura" value="<%=fighter.getAltura()%>"/>
                </td>
            </tr>
            <tr>
                <td>
                    Nascimento:
                </td>
                <td>
                    <input type="text" name="nascimento" value="<%=new SimpleDateFormat("dd/MM/yyyy").format(fighter.getNascimento())%>"/>
                </td>
            </tr>
            <tr>
                <td>
                    Destro:
                </td>
                <td>
                    <input type="text" name="destro" value="<%=fighter.isDestro()%>"/>
                </td>
            </tr>
            <tr>
                <td>
                    Curso:
                </td>
                <td>
                    <input type="text" name="curso" value="<%=fighter.getCurso()%>"/>
                </td>
            </tr>
            <tr>
                <td>
                    Arte Marcial:
                </td>
                <td>
                    <input type="text" name="arteMarcial" value="<%=fighter.getArtMarcial()%>"/>
                </td>
            </tr>
            <tr>
                <td>
                    Contato de Emergência:
                </td>
                <td>
                    <input type="text" name="contatoEmergencia" value="<%=fighter.getContatoEmergencia()%>"/>
                </td>
            </tr>
            <tr>
                <td rowspan="2">
                    <input type="submit" class="btn btn-primary" value="Salvar"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
