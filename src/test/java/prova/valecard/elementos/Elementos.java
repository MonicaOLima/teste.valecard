package prova.valecard.elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By conta = By.xpath("//*[@id=\"fixed-container-styles\"]/header/div/div[1]");
    private By cookies = By.id("onetrust-accept-btn-handler");
    private By login = By.xpath("//*[@id=\"fixed-container-styles\"]/header/div/div[1]/div[2]/button");
    private By email = By.xpath("//*[@id=\"emailCpf\"]");
    private By password = By.xpath("//*[@id=\"password\"]");
    private By btn = By.xpath("//*[@id=\"__next\"]/main/div/div/div[2]/div[1]/div[1]/form/button");
   
    
	public By getEmail() {
		return email;
	}

	public By getPassword() {
		return password;
	}

	public By getBtn() {
		return btn;
	}

	public By getCookies() {
		return cookies;
	}

	public By getLogin() {
		return login;
	}

	public By getConta() {
		return conta;
	}

}