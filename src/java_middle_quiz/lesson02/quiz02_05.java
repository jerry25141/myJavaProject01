package java_middle_quiz.lesson02;

//JPA205 倍數判斷 (2,3,6 的倍數)
//(1) 請設計一程式，能判斷使用者所輸入的整數，是否為 2、3、6 的倍數。
//(2) 程式執行時，畫面顯示【Enter an integer:】，請使用者輸入一個整數。
//(3) 若輸入的整數是 2、3、6 的倍數，請輸出此整數是 2、3、6 哪些整數的倍數。
//    若輸入的整數都不是 2、3、6 的倍數，請輸出【xx 不是 2、3、6 的倍數】，將使用者輸入的整數代入 xx 內。
//(4) 重複執行四次，顯示如執行結果參考畫面。
//---------------------------------------------------------------------------------------------
// Enter an integer:
// 30
// 30是2、3、6的倍數
// Enter an integer:
// 2
// 2是2的倍數
// Enter an integer:
// 9
// 9是3的倍數
// Enter an integer:
// 77
// 77不是2、3、6的倍數

//////////////////////////////////////////////////////
import java.util.Scanner;
//////////////////////////////////////////////////////
public class quiz02_05 {
    
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        /////////////////
        // 重複執行 4次 //
        for (int i = 0; i < 4; i++) {


            System.out.println("Enter an integer:");
            int a = Integer.parseInt(myScanner.nextLine());

            /////////////
            // 定義 boolean，如果整除 = true
            boolean is_div_2 = (a % 2 == 0);
            boolean is_div_3 = (a % 3 == 0);
            boolean is_div_6 = (a % 6 == 0);

            /////////////
            // 輸出判斷 //
            StringBuilder ans = new StringBuilder();

            // 不是倍數 輸出 //
            if (!is_div_2 && !is_div_3 && !is_div_6)
                ans.append(a + "不是2、3、6的倍數");

            // 其中一個是倍數 //
            // 組合 2、3、6的倍數，(懶的演算法，窮舉~)
            ans.append(a + "是");
            // 2
            if (is_div_2 && !is_div_3 && !is_div_6)
                ans.append("2");
            // 3
            if (!is_div_2 && is_div_3 && !is_div_6)
                ans.append("3");
            // 6
            if (!is_div_2 && !is_div_3 && is_div_6)
                ans.append("6");
            // 2 3
            if (is_div_2 && is_div_3 && !is_div_6)
                ans.append("2、3");
            // 2 6
            if (is_div_2 && !is_div_3 && is_div_6)
                ans.append("2、6");
            // 3 6
            if (!is_div_2 && is_div_3 && is_div_6)
                ans.append("3、6");
            // 2 3 6
            if (is_div_2 && is_div_3 && is_div_6)
                ans.append("2、3、6");

            // 輸出答案 //
            ans.append("的倍數");
            System.out.println(ans);

            myScanner.close();
        }
    }
}