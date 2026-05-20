import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie8 {
    public static List<Integer> greaterThan(List<Integer> numbers, int value)
    {
        return numbers.stream().filter(n -> n > value).collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);

        System.out.println(greaterThan(numbers, 10));
    }
}
