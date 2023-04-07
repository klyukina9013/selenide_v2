package tests;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import pages.HomePage;
import pages.HotelSearchPage;

import static com.codeborne.selenide.Configuration.*;


public class HomeWorkTest extends BaseTest {
    @Test()
    public void hotels() {
        String cityName = "Будапешт";

        HomePage homePage = new HomePage();
        HotelSearchPage hotelSearchPage = new HotelSearchPage();

        homePage.openPage()
                .acceptCookies()
                .findByCity(cityName)
                .findByArrivalDate()
                .findByDateOfDeparture();

        hotelSearchPage.showOnTheMap()
                .chooseGeoPosition();
             //   .checkThatAllElementsAreOnThePage();

    }
}


