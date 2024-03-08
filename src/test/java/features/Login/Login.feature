# language: pt
# encoding: UTF-8

Funcionalidade: Login

  Esquema do Cenário: Login com varios usuarios
    Dado que o usuario esteja na tela de login
    E que o usuario preencha o campo de usuario com "<Usuario>"
    E que o usuario preencha o campo de senha com "<Senha>"
    Quando ele clicar no botao de login
    Então o sistema faz o login
    E   o sistema faz logout
    Exemplos:
      | Usuario                 | Senha        |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |




