package pl.pingwit.homework_11.taromat;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        Tare tare1 = new Tare("bottle", Material.PLASTIC);
        Tare tare2 = new Tare("bottle", Material.GLASS);
        Tare tare3 = new Tare("bottle", Material.GLASS);
        Tare tare4 = new Tare("pot", Material.ALUMINUM);
        Tare tare5 = new Tare("bottle", Material.PLASTIC);
        Tare tare6 = new Tare("pot", Material.ALUMINUM);

        Tare[] tares = {tare1, tare2, tare3, tare4, tare5, tare6};

        Taromat taromat = new Taromat();

        System.out.println(taromat.tareCalculator(tares));
    }
}

