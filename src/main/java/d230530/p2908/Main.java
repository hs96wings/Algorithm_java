package d230530.p2908;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        StringBuffer sb = new StringBuffer(s[0]);
        int a = Integer.parseInt(sb.reverse().toString());
        sb = new StringBuffer(s[1]);
        int b = Integer.parseInt(sb.reverse().toString());
        System.out.println(Math.max(a, b));
    }
}
