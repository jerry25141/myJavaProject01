
package topic0726;
////////////////////////////////////////////////////
import java.util.Scanner;
////////////////////////////////////////////////////
public class t_adds_arrays {

    public static void main(String[] args) {

        // 嘗試輸入10個以內的數值
        int[] nums = new int[10];
        System.out.println("請輸入10個以內的值(enter,\"\"空值結束)");
        try {

            Scanner myScanner = new Scanner(System.in);

            for (int i = 0; i < nums.length; i++) {
                String tmp = myScanner.nextLine();
                if (tmp == "")
                    break;
                nums[i] = Integer.parseInt(tmp);
            }

            System.out.println(adds(nums));

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    // !!! 重點函數 adds
    // 不確定輸入數量，用這種寫法來輸入多個值~
    static int adds(int... a) {
        int total = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            total += a[i];
        }
        return total;
    }

}
