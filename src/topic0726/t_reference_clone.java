
package topic0726;
////////////////////////////////////////////////////
import java.util.Arrays;
////////////////////////////////////////////////////
public class t_reference_clone {

    public static void main(String[] args) {

        ////////////////////////////////////////////////////
        // reference 參考 
        int[] c = {2, 3, 1};
        int[] d;    // 沒有定義資料，記憶體沒有分配空間

        System.out.println("reference 參考 ");
        // d reference c
        d = c;      // d的指標，指到c陣列的開頭[2,3,1]
        System.out.println("c =\t" + Arrays.toString(c) + "\td =\t" + Arrays.toString(d));

        d[1] = 10;  // 意思是，修改d[1]指到的陣列資料，也就是c[1]的陣列資料
        System.out.println("c =\t" + Arrays.toString(c) + "\td =\t" + Arrays.toString(d));

        ///////////////////"/////////////////////////////////
        // clone 複製
        int[] c2 = {2, 3, 1};
        int[] d2;
        
        System.out.println("\nclone 複製");
        // clone 克隆一份資料，獨立於c2的記憶體空間
        d2 = c2.clone();
        System.out.println("c2 =\t" + Arrays.toString(c2) + "\td2 =\t" + Arrays.toString(d2));

        d2[1] = 100;  // 意思是，修改d2[1]指到的陣列資料，也就是d2[1]的陣列資料
        System.out.println("c2 =\t" + Arrays.toString(c2) + "\td2 =\t" + Arrays.toString(d2));

    }

    
}
