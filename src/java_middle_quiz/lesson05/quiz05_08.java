package java_middle_quiz.lesson05;

// JPA508 泡泡排序法
//(1) 請使用泡泡排序法 (Bubble Sort) 撰寫程式。
//(2) 程式內有一資料陣列 {2, 4, 3, 5, 7, 6, 9, 1}。
//(3) 請輸出泡泡排序法的比對過程。
//(4) 顯示如執行結果參考畫面。
//--------------------------------------------------------------------------------------------------
// 2 3 4 5 6 7 1 9
// 2 3 4 5 6 1 7 9
// 2 3 4 5 1 6 7 9
// 2 3 4 1 5 6 7 9
// 2 3 1 4 5 6 7 9
// 2 1 3 4 5 6 7 9
// 1 2 3 4 5 6 7 9

// public class JPA508a {
//     public static void main(String[] argv) {
//         int[] data = {2, 4, 3, 5, 7, 6, 9, 1};  
//         int temp;        
//         for(int i = 0;i < data.length - 1;i++) {
//             for(int j = 0;j < data.length - 1 - i;j++) {
//                 if(data[j] > data[j + 1]) {
//                     temp = data[j];
//                     data[j] = data[j + 1];
//                     data[j + 1] = temp;
//                 }
//             }        	
//             for(int k : data) 
//                 System.out.print(" " + k);
//             System.out.println("");
//         }
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz05_08 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}
