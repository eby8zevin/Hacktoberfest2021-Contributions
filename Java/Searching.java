package Hacktoberfest;
import java.util.Scanner;
public class Searching {
    public static int search(int arr[],int x){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[]={17,20,26,33,37,41,53,65,73,83};
        System.out.print("Enter the number you are looking for: ");
        int x = input.nextInt();
        System.out.println();
        
        int hasil = search(arr,x);
        if(hasil == -1){
            System.out.println("Sorry, the data you search not found");
        }
        else{
            System.out.println("Score " + x + " in index " + search(arr,x)+"");
        }
        }
    
}
