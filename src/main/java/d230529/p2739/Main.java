package d230529.p2739;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        IntStream.range(1, 10).forEach(i -> System.out.println(n + " * " + i + " = " + (n * i)));
    }
}
