package java_middle_quiz.lesson01;

//JPA106 數學函數
//(1) 有一數學函數 f(x) = 3(x ^ 3) + 2x – 1。
//(2) 請撰寫一函數 f 用來傳回 f(x) 的值，並分別計算 f(-3.2)、f(-2.1)、f(0) 與 f(2.1)。
//(3) 函數 f(x) 值取到小數第四位。
//(4) 依此數學函數計算，分別輸出此四個計算值，顯示如執行結果參考畫面。
//------------------------------------------------------------------------------------
//    f(-3.2) = -105.7040
//    f(-2.1) = -32.9830
//    f(0) = -1.0000
//    f(2.1) = 30.9830

public class quiz01_06 {
//////////////////////////////////////////////////////
    public static void main(String[] args) {
        // 測試不同 x 值的結果，建立一個double[]陣列，存不同的輸入資料
        double[] xValues = {-3.2, -2.1, 0, 2.1};
        // 基礎 for寫法
        for (int i = 0; i < xValues.length; i++) {
            double result = calculater_f(xValues[i]);
            System.out.printf("f(%.1f) = %.4f\n", xValues[i], result);
        }
        // 進階 for 寫法
        for (double x : xValues) {
            double result = calculater_f(x);
            System.out.printf("f(%.1f) = %.4f\n", x, result);
        }
    }
//////////////////////////////////////////////////////

//////////////////////////////////////////////////////
    public static double calculater_f(double x) {
        // 計算 f(x) = 3x^3 + 2x - 1
        return 3 * Math.pow(x, 3) + 2 * x - 1;
    }
//////////////////////////////////////////////////////
}
