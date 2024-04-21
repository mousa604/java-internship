/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arrayoperations;

/**
 *
 * @author Fc
 */
public class Mavenproject5 {
    

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        
        int sum = calculateSum(numbers);
        double average = calculateAverage(numbers);
        
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
    
    
    // function to calculate the sum of elements 
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    
    
    // function to calculate the average of elements 
    public static double calculateAverage(int[] arr) {
        int sum = calculateSum(arr);
        double average = (double) sum / arr.length;
        return average;
    }
}
