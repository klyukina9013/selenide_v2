package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CarSearchPage {

    private final By PLACE = By.xpath("//input[@data-testid=\"searchbox-toolbox-fts-pickup\"]");
    private final By DROP_DOWN_LIST = By.xpath("//div[@class=\"searchbox-toolbox-fts__suggestion-content\"]/div[text()=\"Лондон\"]");
    private final By BUTTON_DATE = By.xpath("//button[@id=\"searchbox-toolbox-date-picker-pickup-date\"]");
    private final By ARRIVAL_DATE = By.xpath("//span[@data-date=\"2023-05-16\"]/span[text()=16]");
    private final By DATE_OF_DEPARTURE = By.xpath("//span[@data-date=\"2023-05-18\"]/span[text()=18]");
    private final By FIND_BUTTON_FOR_CAR = By.xpath("//button[@data-testid=\"searchbox-toolbox-submit-button\"]");
    private final By FILTERS = By.xpath("//button[@data-testid=\"searchbox-toolbox-submit-button\"]");



    public CarSearchPage findByPlace(String placeName) {
        $(PLACE).sendKeys(placeName);
        $$(DROP_DOWN_LIST).get(0).shouldHave(Condition.text(placeName));
        return this;
    }

    public CarSearchPage findByDates() {
        $(BUTTON_DATE).click();
        $(ARRIVAL_DATE).click();
        $(DATE_OF_DEPARTURE).click();
        return this;
    }

    public CarSearchPage findDifferentCars() {
        $(FIND_BUTTON_FOR_CAR).click();
        $(FILTERS).shouldBe(visible);
        return this;
    }

}
