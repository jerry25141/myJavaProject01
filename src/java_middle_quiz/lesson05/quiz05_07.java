package java_middle_quiz.lesson05;

// JPA507 停車費用計算
//(1) 請用陣列方式寫出停車費用計算的程式。
//(2) 假設停車時段分為：
//    a. 2 小時以內 (含 2 小時)，每小時以 30 元計算。
//    b. 2 小時以上不足 4 小時，每小時以 50 元計算。
//    c. 4 小時以上不足 6 小時，每小時以 80 元計算。
//    d. 6 小時以上，每小時以 100 元計算。
//(3) 請輸入停車時數並計算出停車費用，分別計算 2 小時、3 小時、5 小時及 8 小時的應繳費用，顯示如執行結果參考畫面。

// 停車時數：2小時
// 應繳費用：60元整

// 停車時數：3小時
// 應繳費用：110元整

// 停車時數：5小時
// 應繳費用：240元整

// 停車時數：8小時
// 應繳費用：520元整

//////////////////////////////////////////////////////
import java.util.*;

//////////////////////////////////////////////////////
public class quiz05_07 {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int hours = 0;

        // 2小時
        hours = 2;
        cal_park(hours);
        // 3小時
        hours = 3;
        cal_park(hours);
        // 5小時
        hours = 5;
        cal_park(hours);
        // 8小時
        hours = 8;
        cal_park(hours);
    }

    //////////////////////////////////////////////////////
    public static void cal_park(int hours) {
        System.out.println("停車時數：" + hours + "小時");

        // 題目停車費 計算範圍 (0 ~ 2)=$30, (2 ~ 4)=$50, (4 ~ 6)=$80, (6 ~ )=$100
        int[] hour_table = { 0, 2, 4, 6 };
        int[] fee_table = { 30, 50, 80, 100 };
        int output_fee = 0;

        // !! 重要 !! i從後面開始的，先算有沒有超過6小時
        for (int i = 3; i >= 0; i--) {
            if (hours > hour_table[i]) {
        // ex: 8 hours, 總和 += (8-6)*fee > (6-4)*fee > (4-2)*fee > (2-0)*fee
                output_fee += (hours - hour_table[i]) * fee_table[i];
                hours = hour_table[i]; // 要記得變成 目前最大 hours
            }
        }
        // Output
        System.out.println("應繳費用：" + output_fee + "元整");
        System.out.println();
    }
    //////////////////////////////////////////////////////
}
