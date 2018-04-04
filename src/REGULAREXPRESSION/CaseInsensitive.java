/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REGULAREXPRESSION;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Naveen
 */
public class CaseInsensitive {
    public static void main(String args[]){
        // Create a pattern to be searched
        Pattern pattern = Pattern.compile("ge*", Pattern.CASE_INSENSITIVE);
 
        // Search above pattern in "geeksforgeeks.org"
        Matcher m = pattern.matcher("GeeksforGeeks.org");
 
        // Print starting and ending indexes of the pattern
        // in text
        while (m.find())
            System.out.println("Pattern found from " + m.start() +
                               " to " + (m.end()-1));
    }
}
