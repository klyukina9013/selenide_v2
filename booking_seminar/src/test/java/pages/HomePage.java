package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static tests.BaseTest.config;

public class HomePage {

    private final By CITY = By.xpath("//input[@placeholder='Куда вы хотите поехать?']");
    private final By ARRIVAL_DATE = By.xpath("//button[@data-testid=\"date-display-field-start\"]");
    private final By FIND_ARRIVAL_DATE = By.xpath("//span[@data-date=\"2023-05-26\"]/span[text()=26]");
    private final By FIND_DATE_OF_DEPARTURE = By.xpath("//span[@data-date=\"2023-05-30\"]/span[text()=30]");
    private final By FIND_BUTTON = By.xpath("//button[@type='submit']");
    private final By ACCEPT_COOKIES_BUTTON = By.xpath("//button[@id='onetrust-accept-btn-handler']");
    private final By DROP_DOWN_LIST_ITEMS = By.xpath("//div[@class='a40619bfbe']");
    private final By BUTTON_PICKUP_CAR = By.cssSelector("a#cars");




    public HomePage openPage() {
        open(config.baseUrl());
        return this;
    }

    public HomePage acceptCookies() {
        $(ACCEPT_COOKIES_BUTTON).click();
        return this;
    }

    public HomePage findByCity(String cityName) {
        $(CITY).sendKeys(cityName);
        $$(DROP_DOWN_LIST_ITEMS).get(0).shouldHave(Condition.text(cityName));
        return this;
    }

    public HomePage findByArrivalDate() {
        $(ARRIVAL_DATE).click();
        $(FIND_ARRIVAL_DATE).click();
        return this;
    }

    public HomePage findByDateOfDeparture() {
        $(FIND_DATE_OF_DEPARTURE).click();
        $(FIND_BUTTON).click();
        return this;
    }

    public HomePage pickupCar() {
        $(BUTTON_PICKUP_CAR).click();
        return this;
    }

}