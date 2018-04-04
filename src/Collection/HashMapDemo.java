/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.HashMap;

/**
 *
 * @author Naveen
 */
public class HashMapDemo {
     public static void main(String args[])
    {
        // Creation of HashMap
        HashMap<String, String> Geeks = new HashMap<>();
 
        // Adding values to HashMap as ("keys", "values")
        Geeks.put("Language", "Java");
        Geeks.put("Platform", "Geeks For geeks");
        Geeks.put("Code", "HashMap");
        Geeks.put("Learn", "More");
 
        System.out.println("Testing .isEmpty() method");
 
        // Checks whether the HashMap is empty or not
        // Not empty so printing the values
        if (!Geeks.isEmpty())
        {
            System.out.println("HashMap Geeks is notempty");
 
            // Accessing the contents of HashMap through Keys
            System.out.println("GEEKS : " + Geeks.get("Language"));
            System.out.println("GEEKS : " + Geeks.get("Platform"));
            System.out.println("GEEKS : " + Geeks.get("Code"));
            System.out.println("GEEKS : " + Geeks.get("Learn"));
 
            // size() method prints the size of HashMap.
            System.out.println("Size Of HashMap : " + Geeks.size());
        }
    }
}
