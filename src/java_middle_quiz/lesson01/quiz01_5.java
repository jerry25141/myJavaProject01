package java_middle_quiz.lesson01;

//JPA105 存錢筒
//(1) 有一位小朋友從小就開始把 1 元、5 元、10 元、50 元的零用錢，投進自己的存錢筒裡。請計算出存錢筒中金錢的總額。
//(2) 程式執行時，首先要求輸入姓名，顯示【請輸入您的姓名：】，顯示如執行結果參考畫面 (1)。
//(3) 姓名輸入完畢，要求輸入銅板個數，顯示如執行結果參考畫面 (2)。
//(4) 依序要求輸入 1 元、5 元、10 元、50 元硬幣的數量，待輸入完才可再顯示下一列，顯示如執行結果參考畫面 (3)。
//(5) 金額輸入完畢，輸出總額，顯示如執行結果參考畫面 (4)。
//---------------------------------------------------------------------------------------------------------
//(1) 程式執行時，首先要求輸入姓名。
//    請輸入您的姓名：   ex:林佳儀
//(2) 姓名輸入完畢，要求輸入銅板個數。
//    Hi, 林佳儀,請輸入您的銅板的個數：    
//(3) 依序要求輸入 1 元、5 元、10 元、50 元硬幣的數量，待輸入完才可再顯示下一列
//    請輸入1元的數量：         ex:80
//    請輸入5元的數量：         ex:70
//    請輸入10元的數量：        ex:55
//    請輸入50元的數量：        ex:38
//(4) 金額輸入完畢，輸出總額。
//    您的錢總共有：2 千 8 百 8 十 0 元

//////////////////////////////////////////////////////
import java.util.Scanner;
//////////////////////////////////////////////////////
public class quiz01_5 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        // 輸入姓名
        System.out.println("請輸入您的姓名：");
        String name = myScanner.nextLine();

        // 輸入硬幣數量
        System.out.printf("Hi, %s請輸入您的銅板的個數：\n", name);
        int dollor_1 = myScanner.nextInt();
        System.out.println("請輸入5元的數量：");
        int dollor_5 = myScanner.nextInt();
        System.out.println("請輸入10元的數量：");
        int dollor_10 = myScanner.nextInt();
        System.out.println("請輸入50元的數量：");
        int dollor_50 = myScanner.nextInt();

        // 計算總金額
        int totalAmount = dollor_1 + dollor_5 * 5 + dollor_10 * 10 + dollor_50 * 50;

        // 輸出結果
        System.out.printf("您的錢總共有：%d 千 %d 百 %d 十 %d 元\n",
                totalAmount / 1000,
                (totalAmount % 1000) / 100,
                (totalAmount % 100) / 10,
                totalAmount % 10);

        // 關閉 Scanner
        myScanner.close();
    }
}
