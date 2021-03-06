package java.StringTopic;

import java.util.Scanner;

class UsernameValidator {
    /*
     * Write regular expression here.
     */

    public static final String regularExpression = "[a-zA-Z](\\w){7,29}";
}
public class StringEasyProblem10 {
        private static final Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
            int n = Integer.parseInt(scan.nextLine());
            while (n-- != 0) {
                String userName = scan.nextLine();

                    if (userName.matches(UsernameValidator.regularExpression)&&(userName.length()>=8&&userName.length()<=30)) {
                        System.out.println("Valid");
                    }
                else {
                        System.out.println("Invalid");
                    }
            }
        }
    }

