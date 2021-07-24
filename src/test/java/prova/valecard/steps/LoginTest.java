package prova.valecard.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import prova.valecard.elementos.Elementos;
import prova.valecard.metodos.Metodos;

public class LoginTest {
	
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	@Given("que esteja na tela de login")
	public void que_esteja_na_tela_de_login() {
	    metodo.abrirNavegador("https://www.drogasil.com.br");
		metodo.clicar(el.getCookies());
		metodo.clicar(el.getConta());
		metodo.clicar(el.getLogin());
	}

	@When("informar dados validos")
	public void informar_dados_validos() {
		 metodo.escrever(el.getEmail(), "918.182.358-46");
		 metodo.escrever(el.getPassword(), "Teste@1234");
		 metodo.clicar(el.getBtn());
	}

	@Then("login realizado com sucesso")
	public void login_realizado_com_sucesso() {
	    metodo.screenshot("Login");
	    metodo.fechar();
	}

}
