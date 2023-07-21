package tests.day28_DataProvider;

import org.testng.annotations.Test;
import utilities.DataProviderUtil;

public class DataProviderUtilKullanimi {

    @Test(dataProvider = "sehirVerileri",dataProviderClass = DataProviderUtil.class)
    public void test01(String sehir, String bolge, String plaka) {
        System.out.println(sehir+" | "+bolge+ " | "+plaka);


        //farkli bir classtan method olusturacaksak dataprovider class olusturup utilclass ekleyebiliriz.
// Bu sekilde--> dataProviderClass = DataProviderUtil.class
//eger bu sekilde yaparsam method utilclass icinde olusur. method static olursa daha rahat olur.
    }
}
