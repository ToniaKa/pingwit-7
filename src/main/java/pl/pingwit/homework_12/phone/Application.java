package pl.pingwit.homework_12.phone;

public class Application {
    public static void main(String[] args) {
        DiskPhone diskPhone = new DiskPhone("AK-15", 1978, 2.54);
        RadioPhone radioPhone = new RadioPhone("Swatch-1", 1991, 150);
        MobilePhone mobilePhone = new MobilePhone("Nokia 3310", 2008, true, false, PhoneTypes.MONOBLOCK);
        SmartPhone smartPhone = new SmartPhone("iPhone 14", 2022, OperatingSystem.IOS, 6.1, RandomAccessMemory.NUMBER_128);

        System.out.println(diskPhone.makeCall());
        System.out.println(diskPhone.recieveCall());
        System.out.println();
        System.out.println(radioPhone.makeCall());
        System.out.println(radioPhone.recieveCall());
        System.out.println();
        System.out.println(mobilePhone.makeCall());
        System.out.println(mobilePhone.recieveCall());
        System.out.println();
        System.out.println(smartPhone.makeCall());
        System.out.println(smartPhone.recieveCall());
    }
}
