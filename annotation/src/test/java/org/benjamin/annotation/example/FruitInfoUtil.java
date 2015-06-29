package org.benjamin.annotation.example;

import java.lang.reflect.Field;

import org.benjamin.annotation.FruitColor;
import org.benjamin.annotation.FruitName;
import org.benjamin.annotation.FruitProvider;

public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz){
        
        String strFruitName=" Fruit Name - ";
        String strFruitColor=" Fruit Color - ";
        String strFruitProvicer=" Provider Info - ";
        
        Field[] fields = clazz.getDeclaredFields();
        
        for(Field field :fields){
            if(field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = (FruitName) field.getAnnotation(FruitName.class);
                strFruitName=strFruitName+fruitName.value();
                System.out.println(strFruitName);
            }
            else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor= (FruitColor) field.getAnnotation(FruitColor.class);
                strFruitColor=strFruitColor+fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
            }
            else if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider= (FruitProvider) field.getAnnotation(FruitProvider.class);
                strFruitProvicer=" Provider Number - "+fruitProvider.id()+" Provider Name - "+fruitProvider.name()+" Provider Address - "+fruitProvider.address();
                System.out.println(strFruitProvicer);
            }
        }
    }
}
