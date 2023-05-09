package com.example.demo.util;
import java.lang.reflect.Field;

import org.apache.commons.beanutils.BeanUtils;
public class EntityUtils {

    /**
     * Atualiza o objeto 'ojbectToUpdate' usando so dados <b>NÃO NULOS</b> do objeto 'objectWithNewValues'.
     * @param objectToUpdate Objeto a ser atualizado.
     * @param objectWithNewValues Objeto com os novos dados
     */
    public static <T> void update(T objectToUpdate, T objectWithNewValues) throws Exception {
        Field[] fields = objectToUpdate.getClass().getDeclaredFields();
        for (Field field: fields) {
            field.setAccessible(true);
            Object newValue = field.get(objectWithNewValues);
            if (newValue != null) {
                BeanUtils.copyProperty(objectToUpdate, field.getName(), newValue);
            }
        }
    }

}