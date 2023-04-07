package pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class ChoiceOfCarsPage {

    private final By BUTTON_SEND_ON_EMAIL = By.xpath("(//button[@data-testid=\"email-quote-modal-link\"])[1]");

    public ChoiceOfCarsPage sendOnEMail() {
        $(BUTTON_SEND_ON_EMAIL).click();
        return this;
    }
}
