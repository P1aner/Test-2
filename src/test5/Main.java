package test5;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Name name = new Name("Jj");
       for(Field field : name.getClass().getDeclaredFields()){
               System.out.println(field.getGenericType().equals(String.class));
       }
    }

}
