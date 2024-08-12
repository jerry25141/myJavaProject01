package java_middle_quiz.lesson02;

//JPA202 比較大小

//(1) 請設計一程式，使用者可輸入兩個整數，並且比較兩個整數大小。
//(2) 程式執行時，畫面顯示【Input:】，請使用者輸入兩組整數，各組整數分別輸入兩個數字，數字中間以空格鍵間隔。
//(3) 重複執行兩次，一輸入的兩個整數比較大小，顯示如執行結果參考畫面。
//------------------------------------------------------------------------------------------------
// Input:
// 50 88
// 88 is larger than 50
// Input:
// 33 45
// 45 is larger than 33
//------------------------------------------------------------------------------------------------

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz02_2 {
//////////////////////////////////////////////////////
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        // 執行兩次 是大or小
        find_Big_Small();
        find_Big_Small();
    }
//////////////////////////////////////////////////////

//////////////////////////////////////////////////////
    static void find_Big_Small() {
        // 輸入 a b (空格分開)
        System.out.println("【Input:】(空格鍵分開)");
        int a, b;
        a = Integer.parseInt(myScanner.next());
        b = Integer.parseInt(myScanner.next());

        // 輸出 大小
        if (a > b)
            System.out.println(a + " is larger than " + b);
        else
            System.out.println(b + " is larger than " + a);
    }
//////////////////////////////////////////////////////
}
