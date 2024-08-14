package java_middle_quiz.lesson04;

//JPA402 尾端遞迴階乘計算
//(1) 尾端遞迴程式設計的特性是以另外傳入的參數來累計遞迴的答案。
//(2) 請寫一個程式持續輸入一個數 n，請個別使用尾端遞迴程式設計及迴圈，計算 n 的階乘，直到 n 輸入的數值是 999 為止。
//(3) 程式執行時，顯示【Input n (0 <= n <= 16):】要求輸入數值。
//(4) 顯示如執行結果參考畫面。
//-----------------------------------------------------------------------------------------
// Input n (0 <= n <= 16):6
// 6 的階層(尾端遞迴) = 720
// 6 的階層(迴圈) = 720
// Input n (0 <= n <= 16):8
// 8 的階層(尾端遞迴) = 40320
// 8 的階層(迴圈) = 40320
// Input n (0 <= n <= 16):999

// import java.util.*;

// public class JPA402a {
//     static Scanner keyboard = new Scanner(System.in);
//     public static void main(String args[]) {
//         int n, sum = 1;
//         System.out.printf("Input n (0 <= n <= 16):");
//         n = keyboard.nextInt();
//         while (n != 999) {
//             System.out.println(n + " 的階層(尾端遞迴) = " + backfactorial(n, sum));
//             System.out.println(n + " 的階層(迴圈) = " + loop(n));
//             System.out.printf("Input n (0 <= n <= 16):");
//             n = keyboard.nextInt();
//         }
//     }
//     static int loop(int n) {
//         int sum = 1, i;
//         for (i = 1; i <= n; i++) {
//             sum *= i;
//         }
//         return sum;
//     }
//     static int backfactorial(int n, int sum) {
//         if (n == 1)
//             return sum;
//         else
//             return backfactorial(n - 1, n * sum);
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz04_02 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}
