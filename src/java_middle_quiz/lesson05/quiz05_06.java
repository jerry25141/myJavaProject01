package java_middle_quiz.lesson05;

// JPA506 三維陣列元素之和
//(1) 設陣列 A 的維度為 4 * 2 * 3，設在程式碼裡宣告此一陣列，並在宣告同時設定初值，
// 然後計算陣列 A 內所有元素的總和 (SUM)。
//    int A[][][] = {{{1,2,3},{4,5,6}},
//                  {{7,8,9},{10,11,12}},
//                  {{13,14,15},{16,17,18}},
//                  {{19,20,21},{22,23,24}}}

// sum = 300

//////////////////////////////////////////////////////
import java.util.*;
//////////////////////////////////////////////////////
public class quiz05_06 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int A[][][] = {
            {{1,2,3},{4,5,6}},
            {{7,8,9},{10,11,12}},
            {{13,14,15},{16,17,18}},
            {{19,20,21},{22,23,24}}
        };

        // Sum 取出計算 A[4][2][3]
        // i 控制第一個維度，代表「層」。
        // j 控制第二個維度，代表「行」。
        // k 控制第三個維度，代表「列」。
        int sum = 0;
        for(int i=0;i<4;i++)
            for(int j=0;j<2;j++)
                for(int k=0;k<3;k++)
                    sum += A[i][j][k];
        // Output
        System.out.println("sum = " + sum);
        
    }
}
