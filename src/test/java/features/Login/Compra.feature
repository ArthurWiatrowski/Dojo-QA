# language: pt
# encoding: UTF-8

Funcionalidade: Compra

  Cenario: Compra com sucesso
    Dado que o usuario esteja na tela de login
    E que o usuario preencha o campo de usuario com "<standard_user>"
    E que o usuario preencha o campo de usuario com "<secret_sauce>"
    E ele clicar no botao de login
    E que ele faça o fluxo de compra
    Quando ele clicar no botao de finalizar
    Entao o sistema finaliza a compra e volta para a pagina inicial


