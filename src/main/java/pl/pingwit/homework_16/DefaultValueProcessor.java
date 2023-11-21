package pl.pingwit.homework_16;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.time.LocalDate;

public class DefaultValueProcessor {
    public void process(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        for (Field declaredField : clazz.getDeclaredFields()) {
            declaredField.setAccessible(true);
            for (Annotation annotation : declaredField.getAnnotations()) {
                if (annotation.annotationType().equals(DefaultValue.class) && declaredField.get(obj) == null) {

                    if (declaredField.getType().equals(String.class)) {
                        declaredField.set(obj, "defaultValue");
                    }
                    if (declaredField.getType().equals(LocalDate.class)) {
                        declaredField.set(obj, LocalDate.now());
                    }
                    if (declaredField.getType().equals(Integer.class)) {
                        declaredField.set(obj, 0);
                    }
                }
            }
        }
    }
}


















