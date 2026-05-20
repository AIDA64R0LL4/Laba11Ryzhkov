import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie7 {
    public static List<String> longerThan(List<String> list, int length)
    {
        return list.stream().filter(s -> s.length() > length).collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("ОБЖ", "Геометрия");

        System.out.println(longerThan(names, 4));
    }
}
