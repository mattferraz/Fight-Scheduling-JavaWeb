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
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author mtshs
 */
public class FetchTag extends SimpleTagSupport {
    private String desiredClass;
    private Integer index;

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Object fetchedData = null;
        if (desiredClass.equalsIgnoreCase("lutador") && index != null) {
            Lutador fighter = FightersRepository.getInstance().getFighterById(index);
            fetchedData = fighter;
        }
        else if (desiredClass.equalsIgnoreCase("local") && index != null) {
            Local place = RepositorioLocalMemo.getCurrentInstance().ler(index);
            fetchedData = place;
        }
        else if (desiredClass.equalsIgnoreCase("lutador")) {
            List<Lutador> fighters = FightersRepository.getInstance().getAllFighters();
            fetchedData = fighters;
        }
        else if (desiredClass.equalsIgnoreCase("local")) {
            List<Local> places = RepositorioLocalMemo.getCurrentInstance().lerTudo();
            fetchedData = places;
        }
        
        if (fetchedData == null) {
            fetchedData = "Índice inválido!";
        }
        getJspContext().setAttribute("fetchedData", fetchedData, PageContext.PAGE_SCOPE);
    }
    
    

    public String getDesiredClass() {
        return desiredClass;
    }

    public void setDesiredClass(String desiredClass) {
        this.desiredClass = desiredClass;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
    
    
}
