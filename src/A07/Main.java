package A07;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int[] l = new int[n+1];
        int[] r = new int[n+1];
        int[] total = new int[d+2];
        for (int i=1; i <= n; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        Arrays.fill(total,0);
        for (int i=0; i <= d; i++){
           total[i]=0;
        }
        for(int j=1;j<=n;j++){
            total[l[j]]+=1;
            total[r[j]+1]-=1;
        }
        for (int i=1; i <= d; i++) {
            total[i] += total[i-1];
        }
        for (int j=1; j <= d; j++) {
            System.out.println(total[j]);
        }
        sc.close();
    }
}