package java_middle_quiz.lesson04;

//JPA403 尾端遞迴次方計算
//(1) 請寫一個程式持續輸入兩個數 m、n，使用尾端遞迴及迴圈計算 m 的 n 次方，直到 m 輸入的數值是 999 為止。
//(2) 程式執行時，顯示【Input m:】要求輸入m；輸入完畢。於下行顯示【Input n:】要求輸入 n。
//(3) 顯示如執行結果參考畫面。
//---------------------------------------------------------------------------------
// Input m:3
// Input n:6
// Ans(尾端遞迴) = 729
// Ans(迴圈) = 729
// Input m:12
// Input n:3
// Ans(尾端遞迴) = 1728
// Ans(迴圈) = 1728
// Input m:999

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz04_03 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }

    public static void test() {
        System.out.print("Input n (0 <= n <= 16):");
        int m = myScanner.nextInt();
        // 999 跳出 + 0 <= n <= 16
        if (m == 999)
            return;
        int n = myScanner.nextInt();

        if (0 <= m && m <= 16) {
            int total1 = 1;
            int total2 = 1;


            // 呼叫 (尾端遞迴)
            total1 = run_loop(m, n);

            // 呼叫 (尾端遞迴)
            total1 = run_loop(m, n);

            System.out.println(m + " 的階層 = " + total1);
        } else
            return;
    }

//////////////////////////////////////////////////////
    // !! 尾端遞迴 !! //
    static int run_backfactorial(int m, int n, int sum) {
        if (n == 1)
            return m * sum;
        else
            return run_backfactorial(m, n - 1, m * sum);
    }

//////////////////////////////////////////////////////
    // !! for 迴圈方法 !! //
    static int run_loop(int m, int n) {
        int sum = 1, i;
        for (i = 1; i <= n; i++)
            sum *= m;
        return sum;
    }
//////////////////////////////////////////////////////

}
