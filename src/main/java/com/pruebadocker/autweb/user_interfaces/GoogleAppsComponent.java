package com.pruebadocker.autweb.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {
	
	public static final Target GOOGLE_APPS = Target.the("Google apps button").located(By.id("gbwa"));
	public static final Target GOOGLE_TRANSLATE = Target.the("Google Translate option").located(By.id("gb51"));

}
