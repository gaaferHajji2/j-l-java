/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;


import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Tatweer
 */
public class List1 {
    public static <T> List<T> toList(T[] arr){
        List<T> list = new ArrayList<>();
        
        for (T ele : arr) list.add(ele);
        
        
        return list;
    }
}
