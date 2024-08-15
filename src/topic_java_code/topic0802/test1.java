package topic_java_code.topic0802;

public class test1 {

/////////////////////////////////////////////
    public static void main(String[] args) {
        // 字串反轉輸出 //
        String str1 = "這是一組字串";

        System.out.println(str1);
        System.out.println(reverse(str1));
        System.out.println(reverse2(str1));
    }
/////////////////////////////////////////////
    static String reverse(String str) {
        // StringBuffer 多線程(多線程安全), StringBuilder 單線程(單線程較快)
        // CharAt
        StringBuilder newStr = new StringBuilder();
        int n = str.length();
        // i 從 (n-1) ~ 0
        for(int i = n-1; i >= 0; i--) {
            // 從str後面，依序取得char放入newStr
            newStr.append(str.charAt(i));
            //newStr += str.charAt(i); 【吃大量記憶體，不好用】
        }
        //  方法1. 回傳 轉換StringBuilder toString
        return newStr.toString();
    }
/////////////////////////////////////////////
    static String reverse2(String str) {
        // 輸入的 str 轉換成 newStr
        StringBuilder newStr = new StringBuilder(str);
        // 方法2. 使用內建 reverse() 函數
        return newStr.reverse().toString();
    }
/////////////////////////////////////////////

}
