package topic0726;

public class t_9x9 {
    public static void main(String[] args) {
        // 巢狀迴圈用於控製乘法錶的行和列
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                // 格式化輸出，讓乘法錶看起來更整齊
                System.out.printf("%d x %d = %d\t", j, i, i * j);
            }
            // 每行結束換行
            System.out.println();
        }
    }
}
