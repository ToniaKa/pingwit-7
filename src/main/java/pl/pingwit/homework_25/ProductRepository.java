package pl.pingwit.homework_25;

import org.apache.commons.lang3.RandomUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository {

    private final DataSource dataSource;

    public ProductRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int runCountQuery() { // этому методу больше подойдет название countProducts или что-то типа
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(" SELECT count(*) FROM products;");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1);
            } else {
                return 0;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Optional<Product> findProductById(Integer id) {
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(String.format("SELECT * FROM products WHERE id='%d'", id));
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) { // тк здесь ищем только один продукт, используй не while, а if
                return Optional.of(new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getBigDecimal(4)));
            }
            return Optional.empty();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Optional<List<Product>> findProductByName(String name) { // возвращаемое значение этого метода нужно изменить, возвращать список продуктов, а не optional. если продуктов с таким именем не нашлось - возвращаем пустой список
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(String.format("SELECT * FROM products WHERE name='%s'", name));
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Product> products = new ArrayList<>();

            while (resultSet.next()) {
                products.add(new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getBigDecimal(4)));
            }
            return Optional.of(products);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Integer createProduct(ProductDto productDto) {
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO products(id,name,description,price) VALUES (?,?,?,?)");
            int id = RandomUtils.nextInt(180, 190);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, productDto.getName());
            preparedStatement.setString(3, productDto.getDescription());
            preparedStatement.setBigDecimal(4, productDto.getPrice());
            preparedStatement.executeUpdate();
            return id;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> findAllProducts() {
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id,name,description,price FROM products");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Product> products = new ArrayList<>();
            while (resultSet.next()) {
                products.add(new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getBigDecimal(4)));
            }
            return products;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Integer deleteProductById(Integer id) {  // лучше изменить тип возвращаемого значения на void.
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(String.format("DELETE FROM products WHERE id='%d'", id));
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}



