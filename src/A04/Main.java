package A04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder binaryString = new StringBuilder();
        for (int i=9; i>=0;i--){
             int x = (int)Math.pow(2,i);
             int out = (num/x)%2;
             binaryString.append(out);
        }
        System.out.print(new String(binaryString));
    }
}