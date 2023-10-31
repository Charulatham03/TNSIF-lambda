package lambdaexpression.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stringlist {

    public static void main(String[] args) {

        List<String> listOfStrings = new ArrayList<>(Arrays.asList("Apple", "words", "calendar", "Pear", "Pencil"));

        // Filter out all strings with a length less than 5 characters using a lambda expression
        List<String> filteredList = listOfStrings.stream()
                .filter(str -> str.length() >= 5)
                .collect(Collectors.toList());

        // Print the filtered list
        System.out.println(filteredList);
    }
}