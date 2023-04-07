package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HotelSearchPage {
    // мое
    private final By SHOW_ON_THE_MAP = By.xpath("//span[@class=\"fc63351294 a822bdf511 d4b6b7a9e7 f7db01295e c334e6f658 f4605622ad d2c52b10ce\"]");
   /* private static final String nameOfHotel = "span.map-card__title-link";
    private static final String ratingOfHotel = "div.bui-review-score__badge";
    private static final String reviewsOfHotel = "div.bui-review-score__text";
    private static final String costOfHotel = "span.prco-valign-middle-helper";
    private final String stars = "span.bui-rating.bui-rating--smaller";**/
    private final By GEO_POSITION = By.xpath("//div[@class=\"hotel-marker hotel-marker--likable\"]/parent::div");
    private final By STARS_ARE = By.xpath("//span[@class=\"c-accommodation-classification-rating\"]");
    private final By SERVICES = By.xpath("//a[@data-scroll=\"a[name=HotelFacilities]\"]");



    public HotelSearchPage showOnTheMap() {
        $(SHOW_ON_THE_MAP).click();
        $(STARS_ARE).shouldBe(visible);
        return this;
    }


    public HotelSearchPage chooseGeoPosition() {
        $(GEO_POSITION).click();
        $(SERVICES).shouldBe(visible);
        return this;
    }

   /* public HotelSearchPage checkThatAllElementsAreOnThePage() {
        $(nameOfHotel).isDisplayed();
        $(ratingOfHotel).isDisplayed();
        $(reviewsOfHotel).isDisplayed();
        $(costOfHotel).isDisplayed();
        $(stars).isDisplayed();
        return this;
    }**/



}