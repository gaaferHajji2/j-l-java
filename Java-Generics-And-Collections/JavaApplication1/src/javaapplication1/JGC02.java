package javaapplication1;

import java.util.ArrayList;
import java.util.List;

public class JGC02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           List<Integer> ints = new ArrayList<>();
           
           ints.add(1);
           
           System.out.println("The First Value is: " + ints.getFirst());           
           System.out.println("The First Value is: " + ints.getFirst().intValue());

           // This will fail, will not assert anything
           assert Integer.valueOf(500) != Integer.valueOf(500);
    }
    
}
