package br.edu.ifpr.pgua.eic.tads;

import java.util.ArrayList;

import br.edu.ifpr.pgua.eic.tads.controllers.CadastroController;
import br.edu.ifpr.pgua.eic.tads.controllers.IndexController;
import br.edu.ifpr.pgua.eic.tads.models.Agenda;
import br.edu.ifpr.pgua.eic.tads.models.Contato;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

/**
 * Hello world!
 *
 */
public class Main {
    public static ArrayList<Contato> contatos = new ArrayList<>();
    public static void main( String[] args ){
        // Contato contato = new Contato("Matheus", "matheussantos@gmail.com", "41995626217");
        // Agenda agenda = new Agenda("descricao", "tipo");
        // agenda.adicionarContato(contato);
        // System.out.println(agenda.listarContatos());

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public", Location.CLASSPATH);
        }).start(7000);
        
        CadastroController cadastroController = new CadastroController();
        IndexController indexController = new IndexController();

        app.get("/", ctx -> {
            ctx.redirect("/index.html");
        });

        app.get("/cadastro", cadastroController.get);
        app.get("/index", indexController.get);
    }
}
    