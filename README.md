Este projeto tem como objetivo realizar os testes automaticamente da tela de login do site da SambaTech Videos.

A automa��o foi feita com cucumber selenium webdriver. Com o cucumber � poss�vel que o projeto seja feito basicamente com uma linguagem em que o usu�rio e a equipe de testes e desenvolvimento consigam programar, facilitando assim corre��es e implementa��es futuras, com o reaproveitamento de passos desenvolvidos anteriormente.

Primeiramente foi criado um projeto java e importado os jars para a realiza��o da automa��o da tela em quest�o.

Em seguida criei a feature de Login, em que nela est�o os testes que realizei a automa��o. Login v�lido e login inv�lido.

Posteriormente eu criei os pacotes TestRunners, Tests e Pages.
-TestRunners: Criei uma classe e nesta classe possue as configura��es para que o c�digo seja rodado, no m�todo de cucumber � necess�rio para identificar quais os diret�rios est�o as features e os steps.

-Tests: Classe que criei os steps que s�o cada passo dos cen�rios criados na feature.

-Pages: S�o os pagefactory das telas, mapeamento dos campos e seus elementos, para facilitar a automa��o, e utilizar o page objects.

Um c�digo simples, mas como eu s� fazia com Visual Studio a gente leva um tempo para entender como o java funciona, mas basicamente � quase a mesma coisa.