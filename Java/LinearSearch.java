import java.util.Scanner; 
public class LinearSearch { 
/* 
* Binary search algorithm using recursion 
*/
    public static void main(String[] args) { 

        Scanner commandReader = new Scanner(System.in); 
        System.out.println("Welcome to Java Program to perform linear search on int array"); 
        System.out.println("Enter length of array : "); 
        int length = commandReader.nextInt(); 
        int[] input = new int[length]; 

        System.out.printf("Enter %d numbers %n", length); 

        for (int i = 0; i < length; i++) { 
            input[i] = commandReader.nextInt(); 
        } 
        
        System.out.println("Please enter target number"); 
        int target = commandReader.nextInt(); 
        int index = linearSearch(input, target); 
        if (index == -1) {
            System.out.printf("Sorry, %d is not found in array %n", target);
        } else {
            System.out.printf("%d is found in array at index %d %n", target, index); 
        } commandReader.close(); 
    }
 
/** 
* Linear search an element in array 
* 
* @param input 
* @param target 
* @return index of target element or -1 if not found 
*/

    public static int linearSearch(int[] input, int target) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == target) { 
                return i; 
            } 
        } return -1; 
            
    } 
        
}



