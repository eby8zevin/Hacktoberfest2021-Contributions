package Hacktoberfest;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String month[] = {"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
        System.out.print("Enter month:");
        int number = input.nextInt();
        
        System.out.println(month[number-1]);           
    }  
    
}
