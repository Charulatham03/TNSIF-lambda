package lambdaexpression.Task;
import java.util.Arrays;
import java.util.List;

public class Calculateavg {

    public static void main(String[] args) {

        List<Double> listOfNumbers = Arrays.asList(1.2, 2.3, 3.4, 4.5, 5.6);

        // using lambda expressions to calculate average of a list of doubles
        double average = listOfNumbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("The average of the list of numbers is: " + average);
    }
}
