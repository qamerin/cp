package A05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numN = sc.nextInt();
        int numK = sc.nextInt();
        int answer = 0 ;
        for (int x=1; x <= numN; x++){
            for (int y=1; y <= numN; y++){
                int numZ = numK -(x+y);
                if(numZ >= 1 && numZ <= numN){
                    answer++;
                }
            }
        }
        System.out.print(answer);
    }
}