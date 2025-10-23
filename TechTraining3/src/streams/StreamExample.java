package streams;
import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 2, 7, 3, 8, 10);

        // 1. Filter: Get numbers > 5
        System.out.println("Numbers > 5:");
        numbers.stream()
               .filter(x -> x > 5)
               .forEach(System.out::println);

        // 2. Map: Multiply each number by 2
        System.out.println("\nNumbers * 2:");
        List<Integer> doubled = numbers.stream()
                                       .map(x -> x * 2)
                                       .collect(Collectors.toList());
        System.out.println(doubled);

        // 3. Distinct: Remove duplicates
        System.out.println("\nDistinct numbers:");
        numbers.stream()
               .distinct()
               .forEach(System.out::println);

        // 4. Sorted: Ascending order
        System.out.println("\nSorted numbers:");
        numbers.stream()
               .sorted()
               .forEach(System.out::println);

        // 5. Sorted: Descending order
        System.out.println("\nSorted Descending:");
        numbers.stream()
               .sorted(Comparator.reverseOrder())
               .forEach(System.out::println);

        // 6. Count: Numbers greater than 5
        long count = numbers.stream()
                            .filter(x -> x > 5)
                            .count();
        System.out.println("\nCount of numbers > 5: " + count);

        // 7. Reduce: Sum of all numbers
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        System.out.println("\nSum of all numbers: " + sum);

        // 8. Convert List<Integer> to List<String>
        System.out.println("\nList<Integer> → List<String>:");
        List<String> strList = numbers.stream()
                                      .map(String::valueOf)
                                      .collect(Collectors.toList());
        System.out.println(strList);

        // 9. Find Max & Min
        int max = numbers.stream().max(Integer::compare).orElse(-1);
        int min = numbers.stream().min(Integer::compare).orElse(-1);
        System.out.println("\nMax: " + max + ", Min: " + min);
    }
}

