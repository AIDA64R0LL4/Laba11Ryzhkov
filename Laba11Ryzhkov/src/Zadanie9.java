import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie9
{
    public static List<String> onlyLetters(List<String> list)
    {
        return list.stream().filter(s -> s.matches("[a-zA-Zа-яА-Я]+")).collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("Школа", "11класс", "Колледж", "1курс");

        System.out.println(onlyLetters(words));
    }
}
