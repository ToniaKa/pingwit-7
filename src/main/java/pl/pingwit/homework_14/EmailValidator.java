package pl.pingwit.homework_14;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class EmailValidator {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

    public void emailValidate(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        for (Field declaredField : clazz.getDeclaredFields()) {
            for (Annotation annotation : declaredField.getAnnotations()) {
                if (annotation.annotationType().equals(Email.class) && declaredField.getType().equals(String.class)) {
                    declaredField.setAccessible(true);
                    String value = (String) declaredField.get(obj);
                    if (!EMAIL_PATTERN.matcher(value).matches()) {
                        // сообщение можно дополнить информацией о том, что именно не валидно.
                        String message = String.format("Поле %s не валидно. Пожалуйста, проверьте правильность написания email-адреса", declaredField.getName());
                        throw new PingwitException(message);
                    }
                }
            }
        }
    }
}
