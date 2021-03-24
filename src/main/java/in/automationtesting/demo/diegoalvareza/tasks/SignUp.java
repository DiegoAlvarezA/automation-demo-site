package in.automationtesting.demo.diegoalvareza.tasks;

import in.automationtesting.demo.diegoalvareza.model.AutomationDemoSiteData;
import in.automationtesting.demo.diegoalvareza.userinterface.SignUpPage;
import in.automationtesting.demo.diegoalvareza.userinterface.WebTablePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SignUp implements Task {

    private AutomationDemoSiteData userData;
    private static final String TEST_FILE = "src/main/resources/files/picture.png";
    private static final Path TEST_FILE_PATH = Paths.get(TEST_FILE).toAbsolutePath();

    public SignUp(AutomationDemoSiteData userData) {
        this.userData = userData;
    }

    public static SignUp withData(AutomationDemoSiteData userData) {
        return Tasks.instrumented(SignUp.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userData.getFirstName()).into(SignUpPage.FIRST_NAME),
                Enter.theValue(userData.getLastName()).into(SignUpPage.LAST_NAME),
                Enter.theValue(userData.getAddress()).into(SignUpPage.ADDRESS),
                Enter.theValue(userData.getEmail()).into(SignUpPage.EMAIL),
                Enter.theValue(userData.getPhone()).into(SignUpPage.PHONE),
                Click.on(SignUpPage.gender(userData.getGender())),
                Click.on(SignUpPage.hobby(userData.getHobby())),
                Click.on(SignUpPage.LANGUAGES_LIST),
                Click.on(SignUpPage.langaugeItem(userData.getLanguage())),
                SelectFromOptions.byVisibleText(userData.getSkill()).from(SignUpPage.SKILLS),
                SelectFromOptions.byVisibleText(userData.getCountry()).from(SignUpPage.COUNTRIES),
                Click.on(SignUpPage.SELECT_COUNTRY_FIELD),
                Enter.theValue(userData.getSelectCountry()).into(SignUpPage.SELECT_COUNTRY_INPUT_SEARCH).thenHit(Keys.ENTER),
                SelectFromOptions.byVisibleText(userData.getBirthYear()).from(SignUpPage.BIRTH_YEAR),
                SelectFromOptions.byVisibleText(userData.getBirthMonth()).from(SignUpPage.BIRTH_MONTH),
                SelectFromOptions.byVisibleText(userData.getBirthDay()).from(SignUpPage.BIRTH_DAY),
                Enter.theValue(userData.getPassword()).into(SignUpPage.PASSWORD),
                Enter.theValue(userData.getPassword()).into(SignUpPage.CONFIRM_PASSWORD),
                Enter.keyValues(TEST_FILE_PATH.toString()).into(SignUpPage.UPLOAD_SOURCE_FILE),
                Click.on(SignUpPage.SUBMIT_BUTTON),
                Click.on(SignUpPage.WEBTABLE_TAB),
                MoveMouse.to(WebTablePage.HEADER).andThen( actions -> actions.click() )
        );
    }
}
