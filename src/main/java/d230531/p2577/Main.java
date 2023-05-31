package d230531.p2577;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String[] s = Integer.toString(a * b * c).split("");

        int[] nums = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        int[] cnt = new int[10];

        for (int num : nums) {
            cnt[num]++;
        }

        for (int n : cnt) {
            System.out.println(n);
        }
    }
}
