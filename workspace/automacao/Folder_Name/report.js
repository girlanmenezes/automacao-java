$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Noticias.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 3,
  "name": "Publicador Noticias",
  "description": "",
  "id": "publicador-noticias",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@noticia"
    }
  ]
});
formatter.before({
  "duration": 2439927059,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Puclicar noticia Template de Referencia noticiaProjetoGrafico.xml",
  "description": "",
  "id": "publicador-noticias;puclicar-noticia-template-de-referencia-noticiaprojetografico.xml",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 6,
  "name": "que eu tenha realizado login",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "que eu esteja na tela de adicionar editoria noticiaProjetoGrafico",
  "keyword": "E "
});
formatter.step({
  "line": 8,
  "name": "preencher todos os campos obrigatorios e acionar a opção publicar",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "o sistema deve apresentar a publicação conforme template",
  "keyword": "Entao "
});
formatter.match({
  "location": "NoticiasSteps.que_eu_tenha_realizado_login()"
});
formatter.result({
  "duration": 771947262,
  "status": "passed"
});
formatter.match({
  "location": "NoticiasSteps.que_eu_esteja_na_tela_de_adicionar_editoria_noticiaProjetoGrafico()"
});
formatter.result({
  "duration": 2304193307,
  "status": "passed"
});
formatter.match({
  "location": "NoticiasSteps.preencher_todos_os_campos_obrigatorios_e_acionar_a_opção_publicar()"
});
formatter.result({
  "duration": 1196202087,
  "status": "passed"
});
formatter.match({
  "location": "NoticiasSteps.o_sistema_deve_apresentar_a_publicação_conforme_template()"
});
formatter.result({
  "duration": 17455,
  "status": "passed"
});
formatter.after({
  "duration": 214642805,
  "status": "passed"
});
});