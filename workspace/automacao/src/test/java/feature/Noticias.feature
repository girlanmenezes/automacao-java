#language:pt
@noticia
Funcionalidade: Publicador Noticias

  Cenario: Puclicar noticia Template de Referencia noticiaProjetoGrafico.xml
    Dado que eu tenha realizado login
    E que eu esteja na tela de adicionar editoria noticiaProjetoGrafico
    Quando preencher todos os campos obrigatorios e acionar a opção publicar
    Entao o sistema deve apresentar a publicação conforme template
