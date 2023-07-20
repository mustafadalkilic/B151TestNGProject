package tests.day27_SmokeTest_Excel;

import org.testng.annotations.Test;
import utilities.ExcelReader;

public class C02_BlueRentalExcelTest {

    @Test
    public void test01() {
        String dosyaYolu = "src/test/java/resources/mysmoketestdata.xlsx";
        String sayfaİsmi = "customer_info";
        ExcelReader reader =new ExcelReader(dosyaYolu,sayfaİsmi);
        System.out.println(reader.getCellData(1, 0));
        String email =reader.getCellData(1,0);
        String password =reader.getCellData(1,1);
        System.out.println(email +" || "+password);

    }
}
