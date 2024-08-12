package java_middle_quiz.lesson02;

//JPA204 公倍數計算 整除(5, 9)
//(1) 請設計一程式，能判斷使用者所輸入的整數，是否能同時被 5、9 整除。
//(2) 程式執行時，畫面顯示【Input:】，讓使用者輸入一個整數。
//(3) 計算是否能同時被 5、9 整除。
//(4) 若此數字為 5 與 9 的公倍數，則印出【Yes】，否則印出【No】。
//(5) 重複執行兩次，顯示如執行結果參考畫面。
//----------------------------------------------------------------------
// Input:
// 90
// Yes
// Input:
// 70
// No

//////////////////////////////////////////////////////
import java.util.Scanner;
//////////////////////////////////////////////////////
public class quiz02_4 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Input:");
        int a = Integer.parseInt(myScanner.nextLine());

        boolean flag = false;
        for (int i = 0; i < 2; i++) {
            // 判斷是否被 5和9 整除
            if (a % 5 == 0) {
                if (a % 9 == 0) {
                    flag = true;
                    break; // 【!重點!】跳出for迴圈
                }
            }
        }

        // 輸出
        if (flag)
            System.out.println("Yes");
        else
            System.out.println("No");

        myScanner.close();
    }
}
