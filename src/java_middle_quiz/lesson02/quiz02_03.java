package java_middle_quiz.lesson02;
//JPA203 判斷奇偶數

//(1)請設計一程式，使用者可輸入一個整數，判斷此整數為奇數或偶數。
//(2)程式執行時，畫面顯示【Input an integer:】，請使用者輸入一個整數。
//(3)重複執行兩次，如執行結果參考畫面。若為奇數，顯示【The number is odd.】：若為偶數，則顯示【The number is even.】。
//-----------------------------------------------------------------------------------------------------------
// Input an integer:
// 7
// The number is odd.
// Input an integer:
// 28
// The number is even.
//-----------------------------------------------------------------------------------------------------------

//////////////////////////////////////////////////////
import java.util.Scanner;
//////////////////////////////////////////////////////
public class quiz02_03 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            System.out.println("Input an integer:");
            int my_input = Integer.parseInt(myScanner.nextLine());

            // 如果整除 = even, 否則 = odd
            if (my_input % 2 == 0)
                System.out.println("【The number is even.】");
            else
                System.out.println("【The number is odd.】");
        }

        myScanner.close();
    }
}
