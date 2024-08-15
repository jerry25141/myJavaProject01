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

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz03_05 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
    }

    public static void test() {
        try {
            System.out.println("Please enter one value:");
            int n = myScanner.nextInt();

            // 計算 n!
            if(n <= 10 && n >= 1) {
                int ans = 1;
                for (int i = 1; i <= n; i++) 
                    ans *= i;
                System.out.println(n + "!: " + ans);
            }
            else {
                // 範圍錯誤
                System.out.println("Error, the value is out of range.");
            }

        } catch (Exception e) {
            System.out.println("輸入錯誤");
        }
    }
}
