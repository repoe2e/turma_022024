#language:pt

@regressivo
Funcionalidade: Login
  Como usuario
  Quero enviar dados 
  Para acessar conta

	Contexto: Acessar tela de login
	Dado que o usuario acesse a tela de login

  
  Cenario: Login de usuário
    Quando preencher os campos de login
    Entao valido se usuario esta autenticado
    
  
    
     