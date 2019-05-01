package com.dipak.statickeyword;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * @author dipak
 */
public class StaticConsumer {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println(Static.apublic);
        Static.getApublic();
        Static.ints();
        Static s = new Static();
       /* java reflection api to call private method from another class*/
        Method method = s.getClass().getDeclaredMethod("stringdda", String.class);
        method.setAccessible(true);
        method.invoke(s, "print private method from another class without getter setter");
    }
}
