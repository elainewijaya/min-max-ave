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
        ArrayList <Float> al = new ArrayList<>();
        Float sum = 0f;
        Scanner input = new Scanner(System.in);
        
        while(true) {
            System.out.println("Enter your next number, or enter 'stop' to stop adding numbers:");
            
            if ( input.hasNextFloat()) {
                al.add(input.nextFloat());
                sum += al.get(al.size()-1);
            } else if (input.next().equals("stop")){
                break;
            } else {
                System.out.println("Invalid input - please enter either a number or 'stop'.");
            }
        }
        
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
