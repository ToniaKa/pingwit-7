package pl.pingwit.homework_2;
// преобразование строк
public class Task_2 {
    public static void main(String[] args) {

        String myByteString = "77";
        String myIntString = "12587";
        String myLongString = "-78945627";
        String myFloatString = "123.6789";
        String myDoubleString = "-8965.876655";

        Byte myParsedByte = Byte.parseByte(myByteString);
        Integer myParsedInteger = Integer.parseInt(myIntString);
        Long myParsedLong = Long.parseLong(myLongString);
        Float myParsedFloat = Float.parseFloat(myFloatString);
        Double myParsedDouble = Double.parseDouble(myDoubleString);

        System.out.println(myParsedByte);
        System.out.println(myParsedInteger);
        System.out.println(myParsedLong);
        System.out.println(myParsedFloat);
        System.out.println(myParsedDouble);





    }
}
