/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package METHODS;

/**
 *
 * @author Naveen
 */
// Takes string as a argument followed by varargs
public class Varargs {
    static void fun2(String str, int ...a)
    {
        System.out.println("String: " + str);
        System.out.println("Number of arguments is: "+ a.length);
 
        // using for each loop to display contents of a
        for (int i: a)
            System.out.print(i + " ");
 
        System.out.println();
    }
    public static void main(String args[]){
         // Calling fun2() with different parameter
        fun2("GeeksforGeeks", 100, 200);
        fun2("CSPortal", 1, 2, 3, 4, 5);
        fun2("forGeeks");
    }
}
