package selenium.aula13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrabalhosPorTitulo {

	WebDriver driver;
	WebDriverWait wait;
	
    By tituloCampo = By.id("res_titulo");		
	By consultarBotao = By.xpath("//*[@class=\"button\"]"); 
	By textoTotalLocator = By.xpath("//div[@id='listar']/table/tbody/tr[1]/td");
	By primeiroResumoLocator = By.xpath("//div[@id='listar']/table/tbody/tr[2]/td/table/tbody/tr[3]/td/span/a");
	
	public TrabalhosPorTitulo(WebDriver driver){
		this.driver = driver;
		wait =  new WebDriverWait(driver, 10);
	}
	
	public void digitarTitulo(String titulo) throws InterruptedException {		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(tituloCampo));
		
		driver.findElement(tituloCampo).click();
		//Se desejar visualizar a execução do próximo comando, coloque um thread.sleep
		//Thread.sleep(5000);
		driver.findElement(tituloCampo).sendKeys(titulo);
	}
	
	public void clicarBotaoPesquisar() {
		wait.until(ExpectedConditions.elementToBeClickable(consultarBotao));
		driver.findElement(consultarBotao).click();
	}
	
	public String getTextoTotal() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(textoTotalLocator));
		return driver.findElement(textoTotalLocator).getText();
	}
	
	public String getPrimeiroResumo() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(primeiroResumoLocator));
		return driver.findElement(primeiroResumoLocator).getText();
	}
	
}
