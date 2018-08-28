Feature: Login
  Como usu�rio registrado no sistema
  Eu quero que meu login seja autenticado
  Para que tenha acesso ao site Samba Videos

  Scenario Outline: Teste de Login com dados v�lidos
    Given que acesso o site SambaVideos
    When informar os dados de login "<login>" e "<senha>"
    And aciono o Entrar
    Then redireciona para a pagina Dashboard - Painel QA Samba
    And usuario logado e exibido corretamente
    
    Examples:
    |login								   |senha	 | 
    |avaliacao_qa_samba@sambatech.com.br   |123456789| 

   Scenario Outline: Teste de Login com dados inv�lidos
    Given que acesso o site SambaVideos
    When informar os dados de login "<login>" e "<senha>"
    And aciono o Entrar
    Then exibe a mensagem de erro "Email ou senha incorretos. Saiba Mais"

    Examples: 
      |descri��o_do_teste		| login  		                                | senha   | 
      |email n�o cadastrado	    | rubens@gmail.com	 						    |123456789| 
      |senha inv�lida			| avaliacao_qa_samba@sambatech.com.br           |1233456789|
      |usuario inativo			| rubens@teste.com								|12316464 |
      |usuario excluido			| rubens.teste@teste.com.br				        |123456789|





      
