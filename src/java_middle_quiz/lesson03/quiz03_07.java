package java_middle_quiz.lesson03;

//JPA307 迴圈最大公因數
//(1) 請設計一程式，持續輸入兩個數 m、n，m 與 n 中間以空隔鍵分隔，並以一個類別方法及 while loop 
//    計算 m 與 n 的最大公因數，直到輸入 m=999 為止。
//(2) 持續輸入兩個數 m、n，顯示如執行結果參考畫面，於下方輸出此兩數的最大公因數。
//-------------------------------------------------------------------------------
// Input:
// 8
// 12
// 4
// Input:
// 13
// 19
// 1
// Input:
// 7
// 49
// 7
// Input:
// 999

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz03_07 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        while (true) {
            try {
                System.out.println("Input 2數:(空格分開，enter結束,999跳出)");
                int a = Integer.parseInt(myScanner.next());
                // a >= 999 跳出 while(true) 無限迴圈
                if (a >= 999) break;

                int b = Integer.parseInt(myScanner.next());
                //////////////////
                // 最大公因數， 最大同時可整除 a 和 b 的數字
                int ans = gcd(a, b);

                System.out.println(ans);

            } catch (Exception e) {
                System.out.println("輸入錯誤!!");
            }
        }
    }
    // 最大公因數 //
    public static int gcd(int a, int b) {
        int result;
        if (a < b) { // 保證 a > b
            int t = a;
            a = b;
            b = t;
        }
        // 輾轉相除?
        while (b != 0) {
            result = a % b;
            a = b;
            b = result;
        }
        return a;
    }
}
