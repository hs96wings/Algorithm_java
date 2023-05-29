package d230529.p1008;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        double a = Double.parseDouble(s[0]);
        double b = Double.parseDouble(s[1]);
        System.out.println(a / b);
    }
}
