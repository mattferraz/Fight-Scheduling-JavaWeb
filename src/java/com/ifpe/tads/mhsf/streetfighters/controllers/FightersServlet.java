package com.ifpe.tads.mhsf.streetfighters.controllers;

import com.ifpe.tads.mhsf.streetfighters.model.business.Lutador;
import com.ifpe.tads.mhsf.streetfighters.model.repositories.FightersRepository;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "FightersServlet", value = "/FightersServlet")
public class FightersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String operation = request.getParameter("operation");
        if ((operation != null) && operation.equals("update")) {
            int id = Integer.parseInt(request.getParameter("id"));
            Lutador fighter = FightersRepository.getInstance().getFighterById(id);
            request.setAttribute("fighter", fighter);
            request.getRequestDispatcher("/ModifyFighter.jsp").forward(request, response);
            return;
        }
        if ((operation != null) && operation.equals("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            FightersRepository.getInstance().deleteFighterById(id);
            request.setAttribute("msg", "Lutador deletado com sucesso!");
        }
        List<Lutador> fighters = FightersRepository.getInstance().getAllFighters();
        request.setAttribute("fighters", fighters);
        request.getRequestDispatcher("/ShowFighters.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String nome = request.getParameter("nome");
        final String apelido = request.getParameter("apelido");
        final double peso = Double.parseDouble(request.getParameter("peso"));
        final double altura = Double.parseDouble(request.getParameter("altura"));
        Date nascimento = null;
        try {
            nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("nascimento"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        final boolean destro = Boolean.parseBoolean(request.getParameter("destro"));
        final String curso = request.getParameter("curso");
        final String arteMarcial = request.getParameter("arteMarcial");
        final String contatoEmergencia = request.getParameter("contatoEmergencia");

        final Lutador fighter = new Lutador(nome, apelido, peso, altura, nascimento, destro,
                curso, arteMarcial, contatoEmergencia);

        if (request.getParameter("operation") != null && request.getParameter("operation").equals("update")) {
            final int id = Integer.parseInt(request.getParameter("id"));
            fighter.setId(id);
            FightersRepository.getInstance().editFighter(fighter);
            request.setAttribute("msg", "Lutador atualizado com sucesso!");
        }

        else {
            FightersRepository.getInstance().addFighter(fighter);
        }

        response.sendRedirect("FightersServlet");
    }
}
