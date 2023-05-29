package d230529.p2884;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int h = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        if (m < 45) {
            m += 15;
            h -= 1;
        } else {
            m -= 45;
        }

        if (h == -1)
            h = 23;
        System.out.println(h + " " + m);
    }
}
