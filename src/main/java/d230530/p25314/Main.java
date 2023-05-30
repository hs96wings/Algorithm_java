package d230530.p25314;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, n / 4).forEach(i -> sb.append("long "));
        System.out.println(sb.toString() + "int");
    }
}
