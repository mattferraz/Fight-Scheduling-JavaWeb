/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifpe.tads.mhsf.streetfighters.tags;

import com.ifpe.tads.mhsf.streetfighters.model.business.Local;
import com.ifpe.tads.mhsf.streetfighters.model.business.Lutador;
import com.ifpe.tads.mhsf.streetfighters.model.repositories.FightersRepository;
import com.ifpe.tads.mhsf.streetfighters.model.repositories.RepositorioLocalMemo;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author mtshs
 */
public class TableTag extends SimpleTagSupport {
    private String desiredClass;

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        String header = "";
        String body = "";
        if (desiredClass.equalsIgnoreCase("lutador")) {
            List<Lutador> fighters = FightersRepository.getInstance().getAllFighters();
            header = "<th>ID</th><th>Nome</th><th>Apelido</th><th>Peso</th><th>Altura</th>"
                    + "<th>Nascimento</th><th>Destro</th><th>Curso</th>"
                    + "<th>Arte Marcial</th><th>Contato de Emergência</th>"
                    + "<th>Operações</th>";
            for (Lutador fighter : fighters) {
                body += "<tr><td>"+fighter.getId()+"</td>"
                    + "<td>"+fighter.getNome()+"</td>"
                    + "<td>"+fighter.getApelido()+"</td>"
                    + "<td>"+fighter.getPeso()+"</td>"
                    + "<td>"+fighter.getAltura()+"</td>"
                    + "<td>"+new SimpleDateFormat("dd/MM/yyyy").format(fighter.getNascimento())+"</td>"
                    + "<td>"+fighter.isDestro()+"</td>"
                    + "<td>"+fighter.getCurso()+"</td>"
                    + "<td>"+fighter.getArtMarcial()+"</td>"
                    + "<td>"+fighter.getContatoEmergencia()+"</td>"
                    + "<td><a href='FightersServlet?id="+fighter.getId()+""
                    + "&operation=update'>Editar</a><a href='FightersServlet?"
                    + "id="+fighter.getId()+"&operation=delete'>Excluir</a></td></tr>";
            }
        }
        
        else if (desiredClass.equalsIgnoreCase("local")) {
            List<Local> places = RepositorioLocalMemo.getCurrentInstance().lerTudo();
            header = "<th>ID</th><th>Endereco</th><th>Apelido</th><th>Capacidade</th><th>Operacoes</th>";
            for (Local place : places) {
                body += "<tr><td>"+place.getId()+"</td>"
                    + "<td>"+place.getEndereco()+"</td>"
                    + "<td>"+place.getApelido()+"</td>"
                    + "<td>"+place.getCapacidade()+"</td>"
                    + "<td><a href='LocalServletNovo?id="+place.getId()+"&op=update'>alterar</a>"
                    + "<a href='LocalServletNovo?id="+place.getId()+"&op=delete'>deletar</a></td></tr>";
            }
        }
        
        getJspContext().getOut().write("<table border='1'><tr>"+header+"</tr>"+body+"</table>");        
    }
    
    

    public String getDesiredClass() {
        return desiredClass;
    }

    public void setDesiredClass(String desiredClass) {
        this.desiredClass = desiredClass;
    }
    
    
}
