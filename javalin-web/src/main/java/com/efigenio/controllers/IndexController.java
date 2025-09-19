package com.efigenio.controllers;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;

import com.efigenio.models.Agenda;

import io.javalin.http.Handler;

public class IndexController {
    private String caminho = "contatos.txt";

    public Handler get = ctx -> {
        gravarArquivoDeTexto();
        lerArquivoDeTexto();
        ctx.render("index.ftl", Map.of("contato", Agenda.listarContatos()));
    };
    
    public void lerArquivoDeTexto() throws FileNotFoundException {
        try{
            BufferedReader br = new BufferedReader(new FileReader(caminho));
            String linha;
            br.close();
            while ((linha = br.readLine()) != null) {}
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void gravarArquivoDeTexto(){
        String conteudo ="mensagem texto";

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(caminho));
            bw.write(conteudo);
            bw.newLine();
            bw.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
