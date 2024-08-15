/* 
    JPA207 三角形邊長判斷
    (1) 請寫一個判斷三角形的程式：當三個邊長能夠構成三角形時，再判斷該三角形為鈍角、銳角或是直角三角形，
        否則請顯示【不可以構成三角形】。
    (2) 構成三角形存在條件：任兩邊相加大於第三邊，且皆不可為 0。
    (3) 直角三角形：其中有兩個邊的平方和等於第三邊的平方。
    (4) 鈍角三角形：其中有兩個邊的平方和小於第三邊的平方。
    (5) 銳角三角形：任兩邊的平方和大於第三邊的平方。
    (6) 程式執行時，畫面顯示【請輸入三個整數：】要求輸入三邊的邊長。
*/

package topic_java_code.topic0719.myJavaQuiz2.src.quiz2;

////////////////////////////////////////////////////
import java.util.Scanner;

////////////////////////////////////////////////////

public class q_no03 {
    public static void run_question() {
        System.out.println("\n#=====================#");
        System.out.println("【Question03】三角形邊長判斷");
        ////////////////////////////////////////////////////
        Scanner myScanner = new Scanner(System.in);

        // JPA207 三角形邊長判斷
        System.out.print("請輸入三個整數的三邊邊長(enter輸出):\n");
        System.out.print("a = ");
        int a = myScanner.nextInt();
        System.out.print("b = ");
        int b = myScanner.nextInt();
        System.out.print("c = ");
        int c = myScanner.nextInt();

        ////////////////////////////////////////////
        // (檢查) 是否為 0 (空)
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("無法構成三角形!");
        }
        // (檢查) 等腰三角形 {兩條邊長相同，使用 或|| 判斷}
        else if (a == b || a == c || b == c) {
            System.out.println("等腰三角形!");
        }
        // (檢查) 正三角形 {三條邊長相等，使用 且&& 判斷}
        else if (a == b && a == c && b == c) {
            System.out.println("正三角形!");
        }
        // (檢查) 基本三角形條件 {三角形任意兩邊和大於第三}
        else if (a + b < c || b + c < a || a + c < b) {
            System.out.println("無法構成三角形!");
        }
        // (檢查) 直角三角形(三角函數?) {其中有 兩個邊的 平方和 和 等於 第三邊的平方pow}
        else if (pow1(a, b) == pow2(c)) {
            System.out.println("直角三角形!");
        }
        // (檢查) 鈍角三角形(三角函數?) {其中有 兩個邊的 平方和 小於 第三邊的平方pow}
        else if (pow1(a, b) < pow2(c)) {
            System.out.println("鈍角三角形!");
        }
        // (檢查) 銳角三角形(三角函數?) {任 兩個邊的 平方和 大於 第三邊的平方pow}
        // (a^2 + b^2) > c 或 (b^2 + c^2) > a 或 (a^2 + c^2) > b
        else if (pow1(a, b) > pow2(c) || pow1(b, c) > pow2(a) || pow1(a, c) > pow2(b)) {
            System.out.println("銳角三角形!");
        }
    }

    ////////////////////////////////////////////////////
    // 兩個邊的 平方和
    public static int pow1(int x, int y) {
        int total = 0;
        total += Math.pow(x, 2) + Math.pow(y, 2);
        return total;
    }

    // 單邊 平方
    public static int pow2(int x) {
        int total = 0;
        total += Math.pow(x, 2);
        return total;
    }
    ////////////////////////////////////////////////////
}
