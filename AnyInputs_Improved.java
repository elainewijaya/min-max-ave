/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elainewijaya
 */

import java.util.*;
import java.util.Scanner;

public class AnyInputs_Improved {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Initialise our Array List al to dynamically store inputs
        // Declare it with the Float type to make it easier for calculations later
        ArrayList <Float> al = new ArrayList<>();
        // Initialise our sum before the loop so we can calculate the sum while adding to the Array list
        Float sum = 0f;
        // Initialise input
        Scanner input = new Scanner(System.in);
        
        while(true) {
            System.out.println("Enter your next number, or enter 'stop' to stop adding numbers:");
            
            // Check if input is a float; if it is, add it to the list
            if ( input.hasNextFloat()) {
                al.add(input.nextFloat());
                sum += al.get(al.size()-1);
            // If our input is stop, exit the loop
            } else if (input.next().equals("stop")){
                break;
            // If our input is not a float or stop, skip this iteration
            } else {
                System.out.println("Invalid input - please enter either a number or 'stop'.");
            }
        }
        
        // If there are no inputs, stop the program
        if ( al.isEmpty() ) {
                System.out.println("You have not entered any numbers. Bye bye!");
                System.exit(0);
            }
        
        System.out.println("Your numbers are:  " + al);
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
