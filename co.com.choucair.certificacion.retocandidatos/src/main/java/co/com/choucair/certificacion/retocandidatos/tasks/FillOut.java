package co.com.choucair.certificacion.retocandidatos.tasks;

import co.com.choucair.certificacion.retocandidatos.userinterface.FillOutRegistrationForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;

public class FillOut implements Task {
    private String firstName;
    private String lastName;
    private String email;
    private String monthOfBirth;
    private String dayOfBirth;
    private String yearOfBirth;
    private String zip;
    private String passWord;
    private String confirmPassword;

    public FillOut(String firstName, String lastName,String email,String monthOfBirth,String dayOfBirth,String yearOfBirth,String zip,String passWord,String confirmPassword){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.zip = zip;
        this.passWord = passWord;
        this.confirmPassword = confirmPassword;
    }

    public static FillOut theform(String firstName, String lastName,String email,String monthOfBirth,String dayOfBirth,String yearOfBirth,String zip,String passWord,String confirmPassword) {
        return Tasks.instrumented(FillOut.class, firstName, lastName, email, monthOfBirth, dayOfBirth, yearOfBirth, zip, passWord, confirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(Click.on(FillOutRegistrationForm.JOINTODAY_BUTTON),
                Enter.theValue(firstName).into(FillOutRegistrationForm.INPUT_FIRSTUSER),
                Enter.theValue(lastName).into(FillOutRegistrationForm.INPUT_LASTNAME),
                Enter.theValue(email).into(FillOutRegistrationForm.INPUT_EMAIL),
                new SelectByVisibleTextFromTarget(FillOutRegistrationForm.INPUT_DATEOFBIRTH_MONTH,monthOfBirth),
                new SelectByVisibleTextFromTarget(FillOutRegistrationForm.INPUT_DATEOFBIRTH_DAY,dayOfBirth),
                new SelectByVisibleTextFromTarget(FillOutRegistrationForm.INPUT_DATEOFBIRTH_YEAR,yearOfBirth),
                Click.on(FillOutRegistrationForm.LOCATION_BUTTON),
                Enter.theValue(zip).into(FillOutRegistrationForm.INPUT_POSTALCODE),
                Click.on(FillOutRegistrationForm.DEVICES_BUTTON),
                Click.on(FillOutRegistrationForm.LASTSTEP_BUTTON),
                Enter.theValue(passWord).into(FillOutRegistrationForm.INPUT_PASSWORD),
                Enter.theValue(confirmPassword).into(FillOutRegistrationForm.INPUT_CONFIRMPASSWORD),
                Click.on(FillOutRegistrationForm.INPUT_TERMOFUSE),
                Click.on(FillOutRegistrationForm.INPUT_PRIVACY),
                Click.on(FillOutRegistrationForm.COMPLETESETUP_BUTTON)
                );
    }
}
