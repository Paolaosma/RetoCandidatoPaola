package co.com.choucair.certificacion.retocandidatos.tasks;


import co.com.choucair.certificacion.retocandidatos.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Openup implements Task {
    private UtestPage utestPage;
    public static Openup theUtestPage() {
        return Tasks.instrumented(Openup.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage));
    }
}
