package java_middle_quiz.lesson05;

// JPA507 停車費用計算
//(1) 請用陣列方式寫出停車費用計算的程式。
//(2) 假設停車時段分為：
//    a. 2 小時以內 (含 2 小時)，每小時以 30 元計算。
//    b. 2 小時以上不足 4 小時，每小時以 50 元計算。
//    c. 4 小時以上不足 6 小時，每小時以 80 元計算。
//    d. 6 小時以上，每小時以 100 元計算。
//(3) 請輸入停車時數並計算出停車費用，分別計算 2 小時、3 小時、5 小時及 8 小時的應繳費用，顯示如執行結果參考畫面。
//-------------------------------------------------------------------------------------------------
// 停車時數：2小時
// 應繳費用：60元整
// --------------------
// 停車時數：3小時
// 應繳費用：110元整
// --------------------
// 停車時數：5小時
// 應繳費用：240元整
// --------------------
// 停車時數：8小時
// 應繳費用：520元整

// public class JPA507a {
//     public static void main(String[] argv) {
//         int hours = 0; 
//         hours = 2;
//         park(hours);
//         System.out.println("--------------------");
//         hours = 3;
//         park(hours);
//         System.out.println("--------------------");
//         hours = 5;
//         park(hours);
//         System.out.println("--------------------");
//         hours = 8;
//         park(hours);
//     }
//     public static void park(int hours) {
//         int[] hourTable = { 0, 2, 4, 6 }; 
//         int[] feeTable = { 30, 50, 80, 100 }; 
//         int fee = 0; 
//         System.out.println("停車時數：" + hours + "小時");
//         for (int i = 3; i >= 0; i--) {
//             if (hours > hourTable[i]) {
//                 fee += (hours - hourTable[i]) * feeTable[i];
//                 hours = hourTable[i];
//             }
//         }
//         System.out.println("應繳費用：" + fee + "元整");
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz05_07 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}
