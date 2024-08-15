package java_middle_quiz.lesson03;

//JPA306 迴圈次方計算
//(1) 請設計一程式，持續輸入兩個數 m、n，m 與 n 中間以空隔鍵分隔，並以一個類別方法及 while loop
//    計算 m 的 n 次方，直到輸入 m=999 為止。
//(2) 顯示如執行結果參考畫面。
//-------------------------------------------------------------------------------------------
// Input:
// 2 2
// 4
// Input:
// 100 7
// 276447232
// Input:
// 999 10


//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz03_06 {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        test();
        test();
        test();
    }

    public static void test() {
        try {

            System.out.println("Input 2數:(空格分開，enter結束)");
            int a = Integer.parseInt(myScanner.next());
            int b = Integer.parseInt(myScanner.next());

            // 計算直到輸入 m=999 為止
            // 使用test()的好處就是可以return，跳出程式
            if (a >= 999) return;

            // a^b 計算 a的b次方
            int ans = 1;
            for (int i = 1; i <= b; i++) {
                ans *= a;
            }
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println("輸入錯誤!!");
        }
    }
}
