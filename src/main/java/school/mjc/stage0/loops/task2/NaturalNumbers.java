package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int counter = 0;
        while (counter < lastPrinted + 1) {
            System.out.println(counter);
            counter++;
        }
    }
}
