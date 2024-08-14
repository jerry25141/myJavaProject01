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

// public class JPA509a {
//     public static void main(String[] argv) {
//         int[] data = { 1, 3, 2, 5, 4, 6 };
//         sort(data);
//     }
//     public static void sort(int data[]) {
//         int d, min;
//         for (int i = 0; i < data.length - 1; i++) {
//             min = i;
//             for (int j = i + 1; j < data.length; j++) {
//                 if (data[min] > data[j]) {
//                     min = j;
//                 }
//             }
//             d = data[min];
//             data[min] = data[i];
//             data[i] = d;
//             for (int j = 0; j < data.length; j++) {
//                 System.out.printf("%d ", data[j]);
//             }
//             System.out.printf("%n");
//         }
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz05_09 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}
