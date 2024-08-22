package java_middle_quiz.lesson05;

//JPA501 陣列計算
//(1) 請撰寫一個程式，由鍵盤輸入 10 個整數，並存放到一個陣列。
//(2) 程式執行時，顯示如執行結果參考畫面 (1)，顯示【請輸入10個整數：】並顯示【第1個整數：】，要求輸入第 1 個整數。
//(3) 依序要求輸入第 1 個至第 10 個整數，顯示如執行結果參考畫面 (2)。
//(4) 判斷輸入 10 個整數後，計算陣列中大於 60 有幾個，這些大於 60 的數值總合及平均值，顯示如執行結果參考畫面 (3)。

// 請輸入10個整數：
// 第1個整數：88
// 第2個整數：59
// 第3個整數：66
// 第4個整數：46
// 第5個整數：92
// 第6個整數：74
// 第7個整數：52
// 第8個整數：58
// 第9個整數：69
// 第10個整數：81
// 陣列中大於60的有6個
// 總合為470
// 平均值為	78.33333333333333

//////////////////////////////////////////////////////
import java.util.*;

//////////////////////////////////////////////////////
public class quiz05_01 {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.println("請輸入10個整數：");
        int n = 10;

        // Input 所有整數到 num_list
        int[] num_list = new int[n + 1]; // Array從開始，長度方便使用改成 n+1
        for (int i = 1; i <= n; i++) {
            System.out.print("第" + i + "個整數：");
            num_list[i] = myScanner.nextInt();
        }

        // 做輸出，分開做比較好看~
        int count_60 = 0;
        int sum = 0;

        for (int each : num_list) {
            // 大於60分的，算 total && avg
            if (each >= 60) {
                count_60++;
                sum += each;
            }
        }
        double avg = (double) sum / count_60;

        // OUTPUT
        System.out.println("陣列中大於60的有" + count_60 + "個");
        System.out.println("總合為" + sum);
        System.out.println("平均值為\t" + avg);
    }
}
