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

// import java.util.*;

// public class JPA403a {
//     static Scanner keyboard = new Scanner(System.in);
//     public static void main(String args[]) {
//         int m, n, sum = 1;
//         System.out.printf("Input m:");
//         m = keyboard.nextInt();
//         while (m != 999) {
//             System.out.printf("Input n:");
//             n = keyboard.nextInt();
//             System.out.println("Ans(尾端遞迴) = " + backfactorial(m, n, sum));
//             System.out.println("Ans(迴圈) = " + loop(m, n));
//             System.out.printf("Input m:");
//             m = keyboard.nextInt();
//         }
//     }
//     static int loop(int m, int n) {
//         int sum = 1, i;
//         for (i = 1; i <= n; i++) {
//             sum *= m;
//         }
//         return sum;
//     }
//     static int backfactorial(int m, int n, int sum) {
//         if (n == 1)
//             return m * sum;
//         else
//             return backfactorial(m, n - 1, m * sum);
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz04_03 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}
