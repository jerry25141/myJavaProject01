package topic0719;
/////////////////////////////////////////
import java.util.Scanner;
/////////////////////////////////////////

public class Ex02 {
    
    /////////////////////////////////////////
    /////////////////////////////////////////


    public static void main(String[] args) {

        /////////////////////////////////////////
        // 
        Scanner myScanner = new Scanner(System.in);

        // 
        int Basic_Price = 1000;

        /////////////////////////////////////////
        // 
        // for(int i = 1; i < 10 ; i++) {
        //     // System.out.println(i);

        //     System.out.print(i + " ");
        // }

////////////////////////////////////////////////////
        // while(條件成立)
        // ex:1~9, += 1
        int i = 1;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }
        // 1 2 3 4 5 6 7 8 9 
        System.out.println();

        // ex:50~0, /= 5 
        int j = 50;
        while (j >= 0) {
            if(j == 0) {
                break;
            }
            System.out.print(j + " ");
            j /= 5;
        }
        // 50 10 2 
        System.out.println();

        // ex:1~100, *= 10
        int k = 1;
        while (k <= 100) {
            System.out.print(k + " ");
            k *= 10;
        }
        // 1 10 100
        System.out.println();

        

        
        
        /////////////////////////////////////////
        
    }


}
