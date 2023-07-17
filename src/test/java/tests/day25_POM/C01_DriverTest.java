package tests.day25_POM;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverTest {

    @Test
    public void test01() {
        Driver.getDriver().get("https://amazon.com");
        Driver.closeDriver();

    }

    @Test
    public void test02() {

        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://youtube.com");
        Driver.getDriver().get("https://facebook.com");

      /*
        Driver'a koydugumuz if blogu ile burdaki sayfalara tek browser ile
        sirasiyla gittik
        Driver daki if blogunu kullanmadigimiz zaman her get()
        methodu kullandigimizda yeni bir browser acti
         */

        //temel test datalarini properties dosyalarinda tutariz



    }

    @Test
    public void test03() {

        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://youtube.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://facebook.com");


    }

    @Test
    public void test04() {

        //Driver driver = new Driver();
        //Singleton pattern kullandığımız için obje oluşturmanın önüne geçtik




    }
}
