package java_middle_quiz.lesson04;

//JPA409 遞迴字串移除
//(1) 請使用遞迴撰寫一個類別方法，此方法能夠將一個字串內的某個字元移除。
//(2) 程式執行時，顯示【Input a string: 】要求輸入字串。
//(3) 輸入完畢，顯示【Input a character: 】要求輸入「欲移除」的字元。
//(4) 連續執行兩次，顯示如執行結果參考畫面，將字元從字串中移除。

// Input a string: java se8
// Input a character: a
// jv se8
// Input a string: computer
// Input a character: p
// comuter

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz04_09 {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        test();
        test();
    }

    public static void test() {
        System.out.print("Input a string: ");
        String str_org = myScanner.nextLine();
        System.out.print("Input a character: ");
        String str_rm = myScanner.nextLine();

        // 使用 .replace 至換成 ""，用於移除
        String str_new = str_org.replace(str_rm, "");
        System.out.println(str_new);
    }
}
