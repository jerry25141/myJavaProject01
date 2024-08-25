package java_middle_quiz.lesson05;

// JPA510 二分搜尋法
//(1) 程式內有已排序資料 {5, 9, 13, 15, 17, 19, 25, 30, 45}，請使用二分搜尋法尋找輸入的資料。
//(2) 程式連續執行兩次，於程式執行時，如執行結果參考畫面 (1) 所示，顯示【請輸入要找尋的資料：】，要求輸入欲尋找的資料 n。
//(3) 若沒有搜尋到相符的數值，顯示【n 不在陣列中】，將欲尋找的資料代入 n，如執行結果參考畫面 (2) 所示。
//(4) 尋找時，列出尋找區間及此區間的中間值，搜尋幾次就列出幾項，最後產出【經過 y 次的尋找】，y 代入搜尋次數：
//    若有搜尋到相符的數值，請顯示【您要找的資料在陣列中的第 x 個位置】，x 代入輸入值，此數值位於在陣列中的第幾個位置，
//    如執行結果參考畫面 (3) 所示。

// 請輸入要找尋的資料：2
// 尋找區間：0(5)..8(45),中間：4(17)
// 尋找區間：0(5)..3(15),中間：1(9)
// 尋找區間：0(5)..0(5),中間：0(5)
// 經過 3 次的尋找
// 2不在陣列中
// 請輸入要找尋的資料：30
// 尋找區間：0(5)..8(45),中間：4(17)
// 尋找區間：5(19)..8(45),中間：6(25)
// 尋找區間：7(30)..8(45),中間：7(30)
// 經過 3 次的尋找
// 您要找的資料在陣列中的第7個位置

//////////////////////////////////////////////////////
import java.util.*;

//////////////////////////////////////////////////////
public class quiz05_010 {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        test();
        test();
    }

    public static void test() {
        int[] A = { 5, 9, 13, 15, 17, 19, 25, 30, 45 };
        int n = A.length;

        // Input 使用者輸入搜尋
        System.out.print("請輸入要找尋的資料：");
        int target = myScanner.nextInt();
        int result = binarySearch(A, target, 0, n - 1); // 初始化 left=0,right=n-1

        if (result == -1)
            System.out.println(target + " 不在陣列中");
        else { // (result + 1) 是因為 i = 0
            System.out.println("您要找的資料在陣列中的第 " + (result + 1) + " 個位置");
        }
    }

    //////////////////////////////////////////////////////
    // Binary Search 二元搜尋法
    public static int binarySearch(int[] A, int target, int left, int right) {
        int count = 0; // 計算搜尋次數

        while (left <= right) {
            count++;

            // 切一半
            int mid = left + ((right - left) / 2);
            System.out.println(
                "尋找區間：" 
                + left  + "(" + A[left] + ").." 
                + right + "(" + A[right] + "),中間：" 
                + mid   + "(" + A[mid] + ")"
                );

            // 判斷
            if (A[mid] == target) {
                System.out.println("經過 " + count + " 次的尋找");
                return mid;
            } else if (A[mid] < target) { // 在左邊
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // 如果都找不到
        System.out.println("經過 " + count + " 次的尋找");
        return -1; // 不存在
    }
    //////////////////////////////////////////////////////
}
