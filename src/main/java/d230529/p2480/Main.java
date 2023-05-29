package d230529.p2480;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        if (a == b && b == c)
            System.out.println(10000 + a * 1000);
        else if (a == b || b == c)
            System.out.println(1000 + b * 100);
        else if (a == c)
            System.out.println(1000 + a * 100);
        else
            System.out.println(Math.max(Math.max(a, b), c) * 100);
    }
}
