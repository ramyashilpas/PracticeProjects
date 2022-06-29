package java.AdvancedJava;
import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.*;
class Prime {
    public void checkPrime(int... n) {
       int count;
        for (int i:n) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if ((i % j) == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i>1) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
public class JavaPrimeCheckerMediumProblem {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
