package HelperUtil;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
    public static final String UI_PROPERTIES = "UI";

    public Properties properties;

    public PropertiesUtil(String file) throws IOException {
        properties = new Properties();
        properties.load(getClass().getResourceAsStream("/" + file));
    }

    public String getValue(String propertyKey) {
        try {
            return properties.getProperty(propertyKey);
        } catch (NullPointerException nullPointerException) {
            return null;
        }
    }
}
