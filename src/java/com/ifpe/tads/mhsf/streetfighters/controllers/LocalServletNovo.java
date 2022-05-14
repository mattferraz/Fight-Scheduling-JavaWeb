package com.ifpe.tads.mhsf.streetfighters.controllers;

import com.ifpe.tads.mhsf.streetfighters.model.business.Local;
import com.ifpe.tads.mhsf.streetfighters.model.repositories.RepositorioLocalMemo;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "LocalServletNovo", value = "/LocalServletNovo")
public class LocalServletNovo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String operacao = request.getParameter("op");

        if(operacao != null && operacao.equals("update")){

            int id = Integer.parseInt(request.getParameter("id"));

            Local l = RepositorioLocalMemo.getCurrentInstance().ler(id);

            request.setAttribute("local", l);

            request.getRequestDispatcher("/atualizaLocalNovo.jsp").forward(request, response);

            return;

        }

        if(operacao!=null && operacao.equals("delete")){

            int id = Integer.parseInt(request.getParameter("id"));

            RepositorioLocalMemo.getCurrentInstance().remover(id);

        }

        List<Local> locais = RepositorioLocalMemo
                .getCurrentInstance().lerTudo();

        request.setAttribute("locais", locais);

        request.getRequestDispatcher("/locaisNovo.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String apelido = request.getParameter("apelido");
        String endereco = request.getParameter("endereco");
        int capacidade = Integer.parseInt(request.getParameter("capacidade"));

        Local l = new Local();

        l.setApelido(apelido);
        l.setEndereco(endereco);
        l.setCapacidade(capacidade);

        String operacao = request.getParameter("op");

        if(operacao != null && operacao.equals("update")){

            int id = Integer.parseInt(request.getParameter("id"));

            l.setId(id);

            RepositorioLocalMemo.getCurrentInstance().alterar(l);

            response.sendRedirect("LocalServletNovo?msg=Local%20"+apelido+"%20alterado%20com%20sucesso!");

            return;

        }

        RepositorioLocalMemo.getCurrentInstance().inserir(l);

        request.setAttribute("msg", "Local "+apelido+" cadastrado com sucesso!");

        response.sendRedirect("LocalServletNovo?msg=Local%20"+apelido+"%20cadastrado%20com%20sucesso!");
    }
}
