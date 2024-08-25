package java_middle_quiz.lesson05;

// JPA508 泡泡排序法
//(1) 請使用泡泡排序法 (Bubble Sort) 撰寫程式。
//(2) 程式內有一資料陣列 {2, 4, 3, 5, 7, 6, 9, 1}。
//(3) 請輸出泡泡排序法的比對過程。
//(4) 顯示如執行結果參考畫面。

// 2 3 4 5 6 7 1 9
// 2 3 4 5 6 1 7 9
// 2 3 4 5 1 6 7 9
// 2 3 4 1 5 6 7 9
// 2 3 1 4 5 6 7 9
// 2 1 3 4 5 6 7 9
// 1 2 3 4 5 6 7 9

//////////////////////////////////////////////////////
import java.util.*;

//////////////////////////////////////////////////////
public class quiz05_08 {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int[] A = { 2, 4, 3, 5, 7, 6, 9, 1 };

        // 氣泡排序法 + 每行輸出
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                // SWAP 從小到大排序
                if (A[j] > A[j + 1]) {
                    int tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;
                }
            }
            my_print(A);
        }
    }

    //////////////////////////////////////////////////////
    public static void my_print(int[] A) {
        for (int each : A)
            System.out.print(each + " ");
        System.out.println();
    }
    //////////////////////////////////////////////////////
}
