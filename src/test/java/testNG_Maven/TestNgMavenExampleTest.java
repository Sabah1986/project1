package testNG_Maven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utilities.ReadConfigFiles;
import utilities.SqlConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestNgMavenExampleTest {
    private static final Logger LOGGER = LogManager.getLogger(TestNgMavenExampleTest.class);

    @Test
    public void run() {
        System.out.println(ReadConfigFiles.getPropertyValues("DbName"));


    }

}

