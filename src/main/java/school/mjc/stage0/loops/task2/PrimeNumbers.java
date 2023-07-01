package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 1;
        int divisibleCount;
        int secCounter;
        if(printToInclusive ==0) {
        } else {
            while (counter <= printToInclusive) {
                secCounter = 2;
                divisibleCount = 0;
                while (secCounter <= counter/2) {
                    if (counter % secCounter == 0) {
                        divisibleCount++;
                        break;
                    }
                    secCounter++;
                }
                if (divisibleCount == 0 && counter != 1) {
                    System.out.println(counter);
                }
                counter++;
            }
        }
    }
}
