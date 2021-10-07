import java.util.HashMap;
import java.util.Scanner;

public class FastPrimality {
    private static HashMap<Integer, Boolean> primes = new HashMap<Integer, Boolean>();

    public static void main(String[] args) {
        System.out.println("Enter your numbers for primality test (Type \"exit\" to stop):");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        while (!input.equals("exit")) {
            try {
                System.out.println(isPrime(Integer.parseInt(input)));
            } catch (Exception e) {
                System.out.println("Enter a valid number!");
            }
            input = in.nextLine();
        }
        in.close();
    }

    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        if (n == 2 || n == 3 || n == 5) {
            primes.put(n, true);
            return true;
        }

        if (primes.containsKey(n)) {
            return primes.get(n);
        }

        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
            primes.put(n, false);
            return false;
        }

        for (int i = 1; (30 * i - 23) <= Math.sqrt(n); i++) {
            if (n % (30 * i + 1) == 0 || n % (30 * i - 23) == 0 || n % (30 * i - 19) == 0 || n % (30 * i - 17) == 0
                    || n % (30 * i - 13) == 0 || n % (30 * i - 11) == 0 || n % (30 * i - 7) == 0
                    || n % (30 * i - 1) == 0) {
                primes.put(n, false);
                return false;
            }
        }
        primes.put(n, true);
        return true;
    }
}
