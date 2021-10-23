import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Sieve of eratosthenes is an algorithm that is used to calculate all the prime numbers
 * smaller or equal to given number
 */
class SieveOfEratosthenes {
    static List<Integer> sieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p])
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
        }

        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i])
                primeNumbers.add(i);
        }
        return primeNumbers;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Primes Number within range from 2 - " + n);
        for (Integer prime : SieveOfEratosthenes.sieveOfEratosthenes(n)) {
            System.out.println(prime);
        }
    }
}