package com.tian.annote;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * create by txm  on 2020/7/10
 * desc
 */
class MyTestClass<T> {
    Type type;

    public MyTestClass( ) {

        Type superclass = getClass().getGenericSuperclass();
        if (superclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        ParameterizedType parameterized = (ParameterizedType) superclass;
        type = parameterized.getActualTypeArguments()[0];
    }

    public Type getType() {
        return type;
    }
}
