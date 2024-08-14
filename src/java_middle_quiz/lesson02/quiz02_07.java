package java_middle_quiz.lesson02;

//JPA207 三角形邊長判斷
//(1) 請寫一個判斷三角形的程式：當三個邊長能夠構成三角形時，再判斷該三角形為鈍角、銳角或是直角三角形，
//    否則請顯示【不可以構成三角形】。
//(2) 構成三角形存在條件：任兩邊相加大於第三邊，且皆不可為 0。
//(3) 直角三角形：其中有兩個邊的平方和等於第三邊的平方。
//(4) 鈍角三角形：其中有兩個邊的平方和小於第三邊的平方。
//(5) 銳角三角形：任兩邊的平方和大於第三邊的平方。
//(6) 程式執行時，畫面顯示【請輸入三個整數：】要求輸入三邊的邊長。
//(7) 重複執行四次，顯示如執行結果參考畫面。
//-------------------------------------------------------------------------------------------
// 請輸入三個整數:3 4 5
// 直角三角形
// 請輸入三個整數:3 4 6
// 鈍角三角形
// 請輸入三個整數:4 4 3
// 銳角三角形
// 請輸入三個整數:2 4 7
// 不可以構成三角形

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz02_07 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        test();
        test();
        test();
        test();
    }

    static void test() {
        int a, b, c, t;
        System.out.print("請輸入三個整數:");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        // 將 a 改成 斜邊 (swap)
        if (a < b) {
            t = a;
            a = b;
            b = t;
        }
        if (a < c) {
            t = c;
            c = a;
            a = t;
        }
        // 開始判斷 三角形 //
        if (a < b + c) {
            if (a * a == b * b + c * c)
                System.out.println("直角三角形");
            else if ((a * a > b * b + c * c))
                System.out.println("鈍角三角形");
            else
                System.out.println("銳角三角形");
        } else
            System.out.println("不可以構成三角形");
    }
}
