Este projeto tem como objetivo realizar os testes automaticamente da tela de login do site da SambaTech Videos.

A automação foi feita com cucumber selenium webdriver. Com o cucumber é possível que o projeto seja feito basicamente com uma linguagem em que o usuário e a equipe de testes e desenvolvimento consigam programar, facilitando assim correções e implementações futuras, com o reaproveitamento de passos desenvolvidos anteriormente.

Primeiramente foi criado um projeto java e importado os jars para a realização da automação da tela em questão.

Em seguida criei a feature de Login, em que nela estão os testes que realizei a automação. Login válido e login inválido.

Posteriormente eu criei os pacotes TestRunners, Tests e Pages.
-TestRunners: Criei uma classe e nesta classe possue as configurações para que o código seja rodado, no método de cucumber é necessário para identificar quais os diretórios estão as features e os steps.

-Tests: Classe que criei os steps que são cada passo dos cenários criados na feature.

-Pages: São os pagefactory das telas, mapeamento dos campos e seus elementos, para facilitar a automação, e utilizar o page objects.

Um código simples, mas como eu só fazia com Visual Studio a gente leva um tempo para entender como o java funciona, mas basicamente é quase a mesma coisa.