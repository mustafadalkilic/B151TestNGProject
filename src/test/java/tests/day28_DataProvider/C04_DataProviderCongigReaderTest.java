package tests.day28_DataProvider;

import io.netty.util.internal.ReflectionUtil;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BlueRentalPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_DataProviderCongigReaderTest {

    @DataProvider
    public static Object[][] blueRental() {
        return new Object[][]{{ConfigReader.getProperty("mail1"),ConfigReader.getProperty("sifre1")},
                {ConfigReader.getProperty("mail2"),ConfigReader.getProperty("sifre2")},
                {ConfigReader.getProperty("mail3"),ConfigReader.getProperty("sifre3")},
                {ConfigReader.getProperty("mail4"),ConfigReader.getProperty("sifre4")}};
    }


    /*
      Dataprovider kullanarak .properties dosyasındaki veriler ile BlueRentalCar sitesine login olalim

      */
    @Test(dataProvider = "blueRental")
    public void test01(String mail,String password) {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        BlueRentalPage rentalPage = new BlueRentalPage();
        rentalPage.login.click();
        ReusableMethods.bekle(2);
        rentalPage.email.sendKeys(mail, Keys.TAB,password,Keys.ENTER);




    }
}
