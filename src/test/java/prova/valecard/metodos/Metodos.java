package prova.valecard.metodos;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	WebDriver driver;
	
	/**
	 * Metodo para abrir navegador
	 * @author Monica Lima
	 * @param site
	 */
	public void abrirNavegador(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver91.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		}catch (Exception e) {
			System.out.println("----- error ao abrir navegador -----" + e.getMessage());
		}
	}
	
    /**
     * Escrever texto no elemento
     * @author Monica Lima
     * @param element
     * @param texto
     */
	public void escrever(By element, String texto) {
		try {
			driver.findElement(element).sendKeys(texto);
		}catch (Exception e) {
			System.out.println("----- error ao escrever -----" + e.getMessage());
		}
	}
	
	/**
	 * Clicar em um elemento
	 * @author Monica Lima
	 * @param element
	 */
	public void clicar(By element) {
		try {
			driver.findElement(element).click();
		}catch (Exception e) {
			System.out.println("----- error ao clicar -----" + e.getMessage());
		}
		
	}
	
	public void screenshot(String nome) {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nome + ".png");
			FileUtils.copyFile(scrFile, destFile);
	}catch (Exception e) {
		System.out.println("----- error ao tirar screenshot -----" + e.getMessage());
	}
	}
	/**
	 * Metodo para fechar navegador
	 * @author Monica Lima
	 */
	public void fechar() {
		try {
		driver.quit();
	}catch (Exception e) {
		System.out.println("----- error ao fechar navegador -----" + e.getMessage());
	}
	}
}


