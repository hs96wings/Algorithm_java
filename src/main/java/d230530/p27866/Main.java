package d230530.p27866;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");
        int n = Integer.parseInt(br.readLine());
        System.out.println(s[n - 1]);
    }
}
