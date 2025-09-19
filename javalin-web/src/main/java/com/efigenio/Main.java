package com.efigenio;

import java.util.ArrayList;

import com.efigenio.config.AppConfig;
import com.efigenio.models.Contato;
import com.efigenio.routes.Rotas;

public class Main {
    public static ArrayList<Contato> databaseContato = new ArrayList<>();
    
    public static void main(String[] args) {
        Rotas rotas = new Rotas();
        AppConfig appConfig = new AppConfig();

        rotas.registraRotas(appConfig.iniciaApp());
    }
}