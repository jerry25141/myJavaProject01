package java_middle_quiz.middle_quiz;

import java.util.Random;
import java.util.Scanner;

public class quiz3 {
    public static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        test();
    }

    public static void test() {

        // 輸入要加密的文字
        System.out.println("請輸入要加密的文字：");
        String originalText = myScanner.nextLine();

        // 加密文字
        String encryptedText = encrypt(originalText);
        System.out.println("加密後的文字：\n" + encryptedText);

        // 輸入要解密的文字
        System.out.println("請輸入要解密的文字：");
        String textToDecrypt = myScanner.nextLine();

        // 解密文字
        String decryptedText = decrypt(textToDecrypt);
        System.out.println("解密後的文字：\n" + decryptedText + "\n");

    }
    ///////////////////////////////////////////////
    public static String my_user_input() {
        String input = "";
        while (true) {
            if (myScanner.hasNextLine()) {
                input = myScanner.nextLine();
                break;
            } else {
                System.out.println("輸入錯誤，請重新輸入！");
                myScanner.nextLine(); // 清除錯誤的輸入
            }
        }
        return input;
    }
    ///////////////////////////////////////////////

    public static String encrypt(String text) {
        Random random = new Random();
        int shift = random.nextInt(10) + 1;
        StringBuilder encrypted = new StringBuilder();
        encrypted.append((char) (shift + 100));

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char encryptedChar = (char) (c + shift);
            encrypted.append(encryptedChar);
        }
        return encrypted.toString();
    }

    ///////////////////////////////////////////////

    public static String decrypt(String text) {
        int shift = text.charAt(0) - 100;
        StringBuilder decrypted = new StringBuilder();

        for (int i = 1; i < text.length(); i++) {
            char c = text.charAt(i);
            char decryptedChar = (char) (c - shift);
            decrypted.append(decryptedChar);
        }
        return decrypted.toString();
    }

    ///////////////////////////////////////////////

}
