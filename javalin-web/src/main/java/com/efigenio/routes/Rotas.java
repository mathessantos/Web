package com.efigenio.routes;

import com.efigenio.controllers.ContatoController;
import com.efigenio.controllers.IndexController;

import io.javalin.Javalin;

public class Rotas {
    private IndexController indexController;
    private ContatoController contatoController;

    public Rotas() {
        this.indexController = new IndexController();
        this.contatoController = new ContatoController();
    }

    public void registraRotas(Javalin app) {
        app.get("/", indexController.get);
        app.get("/cadastro", contatoController.get);
        app.post("/contatos", contatoController.post);
    }
}
