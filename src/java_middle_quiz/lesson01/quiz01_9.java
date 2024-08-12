package java_middle_quiz.lesson01;

//JPA109 變數範圍
//(1) 請依照 JPD01.java 所提供的程式，回傳正確值。
//(2) gameRating 函數需呼叫 adder 方法以取得正確的加總值。
//(3) adder 方法的計算方式為：skill + action + excitement。
//(4) 輸出回傳的正確值，顯示如執行結果參考畫面。
//-----------------------------------------------------------------------------
//The rating of the game is 23
//-----------------------------------------------------------------------------
//public class JPD01 { 
//public static int adder (__________________) { 
//    return _______________;                                    
//} 
//public static int gameRating (int s, int a, int e) { 
//    return adder(__________________);                                      
//} 
//public static void main (String argv[]) { 
//    int skill = 6, action = 9, excitment = 8, result; 
//    result = gameRating(skill, action, excitment); 
//    System.out.print("The rating of the game is "); 
//    System.out.println(result);                        
//} 
//}

// 這...就修正而已...，好吧還是有點難(°ロ°)
public class quiz01_9 {
    // 填空1 //
    // public static int adder (_______________) {
    public static int adder(int s, int a, int e) {
        // 填空2 //
        // return _______________;
        return (s + a + e);
    }

    public static int gameRating(int s, int a, int e) {
        // 填空3 //
        // return adder(_______________);
        return adder(s, a, e);
    }

    public static void main(String argv[]) {
        int skill = 6, action = 9, excitement = 8, result;
        result = gameRating(skill, action, excitement);
        System.out.print("The rating of the game is ");
        System.out.println(result);
    }
}
