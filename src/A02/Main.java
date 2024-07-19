package A02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elmCount = sc.nextInt();
        int numX = sc.nextInt();
        int[] nums = new int[elmCount];
        boolean foundFlag = false;

        for (int i=0;i<elmCount;i++ ){
            nums[i]=sc.nextInt();
        }
        for (int num : nums ){
            if(num == numX){
                foundFlag = true;
            }
        }
        if(foundFlag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}