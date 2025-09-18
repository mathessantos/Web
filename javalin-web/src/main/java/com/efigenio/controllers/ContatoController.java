package com.efigenio.controllers;

import java.util.Map;

import com.efigenio.models.Agenda;
import com.efigenio.models.Contato;

import io.javalin.http.Handler;

public class ContatoController {

    public Handler get = ctx -> {
        ctx.render("cadastro.ftl");
    };

    public Handler post = ctx -> {
        String nome = ctx.formParam("name");
        String telefone = ctx.formParam("phone");
        String email = ctx.formParam("email");

        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);

        Contato contato = new Contato(nome, telefone, email);
        Agenda.adicionarContato(contato);

        ctx.render("index.ftl", Map.of("contato", Agenda.listarContatos()));
    };
}
