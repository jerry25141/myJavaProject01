package java_middle_quiz.lesson02;

import java.util.Scanner;

/**
 * test_1
 */
public class test_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        String result = num + "是";
        if (num % 2 == 0) {
            result += "2";
        }
        if (num % 3 == 0) {
            result += (result.endsWith("2") ? "," : "") + "3";
        }
        if (num % 2 == 0 && num % 3 == 0) {
            result += ",6";
        } else {
            result = num + "不是2、3、6的倍數";
        }

        System.out.println(result);
        scanner.close();
    }
}