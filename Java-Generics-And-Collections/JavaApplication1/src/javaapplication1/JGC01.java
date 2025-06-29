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
        List<String> words = new ArrayList<String>();
        
        words.add("Hello"); words.add("world!");
        
        String s = words.get(0) + " " + words.get(1);
        
        assert s.equals("Hello world!");
        
        System.out.println("OK 1!!");
        
        // Here we store list of Objects
        List words2 = new ArrayList();
        
        words2.add("Hello"); words2.add("world!");
        
        // The compiler will cast 2-words to string
        String s2 = words2.get(0) + " " + words2.get(1);
        
        assert s2.equals("Hello world!");
        
        System.out.println("OK 2!!");
        
        // s2.add(1); // This will provide a compile error
        
        List<Integer> ints = List1.toList(new Integer[] {1, 2, 3});
        List<String> words3 = List1.toList(new String[] {"Hello", "World"});
        
        assert ints.size() == 3;
        assert words3.size() == 2;
        
        System.out.println("OK 3!!");
        
        List<Integer> ints2 = List_2.toList(new Integer[] {1, 2, 3});
        List<String> words4 = List_2.toList(new String[] {"Hello", "World"});
        
        assert ints.size() == 3;
        assert words3.size() == 2;
        
        System.out.println("OK 4!!");
        
        ArrayList list = new ArrayList();
        
        List_2.addAll(list, new Integer[] {1, 2, 3});
        
        assert list.size() == 3;
        
        System.out.println("OK 5!!");
    }
    
}
