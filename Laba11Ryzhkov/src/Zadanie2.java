import java.util.Arrays;

public class Zadanie2 {
    public static int[] getCommonElements(int[] arr1, int[] arr2)
    {
        return Arrays.stream(arr1).filter(x -> Arrays.stream(arr2).anyMatch(y -> y == x)).distinct().toArray();
    }

    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        System.out.println(Arrays.toString(getCommonElements(a, b)));
    }
}
