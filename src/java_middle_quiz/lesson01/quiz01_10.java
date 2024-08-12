package java_middle_quiz.lesson01;
//JPA110 圖形面積

//(1) 請撰寫三個方法計算圓形、三角形和長方形圖形的面積，並輸出總面積。
//(2) 假設圓的半徑 = 5，PI = 3.1415926，請寫出 calCircle 函數計算圓面積。
//(3) 圓面積計算公式：半徑平方 * 圓周率 (PI)。
//(4) 三角形的底 = 10，高 = 5，請寫出 calTriangle 函數計算三角形面積。
//(5) 三角形面積計算公式：底 * 高 / 2。
//(6) 假設長方形的長 = 5，寬 = 10，請寫出 calRectangle 函數計算方形面積。
//(7) 長方形面積計算公式：長 * 寬。
//(8) 圖形面積 = 圓面積 + 三角形面積 + 長方形面積。
//(9) 顯示如執行結果參考畫面。
//--------------------------------------------------------------
// 圓形面積為：78.539815
// 三角形面積為：25.000000
// 方形面積為：50.000000
// 此圖形面積為：153.539815
//--------------------------------------------------------------

//import java.util.Scanner;
//public class JPD01 {
//    public static void main(String args[]) {
//        double totalarea;
//        System.out.printf("圓形面積為：%f \n",calCircle(5));
//        System.out.printf("三角形面積為：%f \n",________________);
//        System.out.printf("方形面積為：%f \n",_______________);
//        totalarea = __________________________________________;
//        System.out.printf("此圖形面積為：%f \n",totalarea);
//    }
//    _______ ______ calCircle(_____) {
//        
//    }
//    ______ ____ calTriangle(_____________) {
//        
//    }
//    ______ ____ calRectangle(______________) {
//    }
//}

public class quiz01_10 {
    //////////////////////////////////////////////////////
    public static void main(String args[]) {
        double totalarea;

        // 假設 圓半徑 r = 5
        int r = 5;
        // 填空 1 //
        // System.out.printf("圓形面積為：%f \n", ________________);
        System.out.printf("圓形面積為：%f \n", calCircle(r));

        // 假設 三角形 w = 10, h = 5
        int T_w = 10, T_h = 5;
        // 填空 2 //
        // System.out.printf("三角形面積為：%f \n",________________);
        System.out.printf("三角形面積為：%f \n", calTriangle(T_w, T_h));

        // 假設 長方形 l = 5, w = 10
        int R_l = 5, R_w = 10;
        // 填空 3 //
        // System.out.printf("方形面積為：%f \n",_______________);
        System.out.printf("方形面積為：%f \n", calRectangle(R_l, R_w));

        // 填空 4 //
        // totalarea = __________________________________________;
        totalarea = calCircle(r) + calTriangle(T_w, T_h) + calRectangle(R_l, R_w);
        System.out.printf("此圖形面積為：%f \n", totalarea);
    }
    //////////////////////////////////////////////////////

    //////////////////////////////////////////////////////
    // 填空 5 //
    // _______ ______ calCircle(_____) {
    static double calCircle(double r) {
        // 圓形 面積 r * r * PI
        return (double) (r * r * Math.PI);
    }

    //////////////////////////////////////////////////////
    // 填空 6 //
    // ______ ____ calTriangle(_____________) {
    static double calTriangle(double w, double h) {
        // 三角形面積 (w * h) / 2
        return (double) ((w * h) / 2);
    }

    //////////////////////////////////////////////////////
    // 填空 7 //
    // ______ ____ calRectangle(______________) {
    static double calRectangle(double l, double w) {
        // 矩形面積 (w * h)
        return (double) (l * w);
    }
    //////////////////////////////////////////////////////
}
