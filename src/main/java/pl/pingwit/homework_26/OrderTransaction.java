package pl.pingwit.homework_26;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;

public class OrderTransaction {
    private static final String URL = "jdbc:postgresql://localhost:5432/pingwit_from_dump";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {
        HikariDataSource ds = new HikariDataSource();

        ds.setJdbcUrl(URL);
        ds.setUsername(USERNAME);
        ds.setPassword(PASSWORD);

        createTransaction(ds);

    }

    public static void createTransaction(DataSource dataSource) {

        try {
            Connection connection = dataSource.getConnection();
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO order_items(id, order_id, product_id, quantity) VALUES (?,?,?,?)");

            int id = getNextOrderItemsId(dataSource);
            preparedStatement1.setInt(1, id);
            preparedStatement1.setInt(2, 6);
            preparedStatement1.setInt(3, 101);
            preparedStatement1.setInt(4, 2);
            preparedStatement1.executeUpdate();

            int id2 = getNextOrderItemsId(dataSource);
            preparedStatement1.setInt(1, id2);
            preparedStatement1.setInt(2, 8);
            preparedStatement1.setInt(3, 131);
            preparedStatement1.setInt(4, 6);
            preparedStatement1.executeUpdate();

            int id3 = getNextOrderItemsId(dataSource);
            preparedStatement1.setInt(1, id3);
            preparedStatement1.setInt(2, 6);
            preparedStatement1.setInt(3, 81);
            preparedStatement1.setInt(4, 2);
            preparedStatement1.executeUpdate();

            System.out.println("Created order_items!");

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO orders (id, user_id, created_at, status_id, comment) VALUES (?,?,?,?,?)");

            int orderId = getNextOrderId(dataSource);
            preparedStatement.setInt(1, orderId);
            preparedStatement.setInt(2, 14);
            preparedStatement.setDate(3, Date.valueOf(LocalDate.now()));
            preparedStatement.setInt(4, 12);
            preparedStatement.setString(5, "to Brest");
            preparedStatement.executeUpdate();

            System.out.println("Created order!");

            connection.commit();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static Integer getNextOrderId(DataSource dataSource) {
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT nextval('orders_id_seq')");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1);
            } else throw new RuntimeException();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static Integer getNextOrderItemsId(DataSource dataSource) {
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT nextval('order_items_id_seq')");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1);
            } else throw new RuntimeException();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

