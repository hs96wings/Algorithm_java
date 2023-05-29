package d230529.p2525;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(br.readLine());

        a += c / 60;
        b += c % 60;
        a += b / 60;
        b %= 60;
        a %= 24;
        System.out.println(a + " " + b);
    }
}
