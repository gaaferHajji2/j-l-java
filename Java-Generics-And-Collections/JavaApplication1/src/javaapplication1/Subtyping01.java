package javaapplication1;

import java.util.ArrayList;
import java.util.List;


public class Subtyping01 {

    
    public static void main(String[] args) {
        List<Number> ints = new ArrayList<>();
        
        // Here we use autoboxing for types 1 --> Integer, and 0.25 --> Double
        ints.add(1);
        ints.add(0.25);
        
        assert ints.equals(List.of(1, 0.25));
        
        System.out.println("OK 1!!");
    }
    
}
