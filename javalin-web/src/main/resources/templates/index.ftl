<!DOCTYPE html>

<#import "macros.ftl" as ui> 

<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="css/home.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Outfit:wght@100..900&display=swap" rel="stylesheet">
  <title>Agenda de Contatos</title>
</head>
<body>  
  <h1>Agenda de Contatos</h1>
  <section class="contact-list">
    <#list contato as c>
      <@ui.card name=c.nome email=c.email phone=c.telefone/>
    </#list>
  </section>
  <a href="/cadastro" class="btn">Adicionar Contato</a>
</body>
</html>