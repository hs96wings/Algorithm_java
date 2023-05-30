package d230530.p1546;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        double[] scores = Arrays.stream(s).mapToDouble(Double::parseDouble).toArray();
        double M = DoubleStream.of(scores).max().getAsDouble();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += scores[i] / M * 100;
        }
        System.out.println(sum / n);
    }
}
