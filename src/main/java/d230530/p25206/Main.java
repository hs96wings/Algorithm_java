package d230530.p25206;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sumScore = 0; // 학점 x 과목평점
        double score = 0; // 학점 총합
        for (int i = 0; i < 20; i++) {
            String[] s = br.readLine().split(" ");
            double sc = Double.parseDouble(s[1]);
            if (!s[2].equals("P"))
                score += sc;

            switch (s[2]) {
                case "A+" -> sumScore += sc * 4.5;
                case "A0" -> sumScore += sc * 4.0;
                case "B+" -> sumScore += sc * 3.5;
                case "B0" -> sumScore += sc * 3.0;
                case "C+" -> sumScore += sc * 2.5;
                case "C0" -> sumScore += sc * 2.0;
                case "D+" -> sumScore += sc * 1.5;
                case "D0" -> sumScore += sc;
                case "F" -> sumScore += 0;
            }
        }
        System.out.printf("%.6f", sumScore / score);
    }
}
