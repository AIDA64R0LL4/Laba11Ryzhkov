import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie5 {
    public static List<String> containsSubstring(List<String> list, String sub)
    {
        return list.stream().filter(s -> s.contains(sub)).collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("Школа", "Колледж", "Институт");

        System.out.println(containsSubstring(words, "Школа"));
    }
}
