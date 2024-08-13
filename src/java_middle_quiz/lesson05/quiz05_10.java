package java_middle_quiz.lesson05;

// JPA510 二分搜尋法
//(1) 程式內有已排序資料 {5, 9, 13, 15, 17, 19, 25, 30, 45}，請使用二分搜尋法尋找輸入的資料。
//(2) 程式連續執行兩次，於程式執行時，如執行結果參考畫面 (1) 所示，顯示【請輸入要找尋的資料：】，要求輸入欲尋找的資料 n。
//(3) 若沒有搜尋到相符的數值，顯示【n 不在陣列中】，將欲尋找的資料代入 n，如執行結果參考畫面 (2) 所示。
//(4) 尋找時，列出尋找區間及此區間的中間值，搜尋幾次就列出幾項，最後產出【經過 y 次的尋找】，y 代入搜尋次數：
//    若有搜尋到相符的數值，請顯示【您要找的資料在陣列中的第 x 個位置】，x 代入輸入值，此數值位於在陣列中的第幾個位置，
//    如執行結果參考畫面 (3) 所示。
//---------------------------------------------------------------------------------------------
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

// import java.util.*;

// public class JPA510a {
// public static Scanner sc = new Scanner(System.in);    
//     public static void main(String[] argv) {
//         search();
//         search();
//     }    
//     public static void search() {
//         int[] data = {5, 9, 13, 15, 17, 19, 25, 30, 45}; 
//         System.out.print("請輸入要找尋的資料：");
//         int target = sc.nextInt();  
//         int low = 0, high = data.length - 1, mid = 0, time = 0;
//         boolean b = false;        
//         while(low <= high) {
//             mid = (low + high) / 2;
//             time++;
//             System.out.printf("尋找區間：%d(%d)..%d(%d),中間：%d(%d)\n", 
//                     low,data[low],high,data[high],mid,data[mid]);        	
//             if(target < data[mid]) 
//                 high = mid - 1;
//             else if(target > data[mid]) 
//                 low = mid + 1;
//             else {
//                 b = true;
//                 break;
//             }
//         }
//         System.out.printf("經過 %d 次的尋找\n", time);        
//         if(b)
//             System.out.printf("您要找的資料在陣列中的第%d個位置\n", mid);
//         else
//             System.out.printf("%d不在陣列中\n", target);
//     }
// }

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz05_10 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
}
