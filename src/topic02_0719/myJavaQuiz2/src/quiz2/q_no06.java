/* 
    設計一個陣列可以儲存10 個學生的數學成績，
    程式還必須包含將成績由小至大列印出來，
    並計算出「及格」與「不及格」的人數。
 */

package topic02_0719.myJavaQuiz2.src.quiz2;

////////////////////////////////////////////////////
import java.util.Scanner;
////////////////////////////////////////////////////

public class q_no06 {
    public static void run_question() {
        System.out.println("\n#=====================#");
        System.out.println("【Question06】由小至大列印，並計算出「及格」與「不及格」的人數");
        ////////////////////////////////////////////////////
        Scanner myScanner = new Scanner(System.in);

        // input 成績
        int n = 10;
        System.out.println("請輸入" + n + "位學生成績(enter輸入):");
        int[] scores = new int[n]; // 建立 int[n] array
        for (int i = 0; i < n; i++)
            scores[i] = myScanner.nextInt();

        // Bubble Sort 氣泡排序法
        n = scores.length;
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                // scores[j] > scores[j+1] 是從小排到大的關鍵
                if (scores[j] > scores[j + 1]) {
                    temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }

        // 印出 成績串
        System.out.println("scores(由小到大):");
        for (int i = 0; i < n; i++)
            System.out.print(scores[i] + ",");
        System.out.println();

        ////////////////////////////////////////////
        // 計算 及格 不及格 人數
        int is_pass = 0, un_pass = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] < 60)
                un_pass++; // 如果 不及格
            else
                is_pass++;
        }

        // 印出 及格 不及格 人數
        System.out.println("　及格數: " + is_pass);
        System.out.println("不及格數: " + un_pass);

    }
    ////////////////////////////////////////////////////
    //

    ////////////////////////////////////////////////////
}
