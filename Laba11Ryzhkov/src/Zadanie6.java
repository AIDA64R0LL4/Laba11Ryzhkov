import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie6 {
    public static List<Integer> divisibleBy(List<Integer> numbers, int divisor)
    {
        return numbers.stream().filter(n -> n % divisor == 0).collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 6, 9, 12);

        System.out.println(divisibleBy(numbers, 3));
    }
}
