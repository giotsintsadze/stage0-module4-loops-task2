package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder phraseBuilder = new StringBuilder();

        int index = 0;
        while (index < chars.length) {
            phraseBuilder.append(chars[index]);
            index++;
        }

        String phrase = phraseBuilder.toString();
        System.out.print(phrase);
    }
}
