package java_middle_quiz.lesson04;

//JPA409 遞迴字串移除
//(1) 請使用遞迴撰寫一個類別方法，此方法能夠將一個字串內的某個字元移除。
//(2) 程式執行時，顯示【Input a string: 】要求輸入字串。
//(3) 輸入完畢，顯示【Input a character: 】要求輸入「欲移除」的字元。
//(4) 連續執行兩次，顯示如執行結果參考畫面，將字元從字串中移除。
//-------------------------------------------------------------------------------
// Input a string: java se8
// Input a character: a
// jv se8
// Input a string: computer
// Input a character: p
// comuter

// import java.util.*;

// public class JPA409a
// {
//     static Scanner keyboard = new Scanner(System.in);
//     public static void main(String args[])
//     {
//         String s, c;
//         System.out.print("Input a string: ");
//         s = keyboard.nextLine();
//         System.out.print("Input a character: ");
//         c = keyboard.nextLine();
//         System.out.printf("%s\n", removeChar(s, c));
//         System.out.print("Input a string: ");
//         s = keyboard.nextLine();
//         System.out.print("Input a character: ");
//         c = keyboard.nextLine();
//         System.out.printf("%s\n", removeChar(s, c));
//     }
//     public static String removeChar(String s, String c)
//     {
//         if (s.equals(""))
//             return "";
//         else if (s.substring(0, 1).equals(c))
//             return removeChar(s.substring(1), c);
//         else
//             return s.substring(0, 1) + removeChar(s.substring(1), c);
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz04_09 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}