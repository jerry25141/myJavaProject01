package java_middle_quiz.lesson05;

// JPA503 矩陣之和
//(1) 試撰寫一個函數，此函數可用來計算矩陣 A 與 B 的和，使「矩陣之和」程式正常執行。
//    int A[][] = {{1, 2, 3}, {4, 5, 6}}
//    int B[][] = {{7, 8, 9}, {10, 11, 12}}
//(2) 計算矩陣 A 與 B 的和，並把相加後的結果放在矩陣 C 裡。
//(3) 顯示如執行結果參考畫面。
//--------------------------------------------------------------------------------------
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

// public class JPA503a {
//     final static int ROW = 2;
//     final static int COL = 3;
//     public static void main(String args[]) {
//         int A[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
//         int B[][] = { { 7, 8, 9 }, { 10, 11, 12 } };
//         int C[][] = new int[ROW][COL];
//         System.out.printf("陣列A的內容為(3x3)：\n");
//         show(A);
//         System.out.printf("\n陣列B的內容為(3x3)：\n");
//         show(B);
//         add(A, B, C);
//         System.out.printf("\n陣列A+B=C，陣列C的內容為(3x3)：\n");
//         show(C);
//     }
//     public static void add(int Array1[][], int Array2[][], int Array3[][]) {
//         for (int i = 0; i < ROW; i++) {
//             for (int j = 0; j < COL; j++) {
//                 Array3[i][j] = Array1[i][j] + Array2[i][j];
//             }
//         }
//     }
//     public static void show(int Array[][]) {
//         for (int i = 0; i < ROW; i++) {
//             for (int j = 0; j < COL; j++) {
//                 System.out.printf("%02d ", Array[i][j]);
//             }
//             System.out.printf("%n");
//         }
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz05_3 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}
