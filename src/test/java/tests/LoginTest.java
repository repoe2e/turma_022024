package tests;

import pages.HbLoginPage;
import pages.HomePage;
import runner.Navegadores;

public class LoginTest {

	HbLoginPage hbPage = new HbLoginPage();
	HomePage home = new HomePage();

	
	public void setup() {
		Navegadores.iniciarTeste();
		home.acessarHb();
		
	}

	
	public void tearDown() {
		Navegadores.finalizarTeste();
	}

	
	public void loginOk() {
		hbPage.loginSucesso("e2etreinamentos", "e2e@123");
	}

}
