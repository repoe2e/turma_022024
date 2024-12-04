package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class HomePage {
	
	Metodos metodo = new Metodos();
	
	By menuHb = By.xpath("//*[text()='HomeBroker']");
	By menuFormulario = By.xpath("//*[text()='Formulário']");
	
	public void acessarHb() {
		metodo.esperarElementoClicavel(menuHb);
		metodo.clicar(menuHb);	
		metodo.validarUrl("https://desafio.ui.e2etreinamentos.com.br/hb.html");
	}
	
	public void acessarFormulario() {
		metodo.esperarElementoClicavel(menuFormulario);
		metodo.clicar(menuFormulario);	
		metodo.validarUrl("https://desafio.ui.e2etreinamentos.com.br/formulario.html");
	}

}
