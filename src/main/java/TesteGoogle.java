import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
	private WebDriver driver;
	
	@Before
	public void inicializa() {
	
		driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
	}
	
	@After
	public void finalizar() {
		driver.quit();
	}
	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
		
	
	}

}
