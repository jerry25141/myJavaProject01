package java_middle_quiz.lesson03;

//JPA301 整數連加
//(1) 請使用 for loop 撰寫程式，輸入一個正整數 N，計算 1 + 2 + 3 + … + N 的結果。
//(2) 程式執行時，顯示【Input:】要求輸入一個正整數，輸入完畢，於下方計算 1 + … + N 的總和。
//(3) 顯示如執行結果參考畫面。
//-----------------------------------------------------------------------------------
// Input:
// 88
// 1 + ... + 88 = 3916

// import java.util.*;

// public class JPA301a {
//     public static void main(String argv[]) {
//         System.out.println("Input:");
//         int m = 0, n = new Scanner(System.in).nextInt();
//         for (int i = 1; i <= n; i++) {
//             m = m + i;
//         }
//         System.out.println("1 + ... + " + n + " = " + m);
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz03_01 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Input N:");
        int N = myScanner.nextInt();

        // 定義 count，使用for累加
        int count = 0;
        for (int i = 1; i < N+1; i++) {
            count = count + i;
        }

        System.out.println("1 + ... + " + N + " = " + count);
    }
}
