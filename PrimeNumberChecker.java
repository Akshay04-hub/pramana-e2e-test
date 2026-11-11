public class PrimeNumberChecker {

    public static boolean isPrime(int number) {

        // INTENTIONAL BUG: 1 is incorrectly treated as prime.
        if (number <= 0) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("Testing Prime Number Checker");

        if (isPrime(1) != false) {
            throw new AssertionError("Test failed: 1 is not prime");
        }

        if (isPrime(7) != true) {
            throw new AssertionError("Test failed: 7 should be prime");
        }

        if (isPrime(9) != false) {
            throw new AssertionError("Test failed: 9 is not prime");
        }

        System.out.println("All tests passed!");
    }
}