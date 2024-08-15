package topic_java_code.topic01.quiz1;

////////////////////////////////////////////////////////
import java.util.Scanner;
////////////////////////////////////////////////////////

public class myJavaQuiz1 {
    ////////////////////////////////////////////////////////

    // JPA106 數學函數
    public static double fun1(double x) {
        return (3 * (Math.pow(x, 3)) + 2 * x - 1);
    }
    
    ////////////////////////////////////////////////////////
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////
        Scanner myScanner = new Scanner(System.in);

        // JPA102 單位換算 //
        System.out.println("======\nJPA102 單位換算\nPlease input:");
        double input_kg = myScanner.nextInt();

        double ans2 = input_kg * 2.20462;
        System.out.printf("ex:%.6f公斤 = %.6f磅", input_kg, ans2);

        // JPA103 計算平均值 //
        System.out.println("======\nJPA103 計算平均值\nPlease input:");
        double input_ans3_1 = Integer.parseInt(myScanner.next());
        double input_ans3_2 = Integer.parseInt(myScanner.next());
        double input_ans3_3 = Integer.parseInt(myScanner.next());

        double ans3 = (input_ans3_1 + input_ans3_2 + input_ans3_3) / 3;

        System.out.printf("Average: %.2f", ans3);

        // JPA104 距離計算 //
        System.out.println("======\nJPA104 距離計算\n");
        System.out.println("請輸入 X1 Y1:");
        double x1 = Double.parseDouble(myScanner.next());
        double y1 = Double.parseDouble(myScanner.next());
        System.out.println(x1 + " " + y1);
        System.out.println("請輸入 X2 Y2:");
        double x2 = Double.parseDouble(myScanner.next());
        double y2 = Double.parseDouble(myScanner.next());
        System.out.println(x2 + " " + y2);

        double xxx = x1 - x2;
        double yyy = y1 - y2;
        double z = Math.sqrt(Math.pow(xxx, 2) + Math.pow(yyy, 2));

        System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是 %.2f", x1, y1, x2, y2, z);

        // JPA105 存錢筒 //
        System.out.println("======\nJPA105 存錢筒\n");
        System.out.println("請輸入您的姓名:");
        String name = myScanner.nextLine();

        System.out.println("Hi, " + name + ",請輸入您的銅板的個數：");
        int coin_1 = Integer.parseInt(myScanner.next());
        int coin_5 = Integer.parseInt(myScanner.next());
        int coin_10 = Integer.parseInt(myScanner.next());
        int coin_50 = Integer.parseInt(myScanner.next());
        // System.out.println( coin_1 + " " + coin_5 + " " + coin_10 + " " + coin_50 + "
        // ");

        int total = 1 * coin_1 + 5 * coin_5 + 10 * coin_10 + 50 * coin_50;

        int num_1000, num_100, num_10, num_1;

        // 2880
        num_1000 = total / 1000;
        num_100 = (total - (num_1000 * 1000)) / 100;
        num_10 = (total - (num_1000 * 1000) - (num_100 * 100)) / 10;
        num_1 = (total - (num_1000 * 1000) - (num_100 * 100) - (num_10 * 10));
        // System.out.println(num_1000);
        // System.out.println(num_100);
        // System.out.println(num_10);
        // System.out.println(num_1);

        System.out.printf("您的錢總共有：%d 千 %d 百 %d 十 %d 元", num_1000, num_100, num_10, num_1);

        // JPA106 數學函數 //
        System.out.println("======\nJPA106 數學函數\n");
        System.out.println("請輸入4個值(用enter分開):");
        double input_6_1 = Double.parseDouble(myScanner.nextLine());
        double input_6_2 = Double.parseDouble(myScanner.nextLine());
        double input_6_3 = Double.parseDouble(myScanner.nextLine());
        double input_6_4 = Double.parseDouble(myScanner.nextLine());

        System.out.printf("f(%.1f) = %.4f\n", input_6_1, fun1(input_6_1));
        System.out.printf("f(%.1f) = %.4f\n", input_6_2, fun1(input_6_2));
        System.out.printf("f(%.1f) = %.4f\n", input_6_3, fun1(input_6_3));
        System.out.printf("f(%.1f) = %.4f\n", input_6_4, fun1(input_6_4));

        // System.out.println(test2(2.2));

        // JPA107 運動成績 //
        System.out.println("======\nJPA107 運動成績\n");
        int action = 1, skill = 2, teamgame = 3;

        // 籃球
        int ans_7_1 = Basketball.calGrade(action, skill, teamgame);
        System.out.println("The basketball grade is " + ans_7_1);
        // 棒球
        int ans_7_2 = Baseball.calGrade(action, skill, teamgame);
        System.out.println("The basketball grade is " + ans_7_2);

        // JPA110 圖形面積 //
        System.out.println("======\nJPA110 圖形面積\n");

        // 記算圓形面積
        int r = 5;
        double ans_10_1 = Circle.calCircle(r);
        System.out.printf("圓形面積   : %.6f\n", ans_10_1);

        // 記算三角形面積
        int w = 10, h = 5;
        double ans_10_2 = Triangle.calTriangle(w, h);
        System.out.printf("三角形面積 : %.6f\n", ans_10_2);

        // 記算正方形面積
        int num1 = 5, num2 = 10;
        double ans_10_3 = Rectangle.calRectangle(num1, num2);
        System.out.printf("正方形面積 : %.6f\n", ans_10_3);

        // 此圖形面積
        double ansans = ans_10_1 + ans_10_2 + ans_10_3;
        System.out.printf("此圖形面積 : %.6f\n", ansans);

        ////////////////////////////////////////////////////////

    }

}
