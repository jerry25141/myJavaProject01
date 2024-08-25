package java_middle_quiz.lesson05;

// JPA505 反轉陣列
//(1) 程式內有一陣列 {"A", "B", "C", "D", "E", "F", "G", "H", I", "J"}。
//(2) 請用陣列方式寫出反轉陣列的程式，顯示 {"J", "I", "H", "G", "F", "E", "D", "C", "B", "A"}。
//(3) 顯示如執行結果參考畫面。

// 反轉陣列資料之前： A B C D E F G H I J 
// 反轉陣列資料之後： J I H G F E D C B A 

//////////////////////////////////////////////////////
import java.util.*;

//////////////////////////////////////////////////////
public class quiz05_05 {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        // 初始陣列， 使用String[]
        String[] str_list = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
        System.out.print("反轉陣列資料之前：");
        for (String each : str_list) {
            System.out.print(" " + each);
        }

        // 反轉陣列
        int left = 0; // 最左邊 定位點
        int right = str_list.length - 1; // 最右邊 定位點

        while (left < right) { // 10(偶)裡面，left=5 right=4 就會結束
            // Swap 交換
            String tmp = str_list[left];
            str_list[left] = str_list[right];
            str_list[right] = tmp;

            left++;
            right--; // (方向) 左 >> ， << 右邊
        }

        // Output
        System.out.print("\n反轉陣列資料之後：");
        for (String each : str_list) {
            System.out.print(" " + each);
        }
    }
}
