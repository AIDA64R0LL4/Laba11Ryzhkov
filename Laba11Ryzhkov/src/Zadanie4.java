import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie4 {
    public static List<Integer> getSquares(List<Integer> numbers)
    {
        return numbers.stream().map(n -> n * n).collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        System.out.println(getSquares(numbers));
    }
}
