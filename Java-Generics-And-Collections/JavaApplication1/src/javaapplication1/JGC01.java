/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tatweer
 */
public class JGC01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        
        words.add("Hello"); words.add("world!");
        
        String s = words.get(0) + " " + words.get(1);
        
        assert s.equals("Hello world!");
        
        System.out.println("OK!!");
    }
    
}
