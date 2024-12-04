package tests;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HbLoginPage;
import runner.Navegadores;

public class LoginGFeatureTest {
	
	HbLoginPage page = new HbLoginPage();

	@Dado("que o usuario acesse a tela de login")
	public void queOUsuarioAcesseATelaDeLogin() {
		Navegadores.iniciarTeste();
	}

	@Quando("preencher os campos de login")
	public void preencherOsCamposDeLogin() {
		page.loginSucesso("e2etreinamentos", "e2e@123");
	}

	@Entao("valido se usuario esta autenticado")
	public void validoSeUsuarioEstaAutenticado() {
		page.confirmacaoLogin();
		
	}

}
