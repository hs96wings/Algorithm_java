package d230529.p11382;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        long a = Long.parseLong(s[0]);
        long b = Long.parseLong(s[1]);
        long c = Long.parseLong(s[2]);

        System.out.println(a + b + c);
    }
}
