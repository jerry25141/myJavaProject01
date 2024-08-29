package java_middle_quiz.middle_quiz;

public class quiz2 {
    public static void main(String[] args) {
        double sum1 = 0;
        double average = 0;
        int sum2 = 0;
        int total = 0;
        String[] name = { "小明", "小華", "小志" };
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }
        System.out.println("");
        int[][] score = {
                { 50, 60, 70 },
                { 70, 80, 90 },
                { 40, 30, 80 }
        };

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(" " + score[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < score.length; i++) {
            sum1 = 0;
            for (int j = 0; j < score[i].length; j++) {
                sum1 += score[j][i];
            }
            average = sum1 / 3;
            System.out.print(name[i] + "(行)的成績平均為:");
            System.out.printf("%.2f", average);
            System.out.print("   ");
        }
        System.out.println();

        for (int i = 0; i < score.length; i++) {
            sum2 = 0;
            for (int j = 0; j < score[i].length; j++) {
                sum2 += score[i][j];
            }
            total = sum2 / 3;
            System.out.println("各科(列)總平均為:" + total);
        }
    }
}
