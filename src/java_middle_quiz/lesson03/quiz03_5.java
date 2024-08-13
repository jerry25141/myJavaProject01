package java_middle_quiz.lesson03;

//JPA305 迴圈階乘計算
//(1) 請設計一程式計算 n 的階乘。
//(2) n 為使用者任意輸入的整數值，n 值範圍介於 1 到 10 之間。
//(3) 程式執行時，畫面顯示【Please enter one value:】，首先判斷 n 值是否介於 1 到 10 之間，
//    若檢核通過，則輸出階乘計算後之數值；若沒有介於 1 到 10 之間，則顯示【Error, the value is out of range.】。
//(4) 重複執行三次，顯示如執行結果參考畫面。
//----------------------------------------------------------------------------------------
// Please enter value:
// 0
// Error, the value is out of range.
// Please enter value:
// 12
// Error, the value is out of range.
// Please enter value:
// 6
// 6!: 720

// import java.util.*;

// public class JPA305a {
//     static Scanner keyboard = new Scanner(System.in);
//     public static void main(String[] args) {
//         test();
//         test();
//         test();
//     }
//     public static void test() {
//         System.out.println("Please enter value:");
//         int i, total = 1, n = keyboard.nextInt();
//         if (n >= 1 && n <= 10) {
//             for (i = 1; i <= n; i++) {
//                 total = total * i;
//             }
//             System.out.printf("%d!: %d", n, total);
//             System.out.println();
//         } else
//             System.out.println("Error, the value is out of range.");
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz03_5 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}
