
// Import Collections framework to use Array Lists, and Scanner to get inputs
import java.util.*;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elainewijaya
 */
public class AnyInputs {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {
        // Initialise our Array List al to dynamically store inputs
        // Declare it with the Float type to make it easier for calculations later
        ArrayList <Float> al = new ArrayList<>();
        // Initialise our sum before the loop so we can calculate the sum while adding to the Array list
        Float sum = 0f;
        // Initialise the input 
        Scanner input = new Scanner(System.in);

        
        // Get the number of inputs so we know when to end our loop
        System.out.println("Enter the number of inputs:");
        int nums = input.nextInt();
        
            // Loop over the number of inputs and add a new number to our list at each increment
            for (int i = 0; i < nums; i++) {
                System.out.println("Enter the next number:");
                al.add(input.nextFloat());
                // Calculate the sum while adding numbers to our list
                sum += al.get(i);
            }
            
            // Given no inputs, there is no min, max or average, so we terminate the program
            if ( al.isEmpty() ) {
                System.out.println("You have not entered any numbers.");
                System.exit(0);
            }
        
        // Sort the array list in ascending order
        Collections.sort(al);
        
        // Take the first element to get the minimum
        System.out.println("Min: " + al.get(0));
        // Take the last element to get the maximum
        System.out.println("Max: " + al.get(al.size()-1));
        // Divide the sum by the number of elements to get the average
        System.out.println("Average: " + sum/al.size());

    }
    
}
