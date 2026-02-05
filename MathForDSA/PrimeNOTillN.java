public class PrimeNOTillN {

  public static void main(String[] args) {
    int n = 38;

    // false means prime initially, true means marked as non-prime
    boolean[] primes = new boolean[n + 1];

    sieve(n, primes);
  }

  static void sieve(int n, boolean[] primes) {

    // we only need to check till sqrt(n)
    // because smaller factors already mark larger multiples
    for (int i = 2; (i * i) <= n; i++) {

      // if number is not marked, it is prime
      if (!primes[i]) {
        // start marking multiples from i*i
        // smaller multiples are already handled by previous primes
        for (int j = (i * i); j <= n; j += i) {
          primes[j] = true; // mark as non-prime
        }
      }
    }

    // remaining unmarked numbers are prime
    for (int i = 2; i <= n; i++) {
      if (!primes[i]) {
        System.out.print(i + " ");
      }
    }
  }
}
