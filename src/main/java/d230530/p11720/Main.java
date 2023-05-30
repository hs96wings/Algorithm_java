package d230530.p11720;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");
        int sum = Arrays.stream(s).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
