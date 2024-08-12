package topic03_0726;

////////////////////////////////////////////////////
import java.util.*;         //使用Arrays.sort
////////////////////////////////////////////////////

public class t_Sort_BobbleSort {
    public static void main(String[] args) {

        int[] a = {2, 3, 1, 10 , 100, 43, 33};
        int[] d, e;

        ////////////////////////////////////////////////////
        // 直接使用現成sort
        d = a.clone();
        Arrays.sort(d);     
        System.out.println("使用現成sort\nd = " + Arrays.toString(d));
        
        ////////////////////////////////////////////////////
        // Bobble Sort 氣泡排序法
        e = a.clone();
        int n = e.length;
        // 從 開頭 ~ (n-1)
        for(int i = 0; i < n - 1; i++) {
            // 從 (開頭+1) ~ n
            for(int j = i + 1; j < n; j++){
                // 小到大(如果前面 大於 後面)
                if(e[i] > e[j]) {
                    // SWAP 交換
                    int tmp = e[i];
                    e[i] = e[j];
                    e[j] = tmp;
                }
            }
        }
        System.out.println("使用Bobble Sort\ne = " + Arrays.toString(e));

    }

}
