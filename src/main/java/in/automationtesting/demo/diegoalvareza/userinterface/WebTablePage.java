package in.automationtesting.demo.diegoalvareza.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebTablePage {
    public static final Target FIRST_ITEM_TEXT = Target.the("first item text").located(By.xpath("//h4[contains(text(),'- Double Click on Edit Icon to')]"));
    public static final Target HEADER = Target.the("header page").located(By.tagName("header"));
}
