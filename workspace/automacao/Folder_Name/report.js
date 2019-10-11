$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 3,
  "name": "Realizar Login",
  "description": "",
  "id": "realizar-login",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@smock"
    }
  ]
});
formatter.before({
  "duration": 2409433983,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Realizar Login com sucesso",
  "description": "",
  "id": "realizar-login;realizar-login-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 6,
  "name": "que eu esteja na tela de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "preencher o campo usuario \"mce_gmenezes\" e senha \"qL5*u!hof\" e clicar no botao entrar",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "o sistema realiza login e apresenta a tela inicial",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.que_eu_esteja_na_tela_de_login()"
});
formatter.result({
  "duration": 68033422,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mce_gmenezes",
      "offset": 27
    },
    {
      "val": "qL5*u!hof",
      "offset": 50
    }
  ],
  "location": "LoginSteps.preencher_o_campo_usuario_e_senha_e_clicar_no_botao_entrar(String,String)"
});
formatter.result({
  "duration": 195474330,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.o_sistema_realiza_login_e_apresenta_a_tela_inicial()"
});
formatter.result({
  "duration": 450891903,
  "status": "passed"
});
formatter.after({
  "duration": 936417001,
  "status": "passed"
});
});