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

// import java.util.*;

// public class JPA404a {
//     static Scanner keyboard = new Scanner(System.in);
//     public static void main(String args[]) {
//         int m, n, sum = 1;
//         System.out.printf("Input m:");
//         m = keyboard.nextInt();
//         while (m != 999) {
//             System.out.printf("Input n:");
//             n = keyboard.nextInt();
//             System.out.println("最大公因數為 = " + factorial(m, n));
//             System.out.printf("Input m:");
//             m = keyboard.nextInt();
//         }
//     }
//     static int factorial(int m, int n) {
//         if (n == 0)
//             return m;
//         else
//             return factorial(n, m % n);
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz04_4 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}
