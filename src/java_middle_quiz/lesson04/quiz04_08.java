package java_middle_quiz.lesson04;

//JPA408 遞迴字串反向
//(1) 請使用遞迴設計一個類別方法，此方法能夠將字串反向。
//(2) 程式執行時，顯示【Input a string: 】要求輸入字串。
//(3) 連續執行兩次，如執行結果參考畫面將字串反向印出。
//----------------------------------------------------------------------------------------
// Input a string: computer
// retupmoc
// Input a string: skills
// slliks

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz04_08 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }

    public static void test() {
        System.out.print("Input a string: ");
        String str_org = myScanner.nextLine();

        // 字串反轉，使用高效率der StringBuilder
        StringBuilder str_new = new StringBuilder();
        int n = str_org.length();
        for(int i = n-1; i >= 0; i--) 
            str_new.append(str_org.charAt(i));

        System.out.println(str_new);
    }
}
