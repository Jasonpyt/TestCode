package Demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Test10 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("E:\\就业班\\TestCode\\src\\Demo02\\person.txt"));
        Set<String> keys = prop.stringPropertyNames();
        for (Iterator<String> it = keys.iterator(); it.hasNext(); ) {
            String key = it.next();
            String value = prop.getProperty(it.next());
            System.out.println(key + "---" + value);
        }
    }
}
