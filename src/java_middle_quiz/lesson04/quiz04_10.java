package java_middle_quiz.lesson04;

//JPA410 遞迴字串替換
//(1) 請使用遞迴撰寫一個類別方法，此方法能夠將一個字串內的某個字元換成另一個字元。
//    例如輸入字串【windows】，將字串中 w 值替換成 g 值，輸出字串為【gindogs】。
//(2) 程式執行時，顯示【Input a string: 】要求輸入字串，接續顯示【Input a character: 】
//    要求輸入「被替換」的字元，最後顯示【Input another character: 】要求輸入替換字元。
//(3) 請利用 replace() 函數進行字串替換，顯示如執行結果參考畫面。

// Input a string: windows
// Input a character: w
// Input another character: g
// gindogs

//////////////////////////////////////////////////////
import java.util.*;

//////////////////////////////////////////////////////
public class quiz04_10 {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.print("Input a string: ");
        String str_org = myScanner.nextLine();
        System.out.print("Input a character: ");
        char c_old = myScanner.nextLine().charAt(0); // char只會有1個字員
        System.out.print("Input another character: ");
        char c_new = myScanner.nextLine().charAt(0); // char只會有1個字員

        // 遞迴字串替換
        String str_new = rec_replace(str_org, c_old, c_new);
        System.out.println(str_new);
    }

    //////////////////////////////////////////////////////
    // 遞迴字串替換
    public static String rec_replace(String str, char oldChar, char newChar) {
        if (str.equals(""))
            return "";
        else {
            // 判斷是否 replace oldChar
            char firstChar = str.charAt(0);
            if (firstChar == oldChar)
                return newChar + rec_replace(str.substring(1), oldChar, newChar);
            else
                return firstChar + rec_replace(str.substring(1), oldChar, newChar);
        }
    }
    //////////////////////////////////////////////////////
}
