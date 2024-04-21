/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package findelementpostion;

/**
 *
 * @author Fc
 */
public class Findelementpostion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] numbers = {10,20,30,40,50,60,70,80,90};
        int target = 60;
        int position = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                if (i < 5) {
                    continue; 
                } else {
                    position = i;
                    break;
                }
            }
        }

        if (position != -1) {
            System.out.println("First occurrence of " + target + " is at position " + position);
        } else {
            System.out.println("No occurrence of " + target + " found after position 5.");
        }
    
    }
    
}
