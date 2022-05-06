package runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/", glue = "tests", tags = "@teste", dryRun = false, plugin = { "pretty",
		"html:target/cucumber-report.html" }

)

public class Executa extends DriversFactory {

	public static String site = "https://automationpractice.com";

	@BeforeClass
	public static void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

}
