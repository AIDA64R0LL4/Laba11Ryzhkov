import java.util.Arrays;

public class Zadanie1 {
    public static int[] getEvenNumbers(int[] arr)
    {
        return Arrays.stream(arr).filter(n -> n % 2 == 0).toArray();
    }

    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(getEvenNumbers(numbers)));
    }
}

