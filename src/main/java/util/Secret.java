package util;

import java.util.Properties;

public class Secret {
    static public void setPass(Properties dbProperties) {
        dbProperties.setProperty("user", "user");
        dbProperties.setProperty("password", "t");
    }
}