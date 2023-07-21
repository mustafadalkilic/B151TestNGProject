package tests.day28_DataProvider;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BlueRentalPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_DataProviderTest {

    @DataProvider
    public static Object[][] blueRental() {
        return new Object[][]{
                {"sam.walker@bluerentalcars.com","c!fas_art"},
                {"kate.brown@bluerentalcars.com","tad1$Fas"},
                {"raj.khan@bluerentalcars.com","v7Hg_va^"},
                {"pam.raymond@bluerentalcars.com","Nga^g6!"}
        };
        //DataProvider icine webelement de alabilir miyiz--evet
        //config reader dan da alinabilir
    }
    //loop kullanmadan daha hizli calistirabilecegimiz bir method
    //digerlerinden de daha hizli
    @Test (dataProvider = "blueRental")
    public void test01(String mail,String password) {

        //BlueRentalCar sitesine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        //DataProvider'daki mail ve password bilgileri ile login olalim
        BlueRentalPage rentalPage=new BlueRentalPage();
        rentalPage.login.click();
        ReusableMethods.bekle(2);
        rentalPage.email.sendKeys(mail, Keys.TAB,password, Keys.ENTER);
        ReusableMethods.bekle(2);

        //Sayfayı kapatalım
        Driver.closeDriver();




    }
}
