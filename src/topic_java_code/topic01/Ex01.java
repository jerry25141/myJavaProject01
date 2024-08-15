package topic_java_code.topic01;
////////////////////////////////////////////////////////
import java.util.Scanner;
////////////////////////////////////////////////////////

public class Ex01 {

    public static void main(String[] args) {
        System.out.println("CodeStarting");
////////////////////////////////////////////////////////
        // 建立 Scanner 物件來輸入資料
        Scanner myScanner = new Scanner(System.in);

////////////////////////////////////////////////////////
        System.out.println("請輸入姓名:");
        // 使用者輸入資訊
        String userName = myScanner.nextLine();
        System.out.println("你的名字是: " + userName);
////////////////////////////////////////////////////////
        System.out.println("請輸入年紀:");
        // 使用者輸入資訊
        int userAge = myScanner.nextInt();
        
        // 使用 try catch 避免錯誤程式碼(懶得防呆)
        try {
            if(userAge > 0 && userAge <= 100) {
                System.out.println("你的年紀是: " + userAge);
            }
            else {
                System.out.println("你年齡怪怪der");
            }
        } catch (Exception e) {
            System.out.println("輸入錯誤...");
        }
    

    }

////////////////////////////////////////////////////////
}
