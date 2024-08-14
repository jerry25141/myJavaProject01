package java_middle_quiz.lesson01;

//JPA107 運動成績
//(1) 本題使用其他類別定義的類別方法。
//(2) 假設老師在計算運動成績的分數時，動作佔 1 分，技巧佔 2 分，團隊表現佔 3 分。
//(3) basketball 的分數計算方式為：動作 (action) + 技巧 (skill) + 團隊表現 (teamgame)；
//    baseball 的分數計算方式為：10 + 技巧 (skill) + 團隊表現 (teamgame)。
//(4) JPD01.java 內已提供 basketball 與 baseball 兩個類別及成績的計算方式，
//    它們各有一個 calGrade 方法，請將此方法於 basketball 與 baseball 兩個類別中補上。
//-------------------------------------------------------------------------------------------
//public class JPD01 {
//public static void main(String argv[]) {
//    int action = 1, skill = 2, teamgame = 3;
//    System.out.println("The basketball grade is " + Basketball.calGrade(_____________________));
//    System.out.println("The baseball grade is " + _______________(________________________));
//}
//}
//class Basketball {
//......   {
//    return a + s + t;
//}
//}
//class Baseball {
//......   {
//    return 10 + s + t;
//}
//}
//---------------------------------------------------------------------------------------------
//(5) 程式執行時直接計算成績，並輸出 basketball 及 baseball 的成績，顯示如執行結果參考畫面。
//-----------------------------------------------------------------------------------------
// The basketball grade is 6
// The baseball grade is 15

public class quiz01_07 {
//////////////////////////////////////////////////////
    public static void main(String argv[]) {
        int action = 1, skill = 2, teamgame = 3;
        System.out.println("The basketball grade is " + Basketball.calGrade(action, skill, teamgame));
        System.out.println("The baseball grade is " + Baseball.calGrade(skill, teamgame));
    }
//////////////////////////////////////////////////////
}
//////////////////////////////////////////////////////
class Basketball {
    // 回傳 籃球計算
    public static int calGrade(int a, int s, int t) {
        return a + s + t;
    }
}
//////////////////////////////////////////////////////

//////////////////////////////////////////////////////
class Baseball {
    // 回傳 棒球計算
    public static int calGrade(int s, int t) {
        return 10 + s + t;
    }
}
//////////////////////////////////////////////////////
