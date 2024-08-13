package java_middle_quiz.lesson02;

//JPA210 鍵盤字元判斷
//(1) 請使用 switch 完成編輯區中 test() 的程式。
//(2) 程式執行時，畫面顯示【Input a character:】，請使用者輸入一個英文字母。
//(3) 若輸入 a 或 b，顯示【You entered a or b】。
//(4) 若輸入 x顯示【You entered x】；若輸入 y，顯示【You entered y】。
//(5) 若皆非上述所列英文字母，則顯示【You entered something else.】。
//--------------------------------------------------------------------------------
// Input a character:
// a
// You entered a or b
// Input a character:
// b
// You entered a or b
// Input a character:
// x
// You entered x
// Input a character:
// y
// You entered y
// Input a character:
// c
// You entered something else.

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz02_10 {
    // Java的垃圾回收機制，會自動清理 Scanner 的資源
    // 但我有機會還是會寫 try Scanner
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        test();
        test();
        test();
        test();
        test();
    }

    public static void test() {
        try {
            System.out.println("Input a character:");
            String c = myScanner.nextLine();

            // 使用switch判斷資料，charAt(0)抓取第一位
            switch (c.charAt(0)) {
                case 'a', 'b':
                    System.out.println("You entered a or b");
                    break;
                case 'x':
                    System.out.println("You entered x");
                    break;
                case 'y':
                    System.out.println("You entered y");
                    break;
                default:    // 如果都沒有break，則會執行default
                    System.out.println("You entered something else.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("輸入格式錯誤!!");
        }
    }
}