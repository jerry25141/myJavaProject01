package java_middle_quiz.lesson01;

import java.util.Scanner;

//JPA102 單位換算
//(1) 程式執行時，畫面顯示【Please input:】，於後方由鍵盤輸入數字後，輸出轉換數值 (由公斤轉換成磅數)，
//    顯示如執行結果參考畫面 (2)。
//(2) 單位轉換公式為：1 公斤等於 2.20462 磅。
//-------------------------------------------------------------------------------------------------
//(1) 程式執行時，畫面顯示【Please input:】。 ex: 15
//(2) 於後方輸入數字，進行單位轉換，顯示 kg = ponds。 ex: 15.000000 kg = 33.069300 ponds


public class quiz01_02 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // 定義公斤轉磅的轉換常數
        final double kg_toPound = 2.20462;

        System.out.print("請輸入公斤數 (kg): ");
        // 創建 Scanner 物件，用于讀取使用者輸入
        double kilograms = scanner.nextDouble();

        // 計算磅數
        double pounds = kilograms * kg_toPound;

        // 輸出轉換結果，保留小數點後六位
        System.out.printf("%.6f kg = %.6f pounds\n", kilograms, pounds);

        // 關閉 Scanner 物件
        scanner.close();
    }
}
