package d230531.p2742;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        IntStream.rangeClosed(1, n).map(i -> n + 1 - i).forEach(System.out::println);
    }
}
