# language: pt
# encoding: UTF-8

Funcionalidade: Compra

  Cenario: Compra com sucesso
    Dado que o usuario esteja na tela de login
    E que o usuario preencha o campo de usuario com dados validos
    E que o usuario preencha o campo de senha com dados validos
    Quando ele clicar no botao de login
    Então o sistema faz o login
    E o usuario adiciona itens no carrinho
    E que ele clique no botao do carrinho
    E que ele clique no botao do checkout
    E que ele preencha os dados corretamente e aperte no botao contiue
    Quando ele clicar no botao de finalizar
    Entao o sistema finaliza a compra e volta para a pagina inicial


