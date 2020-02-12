#language: pt
Funcionalidade: Cadastro de novo usuário

	Como um novo usuário
	Eu quero cadastrar meus dados pessoais
	Para que eu possa usar um usuario e senha para fazer login
	
Contexto:
					Dado que estou na tela principal da aplicação
					Quando eu clicar no menu lateral
					E clicar no botão Login
					E clicar no botão SIGN UP TODAY
					
@SucessoNoCadastro					
Esquema do Cenário: Cadastro com sucesso
	Quando preencher o campo user name com "<usuario>"
	E preencher o campo email com "<email>"
	E preencher o campo password com "<senha>"
	E preencher o campo confirm password com "<confirmSenha>"
	E preencher o campo first name password com "<primeiroNome>"
	E preencher o campo last name password com "<ultimoNome>"
	E preencher o campo phone number com "<phone>"
	E selecionar o pais "<pais>"
	E preencher o campo estate com "<estado>"
	E preencher o campo address com "<endereco>"
	E preencher o campo city com "<cidade>"
	E preencher o campo zip com "<cep>"
	E clicar no botão register
	E eu clicar no menu lateral
	Então o poderei ver meu nome de usuário
	
Exemplos:
	|usuario|email|senha|confirmSenha|primeiroNome|ultimoNome|phone|pais|estado|endereco|cidade|cep|
	||joaosilva@email.com|!Joao123|!Joao123|João|Silva|1198888-8888|Brazil|São Paulo|Av. Paulista, 200|São Paulo|01311-922|

@FalhaNoCadastro
Cenario: Falha no cadastro
	Quando digitar no campo user name "joao"
	E clicar no campo email
	Então será apresentada uma mensagem dizendo que o mínimo de caracteres não foi atingido
	

	