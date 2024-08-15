/* 
    請製作一個求平方根的計算器，但被計算的原數不可以是負數；
    使用者輸入某一數值後，系統會先測試該值是否大於 0，
    如正確輸入則計算並輸出其平方根值。
    Math.sqrt() 
*/
package topic0719.myJavaQuiz2.src.quiz2;

////////////////////////////////////////////////////
import java.util.Scanner;

////////////////////////////////////////////////////

public class q_no01 {
    public static void run_question() {
        System.out.println("\n#=====================#");
        System.out.println("【Question_01】平方根的計算器");
        ////////////////////////////////////////////////////
        Scanner myScanner = new Scanner(System.in);

        double ans = 0;
        System.out.println("Q01 平方根計算機(enter輸入):");
        // 使用者 input
        ans = myScanner.nextDouble();
        if (ans > 0) {
            System.out.print(sqrt(ans));
        } else {
            System.out.print("輸入錯誤，無法計算");
        }

    }

    ////////////////////////////////////////////////////
    // funs sqrt 計算 開根號
    public static double sqrt(double a) {
        return Math.sqrt(a);
    }
    ////////////////////////////////////////////////////
}
