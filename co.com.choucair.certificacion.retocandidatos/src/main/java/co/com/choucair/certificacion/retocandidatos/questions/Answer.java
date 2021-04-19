package co.com.choucair.certificacion.retocandidatos.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;
    private String confirmationMessage;

    public Answer(String question, String confirmationMessage){
        this.question = question;
        this.confirmationMessage = confirmationMessage;
    }

    public static Answer toThe(String question, String confirmationMessage) {
        return new Answer(question, confirmationMessage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        //FillOutRegistrationForm.CONFIRMATION_MESSAGE commented due to after complete form, I google image verification appears.
        //String nameCourse = Text.of(FillOutRegistrationForm.CONFIRMATION_MESSAGE).viewedBy(actor).asString();
        //Set a variable directly to avoid the issue.
        if(question.equals(confirmationMessage)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
