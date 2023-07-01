package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String answer = "";
        int lenght = chars.length;
        int counter = 0;

        if (lenght > 0) {
            while (counter < lenght) {
                answer = "" + answer + chars[counter];
                counter++;
            }
        }
        System.out.println(answer);
    }
}
