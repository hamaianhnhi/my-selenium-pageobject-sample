package helpers;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class UIMap {
    private static Properties properties;

    public static String getValueByKey(String key) {
        if(properties == null){
            loadPropertiesFromFile(TestConfiguration.UI_MAP_FILE_PATH);
        }
        String valueToReturn = properties.getProperty(key);
        return (valueToReturn == null)? "" : valueToReturn;
    }

    private static void loadPropertiesFromFile(String filePath){
        properties = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream(filePath);
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
