package com.prueba.Banitsmo.tasks;

import com.prueba.Banitsmo.userinterfaces.ElementosDOM;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation implements Task {
    public static Navigation navigationpage() {
        return Tasks.instrumented(Navigation.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ElementosDOM.BTNTRANSPARENCIA),
        Click.on(ElementosDOM.BTNPRESUPUESTO),
        Click.on(ElementosDOM.BTNESTADOFINANCIERO),
        Click.on(ElementosDOM.BTNBALANCE));
    }
}