package d230530.p10988;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        StringBuffer sb = new StringBuffer(s);
        String newS = sb.reverse().toString();
        if (s.equals(newS))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
