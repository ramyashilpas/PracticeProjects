package java.DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class JavaDequeMediumProblem12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set=new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
             set.add(num);


             if(deque.size()==m){
                   if(set.size()>max)
                       max= set.size();
                   int first=deque.remove();
                   if(!deque.contains(first))
                       set.remove(first);
             }
        }
        System.out.println(max);
    }
}
