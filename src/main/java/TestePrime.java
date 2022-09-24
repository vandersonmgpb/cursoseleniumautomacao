import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestePrime {

	private WebDriver driver;
	private DSL dsl;
	
	@Before
	public void inicializa() {
	
		driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		dsl = new DSL(driver);
	}
	
	@After
	public void finalizar() {
//		driver.quit();
	}
	
	@Test
	public void deveInteragirComRadioPrime() {
		driver.get("https://www.primefaces.org/showcase/ui/input/oneRadio.xhtml?jfwid=9fb36");
		dsl.clicarRadio(By.xpath("//input[@id='j_idt340:console:0']/../..//span"));
		Assert.assertTrue(dsl.isRadioMarcado("j_idt340:console:0"));
		dsl.clicarRadio(By.xpath("//label[.='Option2']/..//span"));
		Assert.assertTrue(dsl.isRadioMarcado("j_idt340:console:1"));
	}
	
	@Test
	public void deveInteragirComSelectPrime() {
		driver.get("https://www.primefaces.org/showcase/ui/input/oneMenu.xhtml?jfwid=753dd");
		
		dsl.clicarRadio(By.xpath("//*[@id='j_idt339:option_label']/../..//span"));
		dsl.clicarRadio(By.xpath("//*[@id='j_idt339:option_label']//li[.="Option 1"]"));
	}
}
