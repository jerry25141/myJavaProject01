/* 
    請幫春嬌美體公司建立一套薪資管理系統。
    員工薪資必須符合勞委會規定，底薪不可以低於 16800 元，
    如低於該值則自動調整到最低薪資；
    加班時數不得高於 45 小時，高於 45 小時則以 45 小時計算；
    又加班費為原來時薪再增加 1/3 倍（即是原來時薪的 (1 + 1/3) 倍）。
    該系統允許輸入員工姓名、底薪、加班時數，
    計算完成後，分別印出該員工姓名、底薪、加班費與應領薪資多寡。 
*/

package topic02_0719.myJavaQuiz2.src.quiz2;

////////////////////////////////////////////////////
import java.util.Scanner;

////////////////////////////////////////////////////

public class q_no02 {
    public static void run_question() {
        System.out.println("\n#=====================#");
        System.out.println("【Question02】薪資管理系統");
        ////////////////////////////////////////////////////
        Scanner myScanner = new Scanner(System.in);

        System.out.println("請輸入姓名(enter繼續):");
        String s = myScanner.nextLine();

        System.out.println("請輸入底薪(enter繼續):");
        double base = myScanner.nextDouble(); // 輸入底薪

        System.out.println("請輸入加班時數(enter繼續):");
        double addben = myScanner.nextDouble(); // 輸入加班時數

        double a = 0; // 加班費
        double total = 0; // 總薪資
        // 薪資不可低於 16800，自動調漲
        if (base < 16800) {
            base = 16800;
        }
        // 加班時數不得高於 45 小時，高於 45 小時則以 45 小時計算；
        if (addben > 45) {
            addben = 45;
        }

        // 計算 加班費
        a += (addben * 1.33 * 180);
        total = a + base; // 計算總薪資
        System.out.println("員工姓名為: " + s); // 姓名
        System.out.println("員工底薪為: " + base); // 底薪
        System.out.println("員工加班費為: " + a); // 加班費
        System.out.println("員工應領到總薪資為: " + total);// 總薪資
    }
    ////////////////////////////////////////////////////
}
