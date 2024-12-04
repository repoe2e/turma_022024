package pages;

import org.openqa.selenium.By;
import metodos.Metodos;

public class HbLoginPage {

	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.id("loginButton");

	Metodos metodo = new Metodos();

	public void loginSucesso(String usuario, String senha) {
		metodo.escrever(username, usuario);
		metodo.escrever(password, senha);
		
	}
	
	public void confirmacaoLogin() {
		metodo.clicar(loginButton);
		metodo.validarUrl("https://desafio.ui.e2etreinamentos.com.br/home.html");
		System.out.println("valor capturado " + metodo.pegarAtributo(By.id("total"), "value"));
	}

	public void loginError(String usuario, String senha, String msgErro) {
		metodo.escrever(username, usuario);
		metodo.escrever(password, senha);
		metodo.clicar(loginButton);
		if (msgErro.equals("Todos os campos precisam ser preenchidos.")) {
			metodo.validarAlert(msgErro);
		} else if (msgErro.equals("Usuário ou senha incorretos.")) {
			metodo.validarAlert(msgErro);
		} else {
			System.err.println("Alert com mensagem de erro não encontrada, " + "ou mensgem esperada não existe.");
			
		}
	}

}
