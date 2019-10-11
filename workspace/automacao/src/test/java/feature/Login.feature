#language:pt
@smock
Funcionalidade: Realizar Login

  Cenario: Realizar Login com sucesso
    Dado que eu esteja na tela de login
    Quando preencher o campo usuario "mce_gmenezes" e senha "qL5*u!hof" e clicar no botao entrar
    Entao o sistema realiza login e apresenta a tela inicial
