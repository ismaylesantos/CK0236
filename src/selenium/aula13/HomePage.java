package selenium.aula13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By trabalhosCadastradosBotao = By.xpath("//*[@id=\"sidebar\"]/div/div/div[2]/ul/li[7]/a");
	By trabalhosPorTituloBotao = By.xpath("//*[@id=\"sidebar\"]/div/div/div[2]/ul/li[7]/ul/li[3]/a");
	By trabalhosPorEncontroBotao = By.xpath("//*[@id=\"sidebar\"]/div/div/div[2]/ul/li[7]/ul/li[4]/a");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickTrabalhosCadastrados() {
		 driver.findElement(trabalhosCadastradosBotao).click();
	}
	
	public void clickTrabalhosPorTitulo() {
		 driver.findElement(trabalhosPorTituloBotao).click();
	}
	
	public void clickTrabalhosPorEncontro() {
		 driver.findElement(trabalhosPorEncontroBotao).click();
	}
	
}
