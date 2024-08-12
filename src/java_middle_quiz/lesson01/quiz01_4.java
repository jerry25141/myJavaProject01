package java_middle_quiz.lesson01;

//JPA104 距離計算
//(1) Math 套件 (package) 內有許多數學上常用的函數。
//(2) 請使用 Math.pow 及 Math.sqrt 撰寫程式，顯示【輸入第1組的x和y座標：】，提示使用者首先輸入第一組座標 (x1, y1)
//    ，x 與 y 座標的輸入以一空隔鍵分隔，其資料型態皆為正整數。
//(3) 要求輸入第2組座標 (x2, y2)。
//(4) 兩組座標輸入完畢，輸出兩組座標之間的距離，顯示如執行結果參考畫面 (3)。
//-----------------------------------------------------------------------------------------------------------
//(1) 提示使用者首先輸入第一組座標 (x1, y1)。
//    輸入第1組的x和y座標：     ex: 1 5
//(2) 要求輸入第二組座標 (x2, y2)。
//    輸入第2組的x和y座標：     ex: 10 22
//(3) 兩組座標輸入完畢，輸出兩組座標之間的距離。
//    ex: 介於(1.00,5.00)和(10.00,22.00)之間的距離是19.25

//////////////////////////////////////////////////////
import java.util.Scanner;
//////////////////////////////////////////////////////
public class quiz01_4 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        // 輸入 (x1, y1)
        System.out.println("【輸入第1組的x和y座標：】");
        int x1 = Integer.parseInt(myScanner.next());
        int y1 = Integer.parseInt(myScanner.next());
        // 輸入 (x2, y2)
        System.out.println("【輸入第1組的x和y座標：】");
        int x2 = Integer.parseInt(myScanner.next());
        int y2 = Integer.parseInt(myScanner.next());

        // 計算 2 左標之間的距離 (三角形 畢氏定理)
        double x_pow = Math.pow((x1 - x2), 2);  // x 的距離 平方
        double y_pow = Math.pow((y1 - y2), 2);  // y 的距離 平方
        double z_pow = x_pow + y_pow;

        double z     = Math.sqrt(z_pow);
        // OUTPUT
        System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是:\n%.2f\n",
            (double)x1,  (double)y1,
            (double)x2,  (double)y2,
            (double)z
        );

        // 關閉 Scanner
        myScanner.close();
    }
}
