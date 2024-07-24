package A08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] x = new int[h+1][w+1];
        int[][] sum = new int[h+1][w+1];
        sum[0][0] = 0;
        for (int i=1; i <= h; i++) {
            for (int j=1; j <= w; j++) {
                x[i][j] = sc.nextInt();
                sum[i][j] = x[i][j] + sum[i][j-1];
            }
        }
        for (int j=1; j <= w; j++) {
            for (int i=2; i <= h; i++) {
                sum[i][j] = sum[i-1][j] + sum[i][j];
            }
        }
        int q = sc.nextInt();
        for (int k=1; k <= q; k++) {
            int a =sc.nextInt();
            int b =sc.nextInt();
            int c =sc.nextInt();
            int d =sc.nextInt();
            int answer = sum[a-1][b-1] + sum[c][d] - sum[c][b-1] - sum[a-1][d];
            System.out.println(answer);
        }
        sc.close();
    }
}