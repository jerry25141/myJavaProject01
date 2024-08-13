package java_middle_quiz.lesson05;

//JPA502 浮點數計算
//(1) 請撰寫一個程式，由鍵盤輸入學生的人數，根據所輸入的學生人數，動態產生一個符合大小的浮點數陣列。
//(2) 將所輸入的每位學生成績存放到陣列裡(不限制輸入的小數點位數)。
//(3) 程式執行時，顯示【請輸入學生人數：】，要求輸入學生人數。
//(4) 接續要求輸入第 1 個至第 n 個學生的成績，n 是剛才所輸入的學生人數。
//(5) 計算出人數、總分及平均值 (不限制小數點位數)，顯示如執行結果參考畫面 (3)。
//    提示：此題需使用 float 撰寫程式。
//--------------------------------------------------------------------------------------------
// 請輸入學生人數：5
// 第1個學生的成績：81.24
// 第2個學生的成績：56.14
// 第3個學生的成績：92.84
// 第4個學生的成績：42.96
// 第5個學生的成績：64.37
// 人數：5
// 總分：337.55
// 平均：67.509995

// import java.util.*;

// public class JPA502a {
//     public static Scanner sc = new Scanner(System.in);
//     public static void main(String args[]) {
//         int n;
//         System.out.print("請輸入學生人數：");
//         n = sc.nextInt();
//         float sum = 0, count[] = new float[n];
//         for (int i = 0; i < n; i++) {
//             System.out.printf("第%d個學生的成績：", i + 1);
//             count[i] = sc.nextFloat();
//             sum += count[i];
//         }
//         System.out.printf("人數：%d%n總分：%.2f%n平均：%f%n", n, sum, sum / n);
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz05_2 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}
