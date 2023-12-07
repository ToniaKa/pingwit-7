package pl.pingwit.homework_16;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ATMDeserialization {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ATM[] atm = objectMapper.readValue(new File("src/main/java/pl/pingwit/homework_16/atms.json"), ATM[].class);
        System.out.println(Arrays.toString(atm));
    }
}
