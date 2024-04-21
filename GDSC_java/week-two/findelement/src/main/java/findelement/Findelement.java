/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.findelement;

/**
 *
 * @author Fc
 */
public class Findelement {

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
