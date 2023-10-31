package lambdaexpression.Task;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Maxmin {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 2, 9, 6, 23, 12, 34, 0, 1);

        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);

        System.out.println("Maximum value: " + max.orElse(null));
        System.out.println("Minimum value: " + min.orElse(null));
    }
}



