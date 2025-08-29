package br.edu.ifpr.pgua.eic.tads.models;

import java.util.ArrayList;
import br.edu.ifpr.pgua.eic.tads.Main;

public class Contato {
    private String nome;
    private String email;
    private String telefone;
    
    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String toString() {
        return "Nome: " + nome + "\n" +
               "Email: " + email + "\n" +
               "Telefone: " + telefone + "\n";
    }
}
