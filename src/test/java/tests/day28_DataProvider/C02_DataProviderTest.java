package tests.day28_DataProvider;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_DataProviderTest {


    @DataProvider
    public static Object[][] arabalar() {
        return new Object[][]{{"volvo"}, {"audi"}, {"mercedes"}, {"ford"}};
    }

    /*
 Google sayfasına gidip
        DataProvider ile belirtilen araç isimlerini aratalım
         */
    @Test(dataProvider = "arabalar")
    public void test01(String araclar) {
        //Google sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

        //Dataprovider'daki verilerle arama yapalım
        GooglePage googlePage = new GooglePage();
        googlePage.aramaKutusu.sendKeys(araclar);
        googlePage.aramaKutusu.submit();
        ReusableMethods.bekle(3);
        //Her arama ıcın ekran resmı alalım
        ReusableMethods.tumSayfaResmi();

        //Sayfayı kapatalım
        Driver.closeDriver();






    }
}

