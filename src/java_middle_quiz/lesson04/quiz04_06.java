package java_middle_quiz.lesson04;

//JPA406 遞迴字串計算
//(1) 請使用遞迴撰寫一個類別方法，可計算一個字串內有幾個 A，大小寫有所區別。
//(2) 程式執行時，顯示【Input a string: 】要求輸入字串。
//(3) 連續執行兩次，如執行結果參考畫面，顯示【輸入的字串 has X As】。
//    將計算此字串內有幾個 A，代入 X 中。
//-------------------------------------------------------------------------------------
// Input a string: COMPUTER SKILLS FOUNDATION
// COMPUTER SKILLS FOUNDATION has 1 As
// Input a string: java
// java has 0 As

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz04_06 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }

    public static void test() {
        System.out.println("Input a string: ");
        String in_str = myScanner.nextLine();

        // 
        int x = 0;
        x = countA(in_str);

        System.out.println(in_str + " has " + x + " A(個)s");
    }
//////////////////////////////////////////////////////
    public static int countA(String str) {
        if (str.equals("")) // 如果 空字串(!! java 判定 str 只能用 .equals)
            return 0;
        // 如果 子字串第1個符號 == "A"
        else if (str.substring(0, 1).equals("A"))
            return 1 + countA(str.substring(1)); // 回傳 1 + 遞迴子字串(i從1開始)
        else
            return countA(str.substring(1)); // 遞迴子字串(i從1開始)
    }
//////////////////////////////////////////////////////
}
