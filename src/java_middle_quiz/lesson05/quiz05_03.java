package java_middle_quiz.lesson05;

// JPA503 矩陣之和
//(1) 試撰寫一個函數，此函數可用來計算矩陣 A 與 B 的和，使「矩陣之和」程式正常執行。
//    int A[][] = {{1, 2, 3}, {4, 5, 6}}
//    int B[][] = {{7, 8, 9}, {10, 11, 12}}
//(2) 計算矩陣 A 與 B 的和，並把相加後的結果放在矩陣 C 裡。
//(3) 顯示如執行結果參考畫面。

// 陣列A的內容為(3x3)：
// 01 02 03 
// 04 05 06 
//
// 陣列B的內容為(3x3)：
// 07 08 09 
// 10 11 12 
//
// 陣列A+B=C，陣列C的內容為(3x3)：
// 08 10 12 
// 14 16 18 

//////////////////////////////////////////////////////
import java.util.*;

//////////////////////////////////////////////////////
public class quiz05_03 {
    static Scanner myScanner = new Scanner(System.in);

    //////////////////////////////////////////////////////
    //////////////////////////////////////////////////////
    public static void main(String[] args) {
        test();
    }

    //////////////////////////////////////////////////////
    //////////////////////////////////////////////////////
    // !! 重點 !! 先行宣告 行列大小 public static //
    public static int Col_len = 2, Row_len = 3; // 兩行，三列

    public static void test() {
        int A[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int B[][] = { { 7, 8, 9 }, { 10, 11, 12 } };

        // A矩陣
        System.out.println("陣列A的內容為(3x3)：");
        my_matrix_print(A);
        // B矩陣
        System.out.println("\n陣列B的內容為(3x3)：");
        my_matrix_print(B);
        // C矩陣
        System.out.println("\n陣列A+B=C，陣列C的內容為(3x3)：");
        my_matrix_print(matrix_cal(A, B));
    }

    //////////////////////////////////////////////////////
    // 矩陣相加
    public static int[][] matrix_cal(int[][] A, int[][] B) {
        int[][] C = new int[2][3];

        for (int i = 0; i < Col_len; i++) {
            for (int j = 0; j < Row_len; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    //////////////////////////////////////////////////////
    // 各位數字，前面加上0
    public static String my_num_format(int input) {
        if (input < 10)
            return "0" + input;
        else
            return "" + input;
    }

    //////////////////////////////////////////////////////
    // 印出 matrix 矩陣
    public static void my_matrix_print(int[][] matrix) {
        for (int i = 0; i < Col_len; i++) {
            for (int j = 0; j < Row_len; j++) {
                System.out.print(my_num_format(matrix[i][j]) + " ");
            }
            System.out.println();
        }
    }
    //////////////////////////////////////////////////////
}
