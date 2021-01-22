package selenium.aula13;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.TestCase;

@TestInstance(Lifecycle.PER_CLASS)
public class TestUsingPageObjects extends TestCase{ 

	private WebDriver driver;	 
	
	TrabalhosPorTitulo trabalhosPage;
	HomePage homePage;
	  
	  @BeforeAll	  
	  public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\Workspace - Eclipse\\TestesAutomatizados\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://sysprppg.ufc.br/eu/2020/");
	   }
	  	  	  
	  @AfterAll
	  public void tearDown() {
	    driver.quit();
	  }
	  
	  // Como estou usando JUnit5, pelo nome que inicia com "test", ele jÃ¡ reconhece e nÃ£o preciso do @Test
	  public void test_BuscaPorTituloComPageObjects() throws InterruptedException {
		  homePage = new HomePage(driver);
		  trabalhosPage = new TrabalhosPorTitulo(driver);
		  
		  homePage.clickTrabalhosCadastrados();
		  homePage.clickTrabalhosPorTitulo();
		  Thread.sleep(2000);
		  
		  driver.switchTo().frame(0);
		  trabalhosPage.digitarTitulo("Testes");
		  trabalhosPage.clicarBotaoPesquisar();
		  
		  //Estou verificando abaixo se após pesquisar por Testes aparecem os textos abaixo. 
		  //Sobre o xpath, você pode capturar pelo Selenium IDE ou usado o devTools do Chrome
		  assertTrue(trabalhosPage.getTextoTotal().contains("14 resumos"));
		  assertEquals("A CONSTRUÇÃO DE TESTES PSICOLÓGICOS PARA PESSOAS COM DEFICIÊNCIA VISUAL: UMA DISCUSSÃO URGENTE", 
				  	trabalhosPage.getPrimeiroResumo());
	  }  
	  
}
	  

