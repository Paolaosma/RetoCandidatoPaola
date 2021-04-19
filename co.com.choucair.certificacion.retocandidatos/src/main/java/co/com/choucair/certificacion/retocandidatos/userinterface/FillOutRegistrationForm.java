package co.com.choucair.certificacion.retocandidatos.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillOutRegistrationForm {

    public static final Target JOINTODAY_BUTTON =Target.the("button to open Utest form")
            .located(By.linkText("Join Today"));

    public static final Target INPUT_FIRSTUSER =Target.the("Where do we write the first Name")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME =Target.the("Where do we write the last Name")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL =Target.the("Where do we write the email")
            .located(By.id("email"));

    public static final Target INPUT_DATEOFBIRTH_MONTH = Target.the("Where do we write the month of birth")
            .located(By.id("birthMonth"));

    public static final Target INPUT_DATEOFBIRTH_DAY = Target.the("Where do we write the day of birth")
            .located(By.id("birthDay"));

    public static final Target INPUT_DATEOFBIRTH_YEAR = Target.the("Where do we write the year of birth")
            .located(By.id("birthYear"));

    public static final Target LOCATION_BUTTON =Target.the("button to move to location form")
            .located(By.xpath("//*[@class='form-group col-xs-12 text-right']//span[text()='Next: Location']"));

    public static final Target INPUT_POSTALCODE = Target.the("Where do we write the postal code")
            .located(By.id("zip"));

    public static final Target DEVICES_BUTTON =Target.the("button to move to devices form")
            .located(By.xpath("//*[@class='pull-right next-step']//span[text()='Next: Devices']"));

    public static final Target LASTSTEP_BUTTON =Target.the("button to move to location form")
            .located(By.xpath("//*[@class='pull-right next-step']//span[text()='Next: Last Step']"));

    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password")
            .located(By.name("password"));

    public static final Target INPUT_CONFIRMPASSWORD = Target.the("Where do we write the confirm password")
            .located(By.name("confirmPassword"));

    public static final Target INPUT_TERMOFUSE = Target.the("Where do we accept the term of use")
            .located(By.id("termOfUse"));

    public static final Target INPUT_PRIVACY = Target.the("Where do we accept the term of use")
            .located(By.id("privacySetting"));

    public static final Target COMPLETESETUP_BUTTON =Target.the("button to create the account")
            .located(By.xpath("//*[@class='pull-right next-step']//span[text()='Complete Setup']"));

    public static final Target CONFIRMATION_MESSAGE = Target.the("Where do we see the account confirmation")
            .located(By.className("welcome-lead"));
}
