package java_middle_quiz.lesson03;

//JPA304 餐點費用
//(1) 有五位朋友到知名美式餐廳慶生，此餐廳採點餐的計算方式。
//(2) 程式執行時，如執行結果參考畫面 (1)，畫面顯示【Please enter meal dollars or enter -1 to stop:】，
//    請使用者輸入第一道餐點費用，再分別依序要求輸入其他道餐點的費用。
//(3) 若要停止執行程式計算，需輸入 -1 後停止程式計算，-1 不列入餐點計算的費用內。如執行結果參考畫面 (2)，
//    輸出餐點數量、所有餐點的總費用及平均負擔費用，平均值取至小數第二位。
//(4) 顯示如執行結果參考畫面。
//-------------------------------------------------------------------------------------------------
// Please enter meal dollars or enter -1 to stop: 180
// Please enter meal dollars or enter -1 to stop: 120
// Please enter meal dollars or enter -1 to stop: 99
// Please enter meal dollars or enter -1 to stop: 399
// Please enter meal dollars or enter -1 to stop: 150
// Please enter meal dollars or enter -1 to stop: -1
// 餐點總費用:948
// 5 道餐點平均費用為: 189.60 

// import java.util.*;

// public class JPA304a {
//     public static void main(String argv[]) {
//         int total = 0;
//         int s = 0;
//         int count = 0;
//         double average;
//         System.out.print("Please enter meal dollars or enter -1 to stop: ");
//         s = new Scanner(System.in).nextInt();
//         while (s != -1) {
//             total += s;
//             count++;
//             System.out.print("Please enter meal dollars or enter -1 to stop: ");
//             s = new Scanner(System.in).nextInt();
//         }
//         System.out.println("餐點總費用:" + total);
//         System.out.printf(" %d 道餐點平均費用為: %.2f %n", count, 1.0 * total / count);
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz03_04 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}
