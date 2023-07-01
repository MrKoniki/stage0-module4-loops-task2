package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int answer = 1;
        int counter = 0;

        if (printToInclusive == 0) {
            System.out.println(answer);
        } else {
            while (counter < printToInclusive + 1) {
                System.out.println(answer);
                counter++;
                answer = answer * counter;
            }
        }
    }
}
