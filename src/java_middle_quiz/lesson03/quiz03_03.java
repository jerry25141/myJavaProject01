package java_middle_quiz.lesson03;

//JPA303 完美數
//(1) 一個數如果恰好等於它的因數 (不含數字本身) 之和，這個數就稱為「完美數」。
//(2) 例如 6 = 1 + 2 + 3，因 1、2 與 3 都是 6 的因數，因而 6 是完美數。
//(3) 請設計一程式，找出 1000 以內的所有完美數。
//(4) 顯示如執行結果參考畫面。
//----------------------------------------------------------------------------------

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz03_03 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num, sum = 0;
        
        System.out.print("1~1000中的完美數有: ");
        // i 代表進行中的數字 1~1000
        for (int i = 1; i < 1000; i++) {
            sum = 0;    // 初始化 計算相加
            for (num = 1; num < i; num++) {
                // num整除代表 因數
                if (i % num == 0)
                    sum += num;
            }
            // 如果 數字i = 因數相加sum
            if (i == sum) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
    }
}
