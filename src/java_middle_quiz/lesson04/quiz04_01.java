package java_middle_quiz.lesson04;

//JPA401 遞迴階乘計算
//(1) 請寫一個程式持續輸入一個數 n，使用遞迴計算 n 的階乘，直到 n 輸入的數值是 999 為止。
//(2) 程式執行時，顯示【Input n (0 <= n <= 16):】要求輸入數值。
//(3) 顯示如執行結果參考畫面。
//--------------------------------------------------------------------------------------
// Input n (0 <= n <= 16):6
// 6 的階層 = 720
// Input n (0 <= n <= 16):10
// 10 的階層 = 3628800
// Input n (0 <= n <= 16):999

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz04_01 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
    }

    public static void test() {
        System.out.print("Input n (0 <= n <= 16):");
        int n = myScanner.nextInt();

        // 999 跳出 + 0 <= n <= 16
        if(n == 999)
            return;
        if(0 <= n && n <= 16) {
            int total = 1;
            for (int i = n; i >= 1; i--)
                total *= i;
    
            System.out.println(n + " 的階層 = " + total);
        }
        else 
            return;
    }
}
