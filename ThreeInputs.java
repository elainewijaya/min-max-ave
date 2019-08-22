
import java.util.Arrays;
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
public class ThreeInputs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialise our list of size 3
        Float[] list = new Float[3];
        // Initialise sum
        Float sum = 0f;
        
        Scanner input = new Scanner(System.in);
            // Loop 3 times
            for (int i = 0; i < list.length; i++) {
                System.out.println("Enter the next number:");
                // Get the next input
                list[i] = input.nextFloat();
                sum += list[i];
            }
    System.out.println("You have entered the following numbers: " + Arrays.toString(list));
    
    // Sort the list in ascending order
    Arrays.sort(list);
    // Min is the first element
    System.out.println("Min:  " + list[0]);
    // Max is the last number
    System.out.println("Max:  " + list[list.length-1]);
    // Average is the sum divided by the number of elements in the list
    System.out.println("Average:  " + sum/list.length);
    }
        

    
}
