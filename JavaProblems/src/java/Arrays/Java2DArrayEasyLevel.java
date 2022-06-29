package java.Arrays;

import java.util.Scanner;

public class Java2DArrayEasyLevel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr =new int[6][6];
        for(int row=0;row<6;row++){
            for(int col=0;col<6;col++){
                arr[row][col]=sc.nextInt();
            }
        }
        System.out.println(solve(arr));
    }

     static int solve(int[][] arr) {
        int max=Integer.MIN_VALUE;
        int total=0;
        for(int row=0;row<4;row++){
             for(int col=0;col<4;col++){
                 total=arr[row][col]+arr[row][col+1]+arr[row][col+2];
                 total+=arr[row+1][col+1];
                 total+=arr[row+2][col]+arr[row+2][col+1]+arr[row+2][col+2];
                 max=total>max?total:max;
             }
        }
       return max;
    }

}
