package topic_java_code.topic0806;

import java.util.*;

class Circle {
    public int r;
    public double pi;

    public void area(int r) {
        System.out.print("園面積為:" + r * r * Math.PI);
    }

    public void circumference(int r) {
        System.out.print("園面積為:" + r * 2 * Math.PI);
    }
}

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("請輸入r:");
        int r = sc.nextInt();
        c.area(r);
        c.circumference(r);
    }
}