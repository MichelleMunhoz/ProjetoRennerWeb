package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import runner.Executa;

public class Metodos extends Executa {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void escrever(String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void fecharNavegador(String descricaoPasso) {
		driver.quit();
	}
}
