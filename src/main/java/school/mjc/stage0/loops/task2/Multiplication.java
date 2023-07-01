package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        int answer = 0;
        if (multiplyByAndToInclusive > 0) {
            while (counter < multiplyByAndToInclusive + 1) {
                counter++;
                System.out.println(answer);
                answer = multiplyByAndToInclusive + answer;
            }
        } else if (multiplyByAndToInclusive < 0) {
            counter = multiplyByAndToInclusive;
            while (counter < 1) {
                System.out.println(answer);
                answer = multiplyByAndToInclusive + answer;
                counter++;
            }
        }
    }
}
