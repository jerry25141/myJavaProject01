package topic_java_code.topic0726;

public class t_2dim_array {
    public static void main(String[] args) {
        
        // 建立並使用 2維陣列
        int x = 3, y = 4;
        int[][] nums = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12},
        };

        ////////////////////////////////////////////////////
        // 直行橫列 x行 y列
        // y = i; x = j
        // 列在外 = i
        for(int i = 0; i < y; i++) {
            // 行在內 = j
            for(int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
}
