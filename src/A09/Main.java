package A09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[n];
        int[][] x = new int[h+2][w+2];
        int[][] sum = new int[h+2][w+2];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            x[a[i]][b[i]]++;
            x[c[i]+1][b[i]]--;
            x[a[i]][d[i]+1]--;
            x[c[i]+1][d[i]+1]++;
        }

        for (int i=1; i <= h; i++) {
            for (int j=1; j <= w; j++) {
                    sum[i][j] =sum[i][j-1] + x[i][j];
            }
        }
        for(int i = 1; i <= h; i ++) {
            for(int j = 1; j <= w; j ++) {
                sum[i][j] = sum[i-1][j] + sum[i][j];
            }
        }
        for(int i = 1; i <= h; i ++) {
            for(int j = 1; j <= w; j ++) {
                if(j == w) {
                    System.out.println(sum[i][j]);
                } else {
                    System.out.print(sum[i][j] + " ");
                }
            }
        }
        sc.close();
    }
}