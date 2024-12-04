package tests;

import org.junit.Test;

import pages.HomePage;
import runner.Navegadores;

public class ValidarMenuHomeTest {

	HomePage hpage = new HomePage();
	
	
	public void setup() {
		Navegadores.iniciarTeste();
	}
	

	public void tearDown() {
		Navegadores.finalizarTeste();
	}

	
	public void validarMenuHomeBroker() {
		hpage.acessarHb();
	}

	@Test
	public void validarMenuFormulario() {
		hpage.acessarFormulario();
	}
}