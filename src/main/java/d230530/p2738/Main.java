package d230530.p2738;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            int[] newArr = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
            arr1[i] = newArr;
        }

        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            int[] newArr = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
            arr2[i] = newArr;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arr1[i][j] + arr2[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
