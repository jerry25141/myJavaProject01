package java_middle_quiz.lesson05;

// JPA509 選擇排序法
//(1) 請使用選擇排序法 (Selection Sort) 撰寫程式。
//(2) 程式內有一資料陣列 {1, 3, 2, 5, 4, 6}。
//(3) 請輸出選擇排序法的比對過程。
//(4) 顯示如執行結果參考畫面。
//------------------------------------------------------------------------------------------------------
// 1 3 2 5 4 6 
// 1 2 3 5 4 6 
// 1 2 3 5 4 6 
// 1 2 3 4 5 6 
// 1 2 3 4 5 6 

//////////////////////////////////////////////////////
import java.util.*;

//////////////////////////////////////////////////////
public class quiz05_09 {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int[] A = { 1, 3, 2, 5, 4, 6 };

        // Selection sort 開始
        int swap, min;
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            //
            min = i;
            // 依照i順序，搜索最小值
            for (int j = i + 1; j < n; j++)
                if (A[min] > A[j])
                    min = j;
            // SWAP i 從小到大排
            swap = A[min];
            A[min] = A[i];
            A[i] = swap;
            // 印出每行
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
