package java_middle_quiz.lesson04;

//JPA407 尾端遞迴計算總和
//(1) 請使用尾端遞迴及迴圈撰寫一個類別方法，此方法能夠計算一個數字字串內所有數字的和。
//(2) 程式執行時，顯示【Input a string of numbers: 】要求輸入數字字串。
//(3) 連續執行兩次，如執行結果參考畫面，列出以「尾端遞迴」及「迴圈」計算後之數字總和。
//---------------------------------------------------------------------------------
// Input a string of numbers: 1234
// 尾端遞迴：10
// 迴圈：10
// Input a string of number((s: 3456
// 尾端遞迴：18
// 迴圈：18

//////////////////////////////////////////////////////
import java.util.*;

//////////////////////////////////////////////////////
public class quiz04_07 {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        test();
        test();
    }

    public static void test() {
        System.out.print("Input a string of numbers: ");
        String str = myScanner.nextLine();

        System.out.println("尾端遞迴：" + cal_rec(str, 0));
        System.out.println("迴圈：" + cal_for(str, 0));
    }

    //////////////////////////////////////////////////////
    // 尾端遞迴：
    public static int cal_rec(String str, int n) {
        // 如果 空字串
        if (str.equals(""))
            return n;
        else {
            // 提取 str 開頭的 數字(str[0]) -> 數字(Int)
            int n_next = Integer.parseInt(str.substring(0, 1));
            // n += n_next，str[1]後面的，切成.substring(1)遞迴傳入cal_rec
            return cal_rec(str.substring(1), n + n_next);
        }
    }

    // 迴圈：
    public static int cal_for(String str, int n) {
        // Str 轉換 Char Array
        for (char c : str.toCharArray()) {
            // Char 轉換 Int
            n += Character.getNumericValue(c);
        }
        return n;
    }

    //////////////////////////////////////////////////////
}
