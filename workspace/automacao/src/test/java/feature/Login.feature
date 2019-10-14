#language:pt

Funcionalidade: Realizar Login

	@login
  Cenario: Realizar Login com sucesso
    Dado que eu esteja na tela de login
    Quando preencher o campo usuario "mce_gmenezes" e senha "qL5*u!hof" e clicar no botao entrar
    Entao o sistema realiza login e apresenta a tela inicial

  @loginBlogueiro @login
  Cenario: Realizar Login com sucesso com usuario bloqueiro, aceitando os temos de uso
    Dado que eu esteja na tela de login e tenha o perfil de bloqueiro e não tenha realizado o aceitado o termo
    Quando preencher o campo usuario "blg_qaum" e senha "8&?jOxiwR" e clicar no botao entrar
    Entao o sistema realiza login e apresenta a tela de termo de aceite
    E irei realizar o aceite do termo de serviço

  @loginBlogueiro @login
  Cenario: Realizar Login com sucesso com usuario bloqueiro que já tenha aceitado os temos de uso
    Dado que eu esteja na tela de login e tenha o perfil de bloqueiro tenha realizado o aceitado o termo
    Quando preencher o campo usuario "blg_qaum" e senha "8&?jOxiwR" e clicar no botao entrar
    Entao o sistema realiza login e apresenta a tela inicial
