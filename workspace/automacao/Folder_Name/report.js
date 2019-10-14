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
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 2489933338,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Realizar Login com sucesso",
  "description": "",
  "id": "realizar-login;realizar-login-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 5,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que eu esteja na tela de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "preencher o campo usuario \"mce_gmenezes\" e senha \"qL5*u!hof\" e clicar no botao entrar",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "o sistema realiza login e apresenta a tela inicial",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.que_eu_esteja_na_tela_de_login()"
});
formatter.result({
  "duration": 81593657,
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
  "duration": 699242328,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.o_sistema_realiza_login_e_apresenta_a_tela_inicial()"
});
formatter.result({
  "duration": 420296523,
  "status": "passed"
});
formatter.after({
  "duration": 980791767,
  "status": "passed"
});
formatter.before({
  "duration": 1735538067,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Realizar Login com sucesso com usuario bloqueiro, aceitando os temos de uso",
  "description": "",
  "id": "realizar-login;realizar-login-com-sucesso-com-usuario-bloqueiro,-aceitando-os-temos-de-uso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 11,
      "name": "@loginBlogueiro"
    },
    {
      "line": 11,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "que eu esteja na tela de login e tenha o perfil de bloqueiro e não tenha realizado o aceitado o termo",
  "keyword": "Dado "
});
formatter.step({
  "line": 14,
  "name": "preencher o campo usuario \"blg_qaum\" e senha \"8\u0026?jOxiwR\" e clicar no botao entrar",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "o sistema realiza login e apresenta a tela de termo de aceite",
  "keyword": "Entao "
});
formatter.step({
  "line": 16,
  "name": "irei realizar o aceite do termo de serviço",
  "keyword": "E "
});
formatter.match({
  "location": "LoginBlogueiroSteps.que_eu_esteja_na_tela_de_login_e_tenha_o_perfil_de_bloqueiro_e_não_tenha_realizado_o_aceitado_o_termo()"
});
formatter.result({
  "duration": 93278016,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "blg_qaum",
      "offset": 27
    },
    {
      "val": "8\u0026?jOxiwR",
      "offset": 46
    }
  ],
  "location": "LoginSteps.preencher_o_campo_usuario_e_senha_e_clicar_no_botao_entrar(String,String)"
});
formatter.result({
  "duration": 704365234,
  "status": "passed"
});
formatter.match({
  "location": "LoginBlogueiroSteps.o_sistema_realiza_login_e_apresenta_a_tela_de_termo_de_aceite()"
});
formatter.result({
  "duration": 381549875,
  "status": "passed"
});
formatter.match({
  "location": "LoginBlogueiroSteps.irei_realizar_o_aceite_do_termo_de_serviço()"
});
formatter.result({
  "duration": 148750474,
  "status": "passed"
});
formatter.after({
  "duration": 810368577,
  "status": "passed"
});
formatter.before({
  "duration": 1752869453,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Realizar Login com sucesso com usuario bloqueiro que já tenha aceitado os temos de uso",
  "description": "",
  "id": "realizar-login;realizar-login-com-sucesso-com-usuario-bloqueiro-que-já-tenha-aceitado-os-temos-de-uso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 18,
      "name": "@loginBlogueiro"
    },
    {
      "line": 18,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "que eu esteja na tela de login e tenha o perfil de bloqueiro tenha realizado o aceitado o termo",
  "keyword": "Dado "
});
formatter.step({
  "line": 21,
  "name": "preencher o campo usuario \"blg_qaum\" e senha \"8\u0026?jOxiwR\" e clicar no botao entrar",
  "keyword": "Quando "
});
formatter.step({
  "line": 22,
  "name": "o sistema realiza login e apresenta a tela inicial",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginBlogueiroSteps.que_eu_esteja_na_tela_de_login_e_tenha_o_perfil_de_bloqueiro_tenha_realizado_o_aceitado_o_termo()"
});
formatter.result({
  "duration": 308848,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "blg_qaum",
      "offset": 27
    },
    {
      "val": "8\u0026?jOxiwR",
      "offset": 46
    }
  ],
  "location": "LoginSteps.preencher_o_campo_usuario_e_senha_e_clicar_no_botao_entrar(String,String)"
});
formatter.result({
  "duration": 701458569,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.o_sistema_realiza_login_e_apresenta_a_tela_inicial()"
});
formatter.result({
  "duration": 653624411,
  "status": "passed"
});
formatter.after({
  "duration": 723891528,
  "status": "passed"
});
});