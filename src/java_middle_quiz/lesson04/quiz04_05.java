package java_middle_quiz.lesson04;

//JPA405 遞迴函數
//(1) 請利用下面的公式，撰寫遞迴函數 sum2：
//    a. sum2(1) = 2
//    b. sum2(n) = sum2(n – 1) + 2 * n
//(2) 程式執行時，顯示【Input the number n:】要求輸入 n (n >= 1)，並將 n 值代入函數中。
//(3) 顯示如執行結果參考畫面。
//------------------------------------------------------------------------------------
// Input the number n: 50
// Ans: 2550

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz04_05 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        System.out.print("Input the number n: ");
        int n = myScanner.nextInt();

        if (n >= 1) {
            int total = 1;
            // 呼叫 遞迴
            total = run_SUM2(n);
            System.out.println("Ans: " + total);
        } else
            return;
    }
/////////////////////////////////////////////////////
    // !! 遞迴函數 sum2(n) = sum2(n – 1) + 2 * n //
    public static int run_SUM2(int n) {
        if (n == 1) {
            return 2;
        } else {
            return run_SUM2(n - 1) + 2 * n;
        }
    }
/////////////////////////////////////////////////////
}
