package java_middle_quiz.lesson04;

//JPA410 遞迴字串替換
//(1) 請使用遞迴撰寫一個類別方法，此方法能夠將一個字串內的某個字元換成另一個字元。
//    例如輸入字串【windows】，將字串中 w 值替換成 g 值，輸出字串為【gindogs】。
//(2) 程式執行時，顯示【Input a string: 】要求輸入字串，接續顯示【Input a character: 】
//    要求輸入「被替換」的字元，最後顯示【Input another character: 】要求輸入替換字元。
//(3) 請利用 replace() 函數進行字串替換，顯示如執行結果參考畫面。
//----------------------------------------------------------------------------------
// Input a string: windows
// Input a character: w
// Input another character: g
// gindogs

// import java.util.*;

// public class JPA410a {
//     static Scanner keyboard = new Scanner(System.in);
//     public static void main(String args[]) {
//         String s, c1, c2;
//         System.out.print("Input a string: ");
//         s = keyboard.nextLine();
//         System.out.print("Input a character: ");
//         c1 = keyboard.nextLine();
//         System.out.print("Input another character: ");
//         c2 = keyboard.nextLine();
//         System.out.printf("%s\n", replace(s, c1, c2));
//     }
//     public static String replace(String s, String c1, String c2) {
//         if (s.equals(""))
//             return "";
//         else if (s.substring(0, 1).equals(c1))
//             return c2 + replace(s.substring(1), c1, c2);
//         else
//             return s.substring(0, 1) + replace(s.substring(1), c1, c2);
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz04_10 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}
