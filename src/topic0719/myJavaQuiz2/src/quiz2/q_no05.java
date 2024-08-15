/*
    設計一個陣列儲存以下的5 個數字，
    「15，65，34，23，66」，
    利用程式找出陣列中最大及最小的數據。
*/

package topic0719.myJavaQuiz2.src.quiz2;
////////////////////////////////////////////////////

////////////////////////////////////////////////////

public class q_no05 {
    public static void run_question() {
        System.out.println("\n#=====================#");
        System.out.println("【Question05】陣列中最大及最小的數據");
        ////////////////////////////////////////////////////
        //
        int[] nums = new int[] { 15, 65, 34, 23, 66 };
        int smallest = 999999; // 最小值
        int biggest = -999999; // 最大值

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int now = nums[i];

            // 如果比較大，存起來
            if (now > biggest)
                biggest = now;
            // 如果比較小，存起來
            if (now < smallest)
                smallest = now;
        }
        // output
        System.out.println("最大值 = " + biggest);
        System.out.println("最小值 = " + smallest);

    }
    ////////////////////////////////////////////////////
    //

    ////////////////////////////////////////////////////
}
