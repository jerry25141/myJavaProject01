
package topic02_0719;
import java.util.Arrays;
////////////////////////////////////////////////////
import java.util.Scanner;
////////////////////////////////////////////////////

public class Ex04_1 {
////////////////////////////////////////////////////
////////////////////////////////////////////////////
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

////////////////////////////////////////////////////
        // int array
        int n = 20;     // 長度 n = 20
        int[] score = new int[n];   // 建立長度為n的int[]
        for(int i = 0; i < n; i++) {    // 從 0~n i++
            System.out.print(score[i] + ",");   // score[i] 取得score[]資料
        }
        System.out.println();
        // 或是
        int[] score2 = new int[15];
        for(int i = 0; i < score2.length; i++) {
            System.out.print(score[i] + ",");
        }
        System.out.println();

        // 使用 Arrays.toString 直接印出
        System.out.println("使用Arrays.toString印出");
        System.out.println(Arrays.toString(score2));

////////////////////////////////////////////////////
        // 
        int[] math_score = new int[3];
        math_score[0] = 85;
        math_score[1] = 95;
        math_score[2] = 90;
        System.out.println("第 1 學生的成績是:" + math_score[0]);
        System.out.println("第 2 學生的成績是:" + math_score[1]);
        System.out.println("第 3 學生的成績是:" + math_score[2]);
        
////////////////////////////////////////////////////
        // 手動輸入
        int[] scores = new int[3];
        System.out.println("請輸入3個學生成績(enter分開):");
        scores[0] = myScanner.nextInt();
        scores[1] = myScanner.nextInt();
        scores[2] = myScanner.nextInt();
        System.out.println("第 1 學生的成績是:" + scores[0]);
        System.out.println("第 2 學生的成績是:" + scores[1]);
        System.out.println("第 3 學生的成績是:" + scores[2]);
        
////////////////////////////////////////////////////
        // 手動輸入 + 算平均
        int total = 0;
        int[] score_for_loop = new int[4];  // 4個空間，0~3

        // 從 1 開始 到 3 結束
        for(int i = 1; i <= 3; i++) {
            // input
            System.out.println("請輸入第" + (i+1) + "個學生成績(enter分開):");
            score_for_loop[i] = myScanner.nextInt();
            // total 累加
            total += score_for_loop[i];
        }
        System.out.println("平均是" + total/3);

////////////////////////////////////////////////////


    }
}
