#language: pt
Funcionalidade: Busca de produto através da página principal

	Como um cliente
	Eu quero encontrar um produto através da tela principal
	
Contexto:
					Dado que estou na tela principal da aplicação
					Quando eu clicar em uma "LAPTOPS"
@FiltroPositivo					
Esquema do Cenário: Busca válida
	Quando eu clicar no "HP PAVILION 15Z LAPTOP"
	Então um tela com a descrição do produto "HP PAVILION 15Z LAPTOP" deve ser apresentada
	
Exemplos:
	|categoriaDeProdutos	|produtoDeMinhaEscolha		|
	|HEADPHONES						|LOGITECH USB HEADSET H390|
	
@FiltroNegativo
Cenário: Busca inválida
	E eu clicar no botão filtro
	E eu clicar no filtro Customization
	E eu clicar no filtro dois em um
	E eu clicar no filtro Customization
	E eu clicar no filtro Memory
	E eu clicar no filtro desesseis GB
	E eu clicar no botão Aplicar Filtro
	Então será apresentada uma mensagem na tela informando que o produto buscado não existe
	
