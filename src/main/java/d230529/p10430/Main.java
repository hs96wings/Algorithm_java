package d230529.p10430;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }
}
