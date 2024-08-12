package topic03_0726;

public class t_switch_case {
    public static void main(String[] args) {
        // 宣告一個代表星期幾的變數 (1-7)
        int day = 4;

        // 使用 switch 判斷式來決定星期幾，根據 'day' 變數的值
        switch (day) {
            case 1:
                // 如果 'day' 是 1，印出 "星期一"
                System.out.println("星期一");
                break;
            case 2:
                // 如果 'day' 是 2，印出 "星期二"
                System.out.println("星期二");
                break;
            case 3:
                // 如果 'day' 是 3，印出 "星期三"
                System.out.println("星期三");
                break;
            case 4:
                // 如果 'day' 是 4，印出 "星期四"
                System.out.println("星期四");
                break;
            case 5:
                // 如果 'day' 是 5，印出 "星期五"
                System.out.println("星期五");
                break;
            case 6:
                // 如果 'day' 是 6，印出 "星期六"
                System.out.println("星期六");
                break;
            case 7:
                // 如果 'day' 是 7，印出 "星期日"
                System.out.println("星期日");
                break;
            default:
                // 如果 'day' 不是 1 到 7 之間的值，印出錯誤訊息
                System.out.println("無效的日期值");
                break;
        }
    }
}
