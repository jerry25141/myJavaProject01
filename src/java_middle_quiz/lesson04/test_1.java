package java_middle_quiz.lesson04;



//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class test_1 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str = "abcd1234";
        System.out.println("數字="+test(str));
    }
    public static int test(String str) {
        if (str.equals("")) // 如果 空字串(!! java 判定 str 只能用 .equals)
            return 0;
        else {
            System.out.println(str);
            return 1 + test(str.substring(1)); // 遞迴子字串(i從1開始)
        }
    }
}
