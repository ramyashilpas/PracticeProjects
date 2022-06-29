package java.AdvancedJava;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        MessageDigest md=MessageDigest.getInstance("MD5");
        md.update(s.getBytes(),0,s.length());
        System.out.println(new BigInteger(1,md.digest()).toString(16));

    }
}
