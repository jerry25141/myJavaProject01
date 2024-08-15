package topic0719;
import java.util.Arrays;
////////////////////////////////////////////////////
import java.util.Scanner;
////////////////////////////////////////////////////
public class Ex04_2 {
    public static void main(String[] args) {
////////////////////////////////////////////////////
        // 初始化 輸入資料
        System.out.println("陣列初始化:");
        int[] scores = new int[] {60, 70, 80, 90, 100};
        char[] names = new char[] {'A', 'B', 'c', '1', '2', '3'};
        Double[] mydoubles = new Double[] {1.1, -5.5, 0.0};
        // 3 種 不同印出 arrays 方法
        // !重要!基本 印出 scores
        for(int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + ",");
        }

        // 印出 names
        System.out.println(Arrays.toString(names));

        // 印出 doubles
        for (Double tmp : mydoubles) {
            System.out.print(tmp + ",");;
        }
        System.out.println();

////////////////////////////////////////////////////
    }

}
