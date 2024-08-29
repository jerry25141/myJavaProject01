package java_middle_quiz.middle_quiz;

import java.util.Scanner;

public class quiz1 {
    public static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        main_game();
    }

    public static void main_game() {
        System.out.println("猜數字Game開始，請輸入1~100的數字:");
        System.out.println("===============================");
        boolean is_continue = true;

        while (is_continue) {
            boolean is_play = true;
            int input = 0;
            int ans = (int) (Math.random() * 100) + 1;

            while (is_play) {
                System.out.println("請輸入數字(輸入-11結束此回合):");

                // Input //
                try {
                    input = myScanner.nextInt();
                } catch (Exception e) {
                    System.out.println("輸入錯誤!!");
                }

                // 是否結束? //
                if (input == -11) {
                    is_play = false;
                    is_continue = false;
                } else if (input <= 100 && input >= 1) {
                    // System.out.println("ans = " + ans); // 測試答案
                    // 主要遊戲內容 //

                    if (input == ans) {
                        my_you_win();
                        is_play = false;
                    } else if (input > ans)
                        System.out.println("【太大】");
                    else
                        System.out.println("【太小】");
                }
                // 輸入錯誤警告 //
                else
                    System.out.println("\n !!! 數字必須在 1~100 之間 !!! \n");
            }

            // 詢問是否繼續 //
            System.out.println("請問要繼續玩嗎?(輸入1/0 繼續/結束)");
            // Input //
            try {
                input = myScanner.nextInt();
                if (input == 0)
                    is_continue = false;
            } catch (Exception e) {
                System.out.println("輸入錯誤!!");
            }
        }
    }
    public static void my_you_win() {
        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        System.out.println("!! 恭喜答對 q(≧▽≦q) !!");
        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWW");
    }
}
