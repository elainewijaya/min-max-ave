
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
        Float[] list = new Float[3];
        Float sum = 0f;
        
        Scanner input = new Scanner(System.in);
            for (int i = 0; i < list.length; i++) {
                System.out.println("Enter the next number:");
                list[i] = input.nextFloat();
                sum += list[i];
            }
    System.out.println("You have entered the following numbers: " + Arrays.toString(list));
    
    Arrays.sort(list);
    System.out.println("Max:  " + list[0]);
    System.out.println("Min:  " + list[list.length-1]);
    System.out.println("Average:  " + sum/list.length);
    }
    // TODO code application logic here
        

    
}
