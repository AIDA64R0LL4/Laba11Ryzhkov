import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie10
{
    public static List<Integer> lessThan(List<Integer> numbers, int value)
    {
        return numbers.stream().filter(n -> n < value).collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(4, 5, 10, 15);

        System.out.println(lessThan(numbers, 10));
    }
}

