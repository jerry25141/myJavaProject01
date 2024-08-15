package topic_java_code.topic0726;

////////////////////////////////////////////////////
import java.util.*;

////////////////////////////////////////////////////
public class t_Binary_Search {
    public static void main(String[] args) {

        int[] a = { 2, 3, 1, 10, 100, 43, 33 };
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //////////////////
        // 要找的目標數值 //
        int target = 10; // 輸入input
        //////////////////

        //////////////////////////////////////////////////////////////
        // 使用 binarySearch 來尋找數值
        int ans;
        ans = Arrays.binarySearch(a, target);
        // 如果 < 0，代表找不到
        if (ans < 0) {
            System.out.println("找不到值");
        } else {
            System.out.println("target:" + target + "\t位置 = a[" + ans + "]");
        }

        //////////////////////////////////////////////////////////////
        // 手動寫 Search 搜尋目標值在陣列中的位置
        int n = a.length; // 獲取陣列長度
        boolean is_found = false;
        for (int i = 0; i < n; i++) { // 遍歷整個陣列
            if (a[i] == target) { // 如果找到目標值
                System.out.println("target:" + target + "\t位置 = a[" + i + "]"); // 輸出結果
                is_found = true;
                break; // 跳出迴圈
            }
        }
        if (is_found == false)
            System.out.println("沒找到目標...");

        //////////////////////////////////////////////////////////////
        // 使用 while 迴圈進行線性搜尋
        int n2 = a.length; // 獲取陣列長度
        boolean is_found2 = false; // 初始化是否找到旗標
        int i = 0; // 初始化索引

        while (i < n2) { // 遍歷陣列
            if (a[i] == target) { // 如果找到目標值
                System.out.println("target:" + target + "\t位置 = a[" + i + "]"); // 輸出位置
                is_found2 = true; // 設定找到旗標
                break; // 跳出迴圈
            }
            i++; // 下一個元素
        }
        if (!is_found2) { // 如果沒找到
            System.out.println("沒找到目標...");
        }

    }

}
