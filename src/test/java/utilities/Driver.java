package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    private Driver(){

         /*
       Driver class'indan obje olusturmanin onunce gecebilmek icin
       default constructor'i private yaparak bunu engellemis oluruz.
       Bu kaliba da Singleton patter denir */

        // Driver driver = new Driver();
        //Singleton pattern kullandigimiz icin obje olusturmanin onune gectik



    }
    /*
    POM (Page Object Model

     */
    static WebDriver driver;

    public static WebDriver getDriver() {

        /*
   Driver'i her çağırdığımızda yeni bir pencere açılmasının önüne geçmek için
if bloğu içinde Eğer driver'a değer ATANMAMIŞSA değer ata, eğer değer atanmışsa
driver'i aynı sayfada return et
    */
        if (driver == null) {//-- Driver a deger atanmamıssa

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        }
        return driver;

    }

        public static void closeDriver(){

        if(driver !=null) {//-->driver'a deger ATANMISSA
            driver.close();
            driver = null;//-->driver'i kapattiktan sonra bosalt

        }
    }

    public static void quitDriver() {
        if (driver != null) {//-->Driver'a değer atanmışsa, boş değilse
            driver.quit();
            driver = null; //--> Driver'ı kapattıktan sonra boşalt
        }

    }

}
