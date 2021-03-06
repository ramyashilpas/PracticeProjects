package java.StringTopic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMediumProblem11 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            Pattern p= Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m= p.matcher(line);
            boolean matchFound = false;
            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if ( ! matchFound) {
                System.out.println("None");
            }
            testCases--;
        }
    }
}
