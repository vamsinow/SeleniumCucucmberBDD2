package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

    public static final String PROPERTIES_FILE_PATH = "C:\\Users\\Iray Trust\\Desktop\\CucumberProject\\SeleniumCucucmberBDD\\src\\test\\java\\config\\config.properties";
    public static Properties prop;

    public static Properties getProperties() {                                                                     
        if (prop == null) {
            readPropertiesFile();
        }
        return prop;
    }

    public static void readPropertiesFile() {
        prop = new Properties();
        try (FileInputStream input = new FileInputStream(PROPERTIES_FILE_PATH)) {
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writePropertiesFile(String browser, String result) {
        try (FileOutputStream output = new FileOutputStream(PROPERTIES_FILE_PATH)) {
            prop.setProperty("browser", browser);
            prop.setProperty("result", result);
            // Save the properties to the output stream
            prop.store(output, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }
