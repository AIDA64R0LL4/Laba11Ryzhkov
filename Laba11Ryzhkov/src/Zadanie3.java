import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie3 {
    public static List<String> getCapitalizedStrings(List<String> list)
    {
        return list.stream().filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0))).collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("Машина", "самолет", "Грузовик", "вертолёт");

        System.out.println(getCapitalizedStrings(words));
    }
}
