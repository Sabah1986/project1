package parameters;

import org.testng.annotations.Test;
import utilities.SqlConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestSqlParameters {
    @Test
    public void testDatabaseValues() {

        try {
            ResultSet resultSet = SqlConnector.readData("select * from monthly_mortgage");

            while (resultSet.next()) {
                System.out.println("The home price is ;" + resultSet.getString("homevalue"));
                System.out.println("The down payment is :" + resultSet.getString("downpayment"));
                System.out.println("The loan amount is :" + resultSet.getString("loanpayment"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}