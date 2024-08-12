package java_middle_quiz.lesson02;

import java.util.Scanner;

/**
 * test_1
 */
public class test_1 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int score_Chinese = Integer.parseInt(myScanner.nextLine());

        boolean is_pass_chinese = (score_Chinese >= 60);

        if (is_pass_chinese)
            System.out.println("通過");
        else
            System.out.println("沒過");
    }
}