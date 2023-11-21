package pl.pingwit.homework_16;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class OnlyDigitsValidator {
    private static final Pattern PHONE_DIGIT_ONLY = Pattern.compile("^\\d*");

    public void phoneValidate(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        for (Field declaredField : clazz.getDeclaredFields()) {
            for (Annotation annotation : declaredField.getAnnotations()) {
                if(annotation.annotationType().equals(OnlyDigits.class)&& declaredField.getType().equals(String.class)){
                    declaredField.setAccessible(true);
                    String value=(String) declaredField.get(obj);
                    if (!PHONE_DIGIT_ONLY.matcher(value).matches()){
                        String message1=String.format("Поле %s не валидно", declaredField.getName());
                        throw new PingwitException(message1);
                    }
                }
            }
        }
    }
}
