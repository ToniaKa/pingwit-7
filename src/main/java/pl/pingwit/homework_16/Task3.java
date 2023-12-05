package pl.pingwit.homework_16;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        // здесь нужно написать код, чтобы спросить у пользователя город, где искать банкоматы, и потом подставить в шаблон
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста город:");
        String urlTemplate = String.format("https://belarusbank.by/api/atm?city=%s", scanner.nextLine());

        try {
            String jsonResponse = sendHttpGetRequest(urlTemplate);

            ATM[] atms = parseJsonResponse(jsonResponse);

            // Display the parsed objects
            for (ATM obj : atms) {
                System.out.println(obj);
            }

        } catch (IOException e) { // NPE не нужно ловить. нужно создавать условия, чтобы она не вылетала
            // в методе parseJsonResponse можно возвращать пустой массив, если на вход пришла пуста строка либо null
            throw new PingwitException("Извините вы ввели несуществующий город, попробуйте еще раз!");
        }
    }

    private static String sendHttpGetRequest(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = in.readLine()) != null) {
                    response.append(line);
                }
                return response.toString();
            }
        } else {
            throw new IOException("HTTP GET request failed with response code: " + responseCode);
        }
    }

    private static ATM[] parseJsonResponse(String jsonResponse) throws IOException {
        // допишите метод
        //"", null -> пустой массив
        if (StringUtils.isNotBlank(jsonResponse) && !jsonResponse.equals("null")) {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(jsonResponse, ATM[].class);
        }
        return new ATM[]{};
    }
}

