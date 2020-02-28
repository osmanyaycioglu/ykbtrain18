package ykb.com.mydbproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.util.IsolationLevel;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(final String[] args) {

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/test");
        config.setUsername("root");

        HikariDataSource dataSource = new HikariDataSource(config);
        String sqlStr = "INSERT INTO customer (name, surname, age) VALUES (?,?,?)";
        try (Connection connection = dataSource.getConnection();
                PreparedStatement prepareStatement = connection.prepareStatement(sqlStr);) {

            connection.setAutoCommit(false);
            connection.setTransactionIsolation(IsolationLevel.TRANSACTION_READ_UNCOMMITTED.getLevelId());
            for (int i = 100; i < 1000; i++) {

                prepareStatement.setString(1,
                                           "osman"
                                              + i);
                prepareStatement.setString(2,
                                           "soy"
                                              + i);
                prepareStatement.setInt(3,
                                        45);

                prepareStatement.addBatch();
            }
            prepareStatement.executeBatch();
            connection.commit();
            System.out.println("yazıldı");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
