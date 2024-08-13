package java_middle_quiz.lesson02;

//JPA209 象限座標
//(1) 請撰寫程式，輸入 x、y 座標值，判斷該點位於何象限或是在哪個座標軸上。
//(2) 程式執行時，畫面顯示【請輸入x座標：】要求輸入 x 座標。
//    舉例：若輸入的座標值為 (3.0, -2.5)，輸出【座標值 + 在第四象限】；
//    若輸入的座標值為 (4.5, 0.0)，輸出【座標值 + 在 x 軸上】。
//(3) 重複執行四次，顯示如執行結果參考畫面 (2)。
//----------------------------------------------------------------------------------
// 請輸入x座標：4.5
// 請輸入y座標：0
// (4.50,0.00)在x軸上
// 請輸入x座標：0
// 請輸入y座標：3.2
// (0.00,3.20)在y軸上
// 請輸入x座標：-5.5
// 請輸入y座標：-3.8
// (-5.50,-3.80)在第三象限
// 請輸入x座標：-4.3
// 請輸入y座標：7.2
// (-4.30,7.20)在第二象限

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz02_9 {
    // Java的垃圾回收機制，會自動清理 Scanner 的資源
    // 但我有機會還是會寫 try Scanner
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        test();
        test();
        test();
        test();
    }

    public static void test() {

        try (Scanner myScanner = new Scanner(System.in)) {

            double x, y;
            System.out.printf("請輸入x座標：");
            x = myScanner.nextDouble();
            System.out.printf("請輸入y座標：");
            y = myScanner.nextDouble();

            // 判斷 x or y 軸上
            if (x == 0)
                System.out.printf("(%.2f,%.2f)在y軸上%n", x, y);
            else if (y == 0)
                System.out.printf("(%.2f,%.2f)在x軸上%n", x, y);

            // 一象限 x > 0 and y > 0 //
            // 四象限 x > 0 and y < 0 //
            // 二象限 x < 0 and y > 0 //
            // 三象限 x < 0 and y < 0 //

            // 先判斷 一and四 象限
            else if (x > 0) {
                if (y > 0)
                    System.out.printf("(%.2f,%.2f)在第一象限%n", x, y);
                else
                    System.out.printf("(%.2f,%.2f)在第四象限%n", x, y);
                // 再判斷 二and三 象限
            } else {
                if (y > 0)
                    System.out.printf("(%.2f,%.2f)在第二象限%n", x, y);
                else
                    System.out.printf("(%.2f,%.2f)在第三象限%n", x, y);
            }
        } catch (Exception e) {
            System.out.println("輸入格式錯誤!!");
        }
    }
}