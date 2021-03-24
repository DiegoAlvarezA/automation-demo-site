package in.automationtesting.demo.diegoalvareza.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPage {
    public static final Target FIRST_NAME = Target.the("first name").located(By.cssSelector("input[placeholder='First Name']"));
    public static final Target LAST_NAME = Target.the("last name").located(By.cssSelector("input[placeholder='Last Name']"));
    public static final Target ADDRESS = Target.the("address").located(By.cssSelector("textarea[ng-model='Adress']"));
    public static final Target EMAIL = Target.the("email").located(By.cssSelector("input[ng-model='EmailAdress']"));
    public static final Target PHONE = Target.the("phone").located(By.cssSelector("input[ng-model='Phone']"));
    public static final Target LANGUAGES_LIST = Target.the("language field").located(By.id("msdd"));
    public static final Target SKILLS = Target.the("language").located(By.id("Skills"));
    public static final Target COUNTRIES = Target.the("language").located(By.id("countries"));
    public static final Target SELECT_COUNTRY_FIELD = Target.the("select country field").located(By.xpath("//span[@class='select2-selection select2-selection--single']"));
    public static final Target SELECT_COUNTRY_INPUT_SEARCH = Target.the("select country input search").located(By.xpath("//input[@class='select2-search__field']"));
    public static final Target BIRTH_MONTH = Target.the("Birth month").located(By.cssSelector("select[ng-model='monthbox']"));
    public static final Target BIRTH_DAY = Target.the("Birth day").located(By.id("daybox"));
    public static final Target BIRTH_YEAR = Target.the("Birth year").located(By.id("yearbox"));
    public static final Target PASSWORD = Target.the("password").located(By.id("firstpassword"));
    public static final Target CONFIRM_PASSWORD = Target.the("confirm password").located(By.id("secondpassword"));
    public static final Target SUBMIT_BUTTON = Target.the("Submit button").located(By.id("submitbtn"));
    public static final Target UPLOAD_SOURCE_FILE = Target.the("Upload file").located(By.id("imagesrc"));
    public static final Target WEBTABLE_TAB = Target.the("webtable tab").located(By.xpath("//a[contains(text(),'WebTable')]"));

    public static Target gender(String gender) {
        return Target.the("gender").located(By.cssSelector("input[value='"+ gender +"'][type='radio']"));
    }

    public static Target hobby(String hobby) {
        return Target.the("hobby").located(By.cssSelector("input[value='"+ hobby +"'][type='checkbox']"));
    }

    public static Target langaugeItem(String language) {
        return Target.the("language").located(By.xpath("//a[contains(text(),'"+ language +"')]"));
    }
}
