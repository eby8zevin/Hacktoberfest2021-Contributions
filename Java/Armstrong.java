import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is armstrong or not");
        int num = in.nextInt();
        System.out.println(isArmstrong(num));
    }

    static boolean isArmstrong(int num){
        int sum = 0;
        int temp = num;
        while (temp > 0){
            int rem = temp % 10;
            sum += (rem*rem*rem);
            temp /= 10;
        }
        return num == sum;
    }
}