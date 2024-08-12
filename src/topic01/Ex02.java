package topic01;
////////////////////////////////////////////////////////
import java.util.Scanner;
////////////////////////////////////////////////////////
public class Ex02 {

////////////////////////////////////////////////////////
    // 計算薪資
    // static 才能在 static void main 中執行
    public static double calc(int salary) {
        double pay = salary * 12 * 0.6;
        return pay;
    }
////////////////////////////////////////////////////////
    public static void main(String[] args) {
////////////////////////////////////////////////////////
        System.out.println("Code Starting...");

        // 建立 Scanner 物件來輸入
        Scanner myScanner = new Scanner(System.in);
        System.out.println("請輸入月入薪水:");
        int pay =  myScanner.nextInt();

        // 輸出 收入(無防呆)
        double ans = calc(pay);
        System.out.println("你的收入為:\n" + ans);

////////////////////////////////////////////////////////
    }
}

