package com.pruebadocker.autweb.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.pruebadocker.autweb.tasks.GoTo;
import com.pruebadocker.autweb.tasks.OpenTheBrowser;
import com.pruebadocker.autweb.tasks.Translate;
import com.pruebadocker.autweb.user_interfaces.GoogleAppsComponent;
import com.pruebadocker.autweb.user_interfaces.TranslateHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	
//	@Managed(driver = "firefox")
//	private WebDriver herBrowser;
//	private WebDriver herBrowser = MyWebDriverFactory.web().onPage();
	private Actor susan = Actor.named("Susan");
	private TranslateHomePage translateHomePage;
	
	@Before
	public void setUp() {
		//susan.can(BrowseTheWeb.with(MyWebDriverFactory.web().onPage()));
	}
	
	/**
	 * wasAbleTo(task): Se usa en los @given, significa "fue capaz de", por tanto es una precondicion
	 * attempsTo(task): Se usa en los @when, significa "intenta hacer", por tanto es una condicion
	 * shouldSeeThat: @then, para los asertions
	 */
	
	@Given("^that Susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() throws Exception {
	    // Precondiciones: Estar en Google Translate
		//susan.wasAbleTo(OpenTheBrowser.on(translateHomePage));
//				GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		//Set Firefox Headless mode as TRUE
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		
		//Instantiate Web Driver
		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://www.google.com");
		System.out.println("Page title is - " + driver.getTitle());
		
		//Search on Google
		driver.findElement(By.name("q")).sendKeys("selenium webdriver");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("Busco elemento");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Display number of results on Console
		System.out.println("Total Results - " + driver.findElement(By.id("result-stats")).getText());
		
		driver.close();
	}

	@When("^she translate the word \"([^\"]*)\" from English to Spanish$")
	public void sheTranslateTheWordFromEnglishToSpanish(String word) throws Exception {
		//System.out.println(System.getProperty("prueba"));
	    // Condiciones: Traducir una palabra de Ingles a Español
		//susan.attemptsTo(Translate.the(word));
	}

	@Then("^she should see the word \"([^\"]*)\" in the screen$")
	public void sheShouldSeeTheWordInTheScreen(String arg1) throws Exception {
	    // Consecuencias - Asserts: Verificar la palabra traducida
		//System.out.println("llego al assert");
	}


}
