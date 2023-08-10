package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int currentNumber = 2;
        while (currentNumber <= printToInclusive) {
            boolean isPrime = true;
            for (int i = 2; i < currentNumber; i++) {
                if (currentNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(currentNumber);
            }

            currentNumber++;
        }
    }
}
