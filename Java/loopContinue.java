import java.util.Scanner;
public class loopContinue{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int number, b, i, count;
	double avg, total;
	
	b = 0;
	count = 0;
	for(i= 0; i<5;i++){
		System.out.print("Enter a number: ");
		number = input.nextInt();
		if (number >= 50){
			continue;
		}
	b += number;
	count++;	
	}
	total = (double) b;
	System.out.printf("The total number is less than 50: %.2f\n", total);
	avg = (double) b/count;
	System.out.printf("Avarage number less than 50: %.2f\n", avg);
	
}
}