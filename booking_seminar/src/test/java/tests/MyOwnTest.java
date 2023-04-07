package tests;

import org.junit.Test;
import pages.CarSearchPage;
import pages.ChoiceOfCarsPage;
import pages.DataOfUsersPage;
import pages.HomePage;


public class MyOwnTest extends BaseTest {

    @Test()
    public void Car() {
        String placeName = "Лондон";
        String eMail = "123@mail.ru";
        String firstName = "Иван";
        String secondName = "Иванов";
        String telephone = "89999999999";


        HomePage homePage = new HomePage();
        CarSearchPage carSearchPlace = new CarSearchPage();
        ChoiceOfCarsPage choiceOfCarsPage = new ChoiceOfCarsPage();
        DataOfUsersPage dataOfUsersPage = new DataOfUsersPage();


        homePage.openPage() // зайти на сайт Booking.com
                .acceptCookies() // подтвердить Cookies
                .pickupCar(); // перейти на вкладку "Аренда машин"

        carSearchPlace.findByPlace(placeName) // выбрать место получения: Лондон
                .findByDates() // выбрать даты получения 16-18 мая
                .findDifferentCars(); // нажать поиск

        choiceOfCarsPage.sendOnEMail(); // нажать на кнопку "Отправить на электронную почту"

        dataOfUsersPage.writeEMail(eMail) // заполнить поле "Электронная почта"
                .writeFirstName(firstName) // заполнить поле "Имя"
                .writeSecondName(secondName) // заполнить поле "Фамилия"
                .writeTelephone(telephone); // заполнить поле "Телефон"
             //   .sendData(); // нажать на кнопку "Отправить на электронную почту"

    }
}



