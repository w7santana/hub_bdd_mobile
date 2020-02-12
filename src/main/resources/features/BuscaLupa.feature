#language: pt
Funcionalidade: Busca de produto pela lupa
	
	COMO um cliente
	EU quero digitar nome de um produto na barra de pesquisa
	PARA que o produto possa ser exibido na página de resultados
	
Contexto:
					Dado que estou na tela inicial da aplicação
					Quando eu clicar no campo de pesquisa

@BuscaPositiva
Esquema do Cenário:  Busca de produto existente
	Quando eu preencher o campo pesquisa com o nome de um "<produtoExistente>"
	E clicar na lupa
	Então o "<produtoExistente>" que eu pesquisei deverá ser exibido na tela
	
	Exemplos:
	|produtoExistente				 |
	|HP PAVILION 15Z LAPTOP	 |
	
	
@BuscaNegativa
Esquema do Cenário: Busca de produto inexistente
	Quando eu preencher o campo pesquisa com um "<produtoInexistente>"
	E clicar na lupa
	Então será apresentada uma mensagem informando não há resultados para a palavra pesquisada
	
	Exemplos:
	|produtoInexistente			|
	|caixa de som JBL				|
