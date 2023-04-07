package pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class DataOfUsersPage {

    private final By EMAIL_FIELD = By.xpath("//input[@id=\"__bui-747\"]");
    private final By FIRST_NAME_FIELD = By.xpath("//input[@id=\"__bui-748\"]");
    private final By SECOND_NAME_FIELD = By.xpath("//input[@id=\"__bui-749\"]");
    private final By TELEPHONE_FIELD = By.xpath("//input[@id=\"__bui-750\"]");
    private final By BUTTON_SEND = By.xpath("//button[@class=\"SM_c9e10079 SM_1690799f SM_c4a63008 SM_edafb7bb SM_44f154f8 SM_d3077f39\"]");


    public DataOfUsersPage writeEMail(String eMail) {
        $(EMAIL_FIELD).sendKeys(eMail);
        return this;
    }

    public DataOfUsersPage writeFirstName(String firstName) {
        $(FIRST_NAME_FIELD).sendKeys(firstName);
        return this;
    }

    public DataOfUsersPage writeSecondName(String secondName) {
        $(SECOND_NAME_FIELD).sendKeys(secondName);
        return this;
    }

    public DataOfUsersPage writeTelephone(String telephone) {
        $(TELEPHONE_FIELD).sendKeys(telephone);
        return this;
    }

    public DataOfUsersPage sendData() {
        $(BUTTON_SEND).click();
        return this;
    }

}
