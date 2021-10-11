/**
 *
 * @author Raden Dimas Erlangga
 */
import java.util.Scanner;
public class ArrayInputLoop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       int []nilaiUas = new int [6];
       for(int i=0; i<nilaiUas.length; i++){
           System.out.print("input number grade-"+i+": ");
           nilaiUas[i]=sc.nextInt();
    }
       for(int i=0; i<nilaiUas.length; i++){
           if (nilaiUas[i]>70){
          System.out.println("student with  id number "+i+" is passed");
          }else{
          if (nilaiUas[i]<70){
        System.out.println("student with id number "+i+" is not yet passed");
       }
    }
}
}
}