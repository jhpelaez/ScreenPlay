package com.pruebadocker.autweb.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.pruebadocker.autweb.user_interfaces.GoogleAppsComponent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoTo implements Task {

private Target googleApp;
	
	public GoTo(Target googleApp) {
		this.googleApp = googleApp;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS), 
				Click.on(googleApp));
	}

	public static GoTo theApp(Target googleApp) {
		return instrumented(GoTo.class, googleApp);
	}

}
