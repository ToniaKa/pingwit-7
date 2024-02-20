package pl.pingwit.homework_25;

import com.zaxxer.hikari.HikariDataSource;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Application {
    private static final String URL = "jdbc:postgresql://localhost:5432/pingwit_from_dump";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl(URL);
        ds.setUsername(USERNAME);
        ds.setPassword(PASSWORD);

        ProductRepository productRepository = new ProductRepository(ds);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Приветствуем Вас в продуктовой корзине! Выберите желаемую операцию: ");
            System.out.println("Введите 1 для подсчета количества продуктов, 2 - для получения продукта по ID, 3 - для получения продукта по наименованию, " +
                    "4 - для создания продукта, 5 - для получения всех продуктов, 6 - для удаления продукта по ID, 777 - для выхода из программы");
            int operation = scanner.nextInt();

            if (operation == 1) {
                int productCount = productRepository.runCountQuery();
                System.out.printf("В корзине %s продуктов%n", productCount);
                System.out.println("--------------------------------------");
            } else if (operation == 2) {

                System.out.println("Введите ID продукта для поиска:");

                int id = scanner.nextInt();
                Optional<Product> productById = productRepository.findProductById(id);
                if (productById.isPresent()) {
                    System.out.println(productById.get());
                } else {
                    System.out.printf("Продукт с ID = %d не найден!%n", id);
                    System.out.println("--------------------------------------");
                }
            } else if (operation == 3) {

                System.out.println("Введите наименование продукта для поиска:");

                String name = scanner.next();
                Optional<List<Product>> productByName = productRepository.findProductByName(name);
                if (productByName.isPresent()) {
                    System.out.println(productByName.get());
                } else {
                    System.out.printf("Продукт с наименованием = %S не найден!%n", name);
                    System.out.println("--------------------------------------");
                }
            } else if (operation == 4) {

                System.out.println("Создаем продукт.");
                System.out.println("Введите name продукта:");
                String name = scanner.next();
                System.out.println("Введите description продукта:");
                String description = scanner.next();
                System.out.println("Введите price продукта:");
                BigDecimal price = new BigDecimal(scanner.next());

                Integer productId = productRepository.createProduct(new ProductDto(name, description, price));
                System.out.printf("Создан продукт с ID = %d", productId);
                System.out.println("--------------------------------------");

            } else if (operation == 5) {
                List<Product> allProducts = productRepository.findAllProducts();
                System.out.print(allProducts);
                System.out.println("--------------------------------------");
            } else if (operation == 6) {
                System.out.println("Введите id продукта для удаления:");
                int productIdByDelete = scanner.nextInt();
                Integer i = productRepository.deleteProductById(productIdByDelete);
                if (productIdByDelete == i) {
                    System.out.printf("Продукт с ID = %d не найден!%n", productIdByDelete);
                } else {
                    productRepository.deleteProductById(productIdByDelete);
                    System.out.printf("Продукт с ID = %d успешно удален!%n", productIdByDelete);
                }
            } else {
                System.out.println("До свидания!");
                break;
            }
        }
    }
}
