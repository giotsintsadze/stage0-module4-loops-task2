package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        int absoluteInput = multiplyByAndToInclusive < 0 ? -multiplyByAndToInclusive : multiplyByAndToInclusive;

        if (absoluteInput > 0){
            while (counter <= absoluteInput) {
                int result = counter * multiplyByAndToInclusive;
                System.out.println(result);
                counter++;
            }
        }
    }
}
