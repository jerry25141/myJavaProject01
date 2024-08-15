package java_middle_quiz.lesson03;

//JPA309 迴圈倍數判斷
//(1) 如下為 continue 之範例寫法。
// class Ex {
//     public static void main(String argv[]) throws IOException {
//         for (int i=0; i<4; i++) {
//             if(i == 2) {
//             continue;
//             }
//             System.out.println("i = " + i);
//         }
//     }
// }
// Output：
//     i = 0
//     i = 1
//     i = 3
//(2) 請用 continue 設計一個程式，能夠計算 1 到「使用者輸入的數」之中
// ，那些數是 3 的倍數或是 5 的倍數，而不是 7 的倍數。
//(3) 將這些數值相加後輸出，顯示如執行結果參考畫面。
//--------------------------------------------------------------------------------------------
// Input：
// 2
// Answer: 0
// Input：
// 5
// Answer: 8
// Input：
// 13
// Answer: 45
// Input：
// 3
// Answer: 3

//////////////////////////////////////////////////////
import java.util.*;

//////////////////////////////////////////////////////
public class quiz03_09 {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String argv[]) {
        test();
        test();
        test();
        test();
    }
    
    public static void test() {
        System.out.println("Input：");
        int sum = 0, n = myScanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0) // 被7整除，continue跳過for
                continue;
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }

        System.out.println("Answer: " + sum);
    }
}
