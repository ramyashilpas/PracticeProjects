package java.Arrays;

import java.util.Scanner;

public class LeftRotationEasyLevel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();/*No.of Integers in the array*/
        int d=sc.nextInt();/*No.of left rotations to perform*/
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[(i+n-d)%n]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
