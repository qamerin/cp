package A06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] l = new int[q];
        int[] r = new int[q];
        int[] a = new int[n+1];
        int[] sum = new int[n+1];
        for (int i=1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0; i < q; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        sum[0]=0;
        sum[1]=a[1];
        for (int i=2; i <= n; i++) {
            sum[i] = sum[i-1]+ a[i];
        }
        for(int i = 0; i < q; i ++) {
            int ans = sum[r[i]] - sum[l[i]-1];
            System.out.println(ans);
        }
    }
}