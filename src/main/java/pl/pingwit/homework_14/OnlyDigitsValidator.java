package pl.pingwit.homework_14;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class OnlyDigitsValidator {

    // этим паттерном можно проверять любые строки, содержащие только цифры. слово phone здесь лишнее
    private static final Pattern PHONE_DIGIT_ONLY = Pattern.compile("^\\d*");

    // этим методом можно проверять любые строки, содержащие только цифры. слово phone здесь лишнее
    public void phoneValidate(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        for (Field declaredField : clazz.getDeclaredFields()) {
            for (Annotation annotation : declaredField.getAnnotations()) {
                if (annotation.annotationType().equals(OnlyDigits.class) && declaredField.getType().equals(String.class)) {
                    declaredField.setAccessible(true);
                    String value = (String) declaredField.get(obj);
                    if (!PHONE_DIGIT_ONLY.matcher(value).matches()) {
                        // сообщение можно дополнить информацией о том, что именно не валидно. Поле %s не валидно. Поле должно содержать только цифры
                        String message1 = String.format("Поле %s не валидно", declaredField.getName());
                        throw new PingwitException(message1);
                    }
                }
            }
        }
    }
}
