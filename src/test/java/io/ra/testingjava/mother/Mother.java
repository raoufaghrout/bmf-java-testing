package io.ra.testingjava.mother;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import static org.apache.commons.lang3.reflect.FieldUtils.*;

public class Mother<T> {

    private Map<String, Object> objectMap = new HashMap<>();
    private Class<T> tClass;

    public Mother(Class<T> tClass) {
        this.tClass = tClass;
    }

    public Mother<T> with(String propertyName, Object value) {
        objectMap.put(propertyName, value);
        return this;
    }

    public static <E> E updateField(E targetObject, String fieldName, Object value) {
        try {
            getDeclaredField(targetObject.getClass(), fieldName, true).set(targetObject, value);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot find the field: " + fieldName + "!");
        }

        return targetObject;
    }

    public T build() {
        T newInstance;

        try {
            newInstance = tClass.newInstance();
            for (Map.Entry<String, Object> eachKeyValue : objectMap.entrySet()) {
                Field declaredField = tClass.getDeclaredField(eachKeyValue.getKey());
                declaredField.setAccessible(true);
                declaredField.set(newInstance, eachKeyValue.getValue());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return newInstance;
    }
}
