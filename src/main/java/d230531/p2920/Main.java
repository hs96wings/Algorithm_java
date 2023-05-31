package d230531.p2920;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] arr = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        int[] ascending = IntStream.rangeClosed(1, 8).toArray();
        int[] descending = IntStream.rangeClosed(1, 8).map(i -> 9 - i).toArray();

        if (Arrays.equals(arr, ascending))
            System.out.println("ascending");
        else if (Arrays.equals(arr, descending))
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}
