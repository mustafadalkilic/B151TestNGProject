package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
     /*
        .properties uzantili dosyaya erisebilmek icin Properties class'indan obje olusturmamiz gerekir
      bu olusturdugumu obje ile akisa aldigimiz dosya yolunu properties.load(fis) methodu ile propeties
      dosyasindaki bilgileri objemize yukler ve properties dosyasindaki key degerini return ederiz
       Bunu yapmak icin parametreli bir method olusturur girdigimiz key'in degerini bize dondurur
     */
     static Properties properties;

    public static String getProperty(String key) {
        try {
            FileInputStream fis = new FileInputStream("target/configuration.properties");
            properties = new Properties();
            properties.load(fis);//-->fis'in okuduğu bilgileri properties'e yükler
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(key);//-->String olarak girdiğim key'in değerini return eder
    }

}
