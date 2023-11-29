package pl.pingwit.homework_15.package_1.package_2;

import pl.pingwit.homework_14.PingwitException;

import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

       /* Task 1
        В пакете с ДЗ создайте пакет package_1, внутри его еще один пакет package_2, а внутри его - текстовый файл (example.txt).
        В классе Application c помощью класса File проверить, являются ли папками package_1 и package_2.
        Создать внутри package_2 папку package_3.
        С помощью класса Scanner прочитать и вывести в консоль содержимое файла example.txt*/

        String path1 = "src/main/java/pl/pingwit/homework_15/package_1";
        String path2 = "src/main/java/pl/pingwit/homework_15/package_1/package_2";
        File file1 = new File(path1);
        File file2 = new File(path2);
        boolean isDirectoryPackage1 = file1.isDirectory();
        boolean isDirectoryPackage2 = file2.isDirectory();
        System.out.println(isDirectoryPackage1);
        System.out.println(isDirectoryPackage2);

        String pathText = "src/main/java/pl/pingwit/homework_15/package_1/package_2/package_3/example.txt";
        File fileText = new File(pathText);

        try {
            Scanner scanner = new Scanner(fileText);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new PingwitException("File not found");
        }

        /*Task 2
        Скопируйте в проект любое изображение.
        С помощью FileInputReader и FileOutputReader сделайте копию файла.*/

        String fileInputPath = "src/main/java/pl/pingwit/homework_15/package_1/package_2/package_3/java_1.jpg";
        String fileOutputPath = "src/main/java/pl/pingwit/homework_15/package_1/package_2/package_3/java_1_copy.jpg";

        try (InputStream inputStream = new FileInputStream(fileInputPath);
             OutputStream outputStream = new FileOutputStream(fileOutputPath)) {
            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       /* Task 3
        Скопируйте в проект любое изображение.
        С помощью BufferedInputReader и BufferedOutputReader сделайте копию файла.*/

        String bufferedInputPath = "src/main/java/pl/pingwit/homework_15/package_1/package_2/package_3/taksa.jpg";
        String bufferedOutputPath = "src/main/java/pl/pingwit/homework_15/package_1/package_2/package_3/taksa_copy.jpg";

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(bufferedInputPath))) {
            try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(bufferedOutputPath))) {
                byte[] bytes = new byte[100];
                while (bufferedInputStream.read(bytes) != -1) {
                    for (byte aByte : bytes) {
                        bufferedOutputStream.write(aByte);
                    }
                    bufferedOutputStream.flush();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       /* Task 4
        Создайте в проекте текстовый файл с вашей любимой песней.
        С помощью FileReader и FileWriter создайте копию файла + выведите содержимое в консоль*/

        String readerPath = "src/main/java/pl/pingwit/homework_15/package_1/package_2/package_3/in the morning.txt";
        String writerPath = "src/main/java/pl/pingwit/homework_15/package_1/package_2/package_3/in the morning_copy.txt";

        try (FileReader fileReader = new FileReader(readerPath)) {
            try (FileWriter fileWriter = new FileWriter(writerPath)) {
                int data;
                while ((data = fileReader.read()) != -1) {
                    fileWriter.write(data);
                    System.out.print((char) data);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*Task 5
        Создайте в проекте текстовый файл с вашей любимой песней.
        С помощью BufferedReader и BufferedWriter создайте копию файла + выведите содержимое в консоль*/

        String bufferedReaderPath = "src/main/java/pl/pingwit/homework_15/package_1/package_2/package_3/topoliny puh.txt";
        String bufferedWriterPath = "src/main/java/pl/pingwit/homework_15/package_1/package_2/package_3/topoliny puh_copy.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(bufferedReaderPath))) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bufferedWriterPath))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                    bufferedWriter.write(line);
                    bufferedWriter.write("\n");
                }
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}







