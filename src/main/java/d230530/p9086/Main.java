package d230530.p9086;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split("");
            System.out.println(s[0] + s[s.length - 1]);
        }
    }
}
