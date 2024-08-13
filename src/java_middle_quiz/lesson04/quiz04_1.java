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

// import java.util.Scanner;

// public class JPA04 {
//     static Scanner keyboard = new Scanner(System.in);
//     public static void main(String args[]) {
//         int n;
        
//         do {
//             System.out.print("Input n (0 <= n <= 16):");
//             n = keyboard.nextInt();
            
//             if(n >= 0 && n <= 16) 
//                 System.out.printf("%d 的階乘 = %d\n", n,factorial(n));
//         } while(n != 999);
//     }
    
//     static int factorial(int n) {
//         if(n == 1)
//             return 1;
//         else
//             return n * factorial(n - 1);
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz04_1 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}
