package com.pruebadocker.autweb.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.pruebadocker.autweb.user_interfaces.GoogleTranslatePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class Translate implements Task {

private String word;
	
	public Translate(String word) {
		this.word = word;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(word).into(GoogleTranslatePage.SOURCE_LANGUEGE_TEXTAREA));
		
	}

	public static Translate the(String word) {
		return instrumented(Translate.class, word);
	}


}
