package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyService {

    private String rootPath;
    private String appConfigPath;
    private Properties appProps;

    public PropertyService() {
        rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        appConfigPath = rootPath + "appium-config.properties";
        appProps = new Properties();
        try {
            appProps.load(new FileInputStream(appConfigPath));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public String getProperty(String propertyKey){
        return appProps.getProperty(propertyKey);
    }

}