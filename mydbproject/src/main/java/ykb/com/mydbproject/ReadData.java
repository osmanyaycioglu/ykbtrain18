package ykb.com.mydbproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ReadData {
    public static void main(final String[] args) {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/test");
        config.setUsername("root");

        HikariDataSource dataSource = new HikariDataSource(config);
        try (Connection connection = dataSource.getConnection();
                Statement createStatement = connection.createStatement();
                ResultSet rs = createStatement.executeQuery("SELECT * FROM customer");) {

            while (rs.next()) {
                long id = rs.getLong(1);
                String name = rs.getString(2);
                String surname = rs.getString(3);
                int age = rs.getInt(4);
                System.out.println("id : "
                                   + id
                                   + " name : "
                                   + name
                                   + " surname : "
                                   + surname
                                   + " age : "
                                   + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
