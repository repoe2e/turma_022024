package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class HbLogadoPage {
	
	// this serve para definir que é uma variável de escopo global

	// variável global que pertence a class
	By ativo = By.id("asset");
	By preco = By.id("price");
	By quantidade = By.id("quantity");
	By total = By.xpath("//input[@id='total']");
	By btnComprar = By.id("buy-button");
	By carteiraCliente = By.xpath("//*[@id='portfolio-table']//tbody//tr");

	Metodos metodo = new Metodos();

	

	public void comprar(String ativo, String preco, String quantidade, String totalCompra,String carteiraEsparada) {
		
		metodo.escrever(this.ativo, ativo);
		metodo.escrever(this.preco, preco);
		metodo.escrever(this.quantidade, quantidade);
		metodo.validarTextoPorAtributo(total, totalCompra);
		metodo.clicar(btnComprar);
		metodo.validarTexto(carteiraCliente, carteiraEsparada);
	}

	public void vender(String ativo, String preco, String quantidade) {

	}

	public void validarSaldo(String saldoEsperado) {

	}

	public void encerrarSessao() {

	}

}
