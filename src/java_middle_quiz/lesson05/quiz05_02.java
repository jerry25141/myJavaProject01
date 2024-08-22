package java_middle_quiz.lesson05;

//JPA502 浮點數計算
//(1) 請撰寫一個程式，由鍵盤輸入學生的人數，根據所輸入的學生人數，動態產生一個符合大小的浮點數陣列。
//(2) 將所輸入的每位學生成績存放到陣列裡(不限制輸入的小數點位數)。
//(3) 程式執行時，顯示【請輸入學生人數：】，要求輸入學生人數。
//(4) 接續要求輸入第 1 個至第 n 個學生的成績，n 是剛才所輸入的學生人數。
//(5) 計算出人數、總分及平均值 (不限制小數點位數)，顯示如執行結果參考畫面 (3)。
//    提示：此題需使用 float 撰寫程式。

// 請輸入學生人數：5
// 第1個學生的成績：81.24
// 第2個學生的成績：56.14
// 第3個學生的成績：92.84
// 第4個學生的成績：42.96
// 第5個學生的成績：64.37
// 人數：5
// 總分：337.55
// 平均：67.509995

//////////////////////////////////////////////////////
import java.util.*;

//////////////////////////////////////////////////////
public class quiz05_02 {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        // INPUT 成績 + 計算
        System.out.print("請輸入學生人數：");
        int n = myScanner.nextInt();

        float total = 0;
        float avg = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("第" + i + "個學生的成績：");
            total += myScanner.nextFloat();
            avg = total / (float) n;
        }
        // OUTPUT
        System.out.println("人數：" + n);
        System.out.println("總分：" + total);
        System.out.println("平均：" + avg);
    }
}
