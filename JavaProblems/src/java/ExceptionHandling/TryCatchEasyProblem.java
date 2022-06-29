package java.ExceptionHandling;

import java.util.*;


public class TryCatchEasyProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int result = Math.floorDiv(x, y);
            System.out.println(result);
        }
        catch (Exception ex){

            if(ex.getClass().getName().equals("java.lang.ArithmeticException")){
                System.out.println("java.lang.ArithmeticException: / by zero");
            }
            else{
                System.out.println(ex.getClass().getName());
            }
        }

    }
}
