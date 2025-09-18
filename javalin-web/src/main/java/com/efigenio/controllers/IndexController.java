package com.efigenio.controllers;
import java.util.Map;

import com.efigenio.models.Agenda;

import io.javalin.http.Handler;

public class IndexController {

    public Handler get = ctx -> {
        ctx.render("index.ftl", Map.of("contato", Agenda.listarContatos()));
    };
}
