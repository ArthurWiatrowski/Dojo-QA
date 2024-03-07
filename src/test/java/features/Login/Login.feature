# language: pt
# encoding: UTF-8

Funcionalidade: Login

  Esquema do Cenário: Login com varios usuarios
    Dado que o usuario esteja na tela de login
    E que o usuario preencha o campo de usuario com "<Usuario>"
    E que o usuario preencha o campo de senha com "<Senha>"
    Quando ele clicar no botao de login
    Então o sistema faz o login
    Exemplos:
      | Usuario                 | Senha         |
      | standard_user           | secret_saucez |
      | locked_out_user         | secret_saucez |
      | problem_user            | secret_saucez |
      | performance_glitch_user | secret_saucez |
      | error_user              | secret_saucez |
      | visual_user             | secret_saucez |




