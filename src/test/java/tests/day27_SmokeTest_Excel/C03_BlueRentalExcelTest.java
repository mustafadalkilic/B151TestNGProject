package tests.day27_SmokeTest_Excel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentalPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelReader;
import utilities.ReusableMethods;

public class C03_BlueRentalExcelTest {
    @Test
    public void test01() {

        //Bluerentalcar adresine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        //mysmoketestdata excel dosyasındaki herhangi bir email ve password ile login olalım
        ExcelReader reader = new ExcelReader("src/test/java/resources/mysmoketestdata.xlsx","customer_info");
        String email = reader.getCellData(2,0);
        String password = reader.getCellData(2,1);
        BlueRentalPage rentalPage = new BlueRentalPage();
        rentalPage.login.click();
        ReusableMethods.bekle(2);
        rentalPage.email.sendKeys(email, Keys.TAB, password , Keys.ENTER);
        ReusableMethods.bekle(2);

        //login olduğumuzu doğrulayalım
        Assert.assertTrue(rentalPage.loginVerify.getText().contains("Kate"));

        //sayfayı kapatalım
        Driver.closeDriver();


    }





}
