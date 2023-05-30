package d230530.p10807;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] arr = Arrays.stream(s)
                .mapToInt(Integer::parseInt)
                .toArray();
        int v = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v)
                cnt++;
        }
        System.out.println(cnt);
    }
}
