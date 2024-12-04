package metodos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.Drivers;

public class Metodos extends Drivers {

	/**
	 * Clicar em um elemento WEB usando By
	 * 
	 * @param elemento
	 */
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	/**
	 * Clicar em um elemento WEB usando WebElement
	 * 
	 * @param elemento
	 */
	public void clicar(WebElement elemento) {
		elemento.click();
	}

	/**
	 * Aguardar elemento ser clicavel até 15 segundos
	 * 
	 * @param elemento
	 */
	public void esperarElementoClicavel(By elemento) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
	}
	
	
	/**
	 * Aguardar elemento visivel
	 * @param elemento
	 */
	public void esperarElemento(By elemento) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
	}

	/**
	 * Pausa aplicação até o tempo desejado
	 * 
	 * @param tempo
	 */
	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Validando url capturada
	 * 
	 * @param urlEsperada
	 */
	public void validarUrl(String urlEsperada) {
		
	}

	/**
	 * Método para escrever usando um By
	 * 
	 * @param elemento
	 * @param texto
	 */
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	/**
	 * Validar mensagem de erro em um alert
	 * 
	 * @param mensagemEsperada
	 */
	public void validarAlert(String mensagemEsperada) {
		
	}

	/**
	 * Validar a compra
	 * @param elemento
	 * @param totalCompra
	 */
	public void validarTexto(By elemento, String totalCompra) {
		esperarElemento(elemento);
		System.out.println(driver.findElement(elemento).getText());
		
	}
	
	/**
	 * Limpar campo
	 * @param elemento
	 */
	public void limparCampo(By elemento) {
		driver.findElement(elemento).clear();
	}
	
	/**
	 * Validar texto por atributo
	 * @param elemento
	 * @param totalCompra
	 */
	public void validarTextoPorAtributo(By elemento, String totalCompra) {
		WebElement el = driver.findElement(elemento);
		String value = el.getAttribute("value");
		System.out.println(value);
		
	}
	
	public String pegarAtributo(By elemento, String atributo) {
		return driver.findElement(elemento).getAttribute(atributo);
	}
}