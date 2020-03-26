//package com.pruebadocker.autweb.utils;
//
//import java.util.Properties;
//
//import org.openqa.selenium.UnexpectedAlertBehaviour;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//public class MyWebDriverFactory {
//	
//	private static WebDriver driver;
//
//	public static MyWebDriverFactory web() {
//		driver = getDriver();
//		driver.manage().window().maximize();
//		return new MyWebDriverFactory();
//	}
//	
//	@SuppressWarnings("deprecation")
//	public static WebDriver getDriver() {
//		Properties propiedad = ReadProperties.ofSerenity();
//		String webDriverStr = propiedad.getProperty("serenity.driver.name");
//		if (webDriverStr == null) {
//			webDriverStr = "chrome";
//		}
//		switch (webDriverStr) {
//		case "chrome":
//			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//			return new ChromeDriver();
//		case "firefox":
//			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
//			//System.setProperty("webdriver.gecko.driver", "geckodriver-v0.26.0-linux64_orig.tar");
//			FirefoxOptions firefoxOptions = new FirefoxOptions();
//			firefoxOptions.setHeadless(true);
////			firefoxOptions.setAcceptInsecureCerts(true);
////			firefoxOptions.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
////			firefoxOptions.setCapability("marionette", true);
//			
//			return new FirefoxDriver(firefoxOptions);
//		case "edge":
//			System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
//			DesiredCapabilities capabilities1 = DesiredCapabilities.edge();
//			capabilities1.setCapability("CapabilityName", "Microsoft.WebDriver~~~~0.0.1.0");
//			return new EdgeDriver();
//		case "ie":
//			System.setProperty("webdriver.ie.driver", "IEDriverServer32.exe");
//			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//			capabilities.setCapability("ignoreZoomSetting", true);
//			capabilities.setCapability("ignoreProtectedModeSettings", true);
//			capabilities.setCapability("requireWindowFocus", false);
//			capabilities.setCapability("enableNativeEvents", true);
//			capabilities.setCapability("enablePersistentHover", true);
//			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//			return new InternetExplorerDriver(capabilities);
//		default:
//			throw new RuntimeException("Unsupported webdriver: " + webDriverStr);
//		}
//	}
//	
//	public WebDriver onPage() {
//		return driver;
//	}
//
//
//}
