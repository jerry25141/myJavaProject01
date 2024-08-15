package java_middle_quiz.lesson03;

//JPA308 電腦週邊費用總計
//(1) David 到某商場為公司購買一系列的電腦週邊設備，請以 do-while 計算此次購買的總費用，
//    使「電腦週邊費用總計」程式正常執行。
//(2) do-while 的最大特點為：其內的 statement 至少會被執行一次。do-while 的語法如下：
// do {
//     statement;
//     ...
// } while (exp)
//(3) 程式執行時，如執行結果參考畫面 (1)，畫面顯示【請輸入消費金額，或輸入-1 結束：】，
//    請使用者輸入第一項消費金額，再分別依序要求輸入費用，最後輸入 -1。
//(4) 當使用者輸入 -1，即停止執行程式計算，並如執行結果參考畫面 (2)，輸出電腦週邊總消費的總合。
//------------------------------------------------------------------------------------
// 請輸入消費金額，或輸入-1結束：20000
// 請輸入消費金額，或輸入-1結束：399
// 請輸入消費金額，或輸入-1結束：199
// 請輸入消費金額，或輸入-1結束：4000
// 請輸入消費金額，或輸入-1結束：2000
// 請輸入消費金額，或輸入-1結束：-1
// 電腦周邊總消費：26598

//////////////////////////////////////////////////////
import java.util.*;

//////////////////////////////////////////////////////
public class quiz03_08 {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int input = 0;
        int total = 0;
        // 依照題目要求，使用 do while
        do {
            total += input;
            System.out.println("請輸入消費金額，或輸入-1結束：");
            try {
                input = myScanner.nextInt();
            } catch (Exception e) {
                System.out.println("輸入錯誤，請重新輸入。");
                myScanner.next(); // 清除輸入緩衝區，並 重新提示使用者輸入(其實別亂打就好zzz)
            }
        } while (input != -1);

        System.out.println("電腦周邊總消費：" + total);

    }
}
