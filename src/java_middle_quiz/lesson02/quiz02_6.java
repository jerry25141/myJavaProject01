package java_middle_quiz.lesson02;

//JPA206 及格分數
//(1) 請撰寫一個能輸入國文、英文、數學三科分數的程式。
//(2) 程式執行時，如執行結果參考畫面 (1)，畫面顯示【Input Chinese score:】，
//    請使用者輸入國文分數，再分別依序要求輸入英文、數學的分數。
//(3) 將此三個分數分別存入變數之中，再判斷是否有任何一科不及格，如果任何一科不及格，
//    則輸出該科不及格，分別顯示【科目 + failed.】；如果全部都及格，則輸出全部通關，顯示【All Pass.】。
//(4) 重複執行四次，顯示如執行結果參考畫面 (2)。
//-------------------------------------------------------------------------------------------
// Input Chinese score:80
// Input English score:98
// Input Math score:55
// Math failed.
// Input Chinese score:10
// Input English score:80
// Input Math score:70
// Chinese failed.
// Input Chinese score:100
// Input English score:100
// Input Math score:100
// All pass.
// Input Chinese score:10
// Input English score:10
// Input Math score:10
// Chinese failed.
// English failed.
// Math failed.

//////////////////////////////////////////////////////
import java.util.Scanner;
//////////////////////////////////////////////////////
public class quiz02_6 {
    
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        // 重複執行 4 次 //
        for (int i = 0; i < 4; i++) {

            // Input 輸入 //
            // 國文
            System.out.println("Input Chinese score:");
            int score_Chinese = Integer.parseInt(myScanner.nextLine());
            // 英文
            System.out.println("Input English score:");
            int score_English = Integer.parseInt(myScanner.nextLine());
            // 數學
            System.out.println("Input Math score:");
            int score_Math = Integer.parseInt(myScanner.nextLine());

            // 判斷 + output //
            boolean is_pass_chinese = (score_Chinese >= 60);
            boolean is_pass_english = (score_English >= 60);
            boolean is_pass_math = (score_Math >= 60);

            // 如果都及格
            if (is_pass_chinese && is_pass_english && is_pass_math) {
                System.out.println("All pass.");
            } else {
                // 個別科目 不及格 output
                if (!is_pass_chinese)
                    System.out.println("Chinese failed");
                if (!is_pass_english)
                    System.out.println("English failed");
                if (!is_pass_math)
                    System.out.println("Math failed");
            }
            
        }


        myScanner.close();
    }
}