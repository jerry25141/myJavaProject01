/* 
    請利用陣列儲存以下的水果名稱，
    「apple」、「grape」、「tomato」、「banana」、「orange」，
    再設計程式，判斷「giwi」是否已儲存於陣列中。
*/

package topic0719.myJavaQuiz2.src.quiz2;
////////////////////////////////////////////////////

////////////////////////////////////////////////////

public class q_no04 {
    public static void run_question() {
        System.out.println("\n#=====================#");
        System.out.println("【Question04】");
        ////////////////////////////////////////////////////
        // 建立 fruits 陣列
        String[] fruits = new String[] { "apple", "grape", "tomato", "banana", "orange" };
        String match_str = "giwi";

        // 檢查 giwi
        int n = fruits.length;
        boolean is_match = false;
        for (int i = 0; i < n; i++) {
            if (fruits[i] == match_str)
                is_match = true;

            // 印出
            if (is_match)
                System.out.println("【" + match_str + "】存在");
            else
                System.out.println("不存在");
        }
        ////////////////////////////////////////////////////
    }

    ////////////////////////////////////////////////////
}
