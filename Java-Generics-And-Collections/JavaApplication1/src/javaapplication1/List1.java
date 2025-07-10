package javaapplication1;


import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static <T> List<T> toList(T[] arr){
        List<T> list = new ArrayList<T>();
        
        for (T ele : arr) list.add(ele);
        
        
        return list;
    }
}
