/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5.act7;

/**
 *
 * @author 1DAW2425-09
 */
import java.util.*;

public class Main {

    //TreeSet se implementa de forma distinta pero sería lo mismo
    // aparte de los metodos
    public static void main(String[] args) {

        Set<String> abc2 = new TreeSet<>();
        SortedSet<String> abc = new TreeSet<>();
        abc.add("B");
        abc.add("C");
        abc.add("A");

        abc2.add("A");
        abc2.add("B");
        abc2.add("C");
        
        System.out.println(abc.first());
        System.out.println(abc.last());
        Iterator<String> it = abc2.iterator();
        if (it.hasNext()) {
            System.out.println(it.next());
            
        }
     
        System.out.println(abc2);
        
         System.out.println(abc.first());
         
         
        SortedSet<String> anterioresACelia = abc.headSet("C");
        System.out.println("Elementos antes de 'C': " + anterioresACelia);

        //SortedSet<String> abc2 = new HashSet<>();
    }

}
