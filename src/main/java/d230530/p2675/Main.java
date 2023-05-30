package d230530.p2675;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] tmp;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            tmp = br.readLine().split(" ");
            int r = Integer.parseInt(tmp[0]);
            String[] s = tmp[1].split("");
            for (int j = 0; j < s.length; j++) {
                sb.append(s[j].repeat(r));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
