package java_middle_quiz.lesson03;

//JPA310 迴圈正偶數相加
//(1) 程式執行時，畫面顯示【請輸入 n 的值(n > 0，且為偶數)：】，請使用者輸入一個正偶數。
//(2) 試利用 do-while，計算 2 + 4 + 6 + … + n 的總和，其中 n 為一由鍵盤輸入的正偶數，
//    若輸入的不是正偶數，則程式會要求使用者再次輸入，直到輸入的數是正偶數為止。
//(3) 計算 2 + 4 + 6 + … + n 的總和，顯示如執行結果參考畫面 (2)。
//------------------------------------------------------------------------------------
// 請輸入 n 的值(n > 0，且為偶數)：3
// 請輸入 n 的值(n > 0，且為偶數)：-2
// 請輸入 n 的值(n > 0，且為偶數)：10
// 2+4+...+10=30

// import java.util.*;

// public class JPA310a {
//     static Scanner keyboard = new Scanner(System.in);
//     public static void main(String[] args) {
//         int i = 0;
//         int n = 0;
//         int total = 0;
//         do {
//             System.out.printf("請輸入 n 的值(n > 0，且為偶數)：");
//             n = keyboard.nextInt();
//             if (n > 0 && n % 2 == 0) {
//                 do {
//                     i += 2;
//                     total += i;
//                 } while (i < n);
//                 System.out.printf("2+4+...+%d=%d", n, total);
//             }
//         } while (!(n > 0 && n % 2 == 0));
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz03_10 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}
