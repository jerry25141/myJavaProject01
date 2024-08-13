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

// import java.util.*;

// public class JPA307a {
//     public static void main(String argv[]) {
//         int num1, num2;
//         System.out.println("Input:");
//         num1 = new Scanner(System.in).nextInt();
//         while (num1 != 999) {
//             num2 = new Scanner(System.in).nextInt();
//             System.out.println(gcd(num1, num2));
//             System.out.println("Input:");
//             num1 = new Scanner(System.in).nextInt();
//         }
//     }
//     static int gcd(int m, int n) {
//         int result;
//         while (n != 0) {
//             result = m % n;
//             m = n;
//             n = result;
//         }
//         return m;
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz03_7 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}
