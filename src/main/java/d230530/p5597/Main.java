package d230530.p5597;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        int arr[] = IntStream.rangeClosed(1, 30).toArray();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n - 1] = 0;
        }
        int[] arr2 = Arrays.stream(arr).filter(i -> i > 0).toArray();
        int max = Arrays.stream(arr2).max().getAsInt();
        int min = Arrays.stream(arr2).min().getAsInt();
        System.out.println(min);
        System.out.println(max);
    }
}
