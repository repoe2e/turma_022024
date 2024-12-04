package tests;

import pages.HbLogadoPage;
import pages.HbLoginPage;
import pages.HomePage;
import runner.Navegadores;

public class BoletaCompraTest {

	HbLoginPage hbLoginPage = new HbLoginPage();
	HomePage home = new HomePage();
	HbLogadoPage hbLogado = new HbLogadoPage();

	
	public void setup() {
		Navegadores.iniciarTeste();
		home.acessarHb();
		hbLoginPage.loginSucesso("e2etreinamentos", "e2e@123");
	}

	
	public void tearDown() {
	//	Navegadores.finalizarTeste();
	}

	public void comprar() {
		hbLogado.comprar("PETR3", "30", "10", "300.00", "PETR3 30.00 10");
		
	}

}
