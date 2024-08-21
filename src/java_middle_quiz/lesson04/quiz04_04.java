package java_middle_quiz.lesson04;

//JPA404 遞迴最大公因數
//(1) 請設計一個程式，持續輸入兩個數 m、n，使用遞迴計算 m 與 n 的最大公因數，直到 m 輸入的數值是 999 為止。
//(2) 程式執行時，顯示【Input m: 】要求輸入m；輸入完畢。於下行顯示【Input n: 】要求輸入 n。
//(3) 計算最大公因數，顯示如執行結果參考畫面。
//------------------------------------------------------------------------------------
// Input m:7
// Input n:49
// 最大公因數為 = 7
// Input m:64
// Input n:128
// 最大公因數為 = 64
// Input m:15
// Input n:10
// 最大公因數為 = 5
// Input m:999

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz04_04 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
    }

    public static void test() {
        System.out.print("Input m:");
        int m = myScanner.nextInt();
        // 999 跳出 + 0 <= n <= 16
        if (m == 999)
            return;
        System.out.print("Input n:");
        int n = myScanner.nextInt();

        int ans_GCD = 1;
        // 呼叫 (尾端遞迴)
        ans_GCD = run_back_GCD(m, n);
        System.out.println(m + "^" + n + " 的Ans(尾端遞迴) = " + ans_GCD);
    }
//////////////////////////////////////////////////////
    // !! 尾端遞迴 進階 !! //
    static int run_back_GCD(int m, int n) {
        if (n == 0) // 當餘數 == 0
            return m;
        else    // !! 重點(輾轉相除法) !! // 相除取餘數，再用餘數除以
            return run_back_GCD(n, m % n);
    }

//////////////////////////////////////////////////////
}
