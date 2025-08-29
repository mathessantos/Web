package br.edu.ifpr.pgua.eic.tads.models;

import java.util.ArrayList;

import br.edu.ifpr.pgua.eic.tads.Main;

public class Agenda {
    private String descricao;
    private String tipo;
    
    public Agenda(String descricao, String tipo) {
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public void adicionarContato(Contato contato) {
        Main.contatos.add(contato);
    }

    public ArrayList<Contato> listarContatos() {
        return Main.contatos;
    }

    public String toString() {
        return "Descrição:" + this.descricao + "\n" +
               "Tipo:" + this.tipo + "\n";
    }
}
