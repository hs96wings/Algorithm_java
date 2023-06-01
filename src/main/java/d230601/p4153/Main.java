package d230601.p4153;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s;
        int[] arr;
        int[] exit = new int[] {0, 0, 0};

        while (true) {
            s = br.readLine().split(" ");
            arr = Arrays.stream(s).mapToInt(Integer::parseInt).sorted().toArray();

            if (Arrays.equals(arr, exit))
                break;

            if (arr[2] * arr[2] == arr[0] * arr[0] + arr[1] * arr[1])
                System.out.println("right");
            else
                System.out.println("wrong");

        }
    }
}
