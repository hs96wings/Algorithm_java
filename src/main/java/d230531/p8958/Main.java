package d230531.p8958;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s;
        int score, addScore;

        for (int i = 0; i < n; i++) {
            s = br.readLine().split("");
            score = 0;
            addScore = 1;

            if (s[0].equals("O")) {
                score += addScore;
                addScore++;
            }

            for (int j = 1; j < s.length; j++) {
                if (s[j].equals("O")) {
                    score += addScore;
                    addScore++;
                } else {
                    addScore = 1;
                }
            }
            System.out.println(score);
        }
    }
}
