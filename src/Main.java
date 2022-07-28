import hinhchunhat.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai");
        double width = scanner.nextDouble();
        rectangle.setWidth(width);
        System.out.println("nhap chieu cao");
        double height = scanner.nextDouble();
        rectangle.setHeight(height);
        System.out.println(rectangle.toString());

//        System.out.println("dien tich  " + rectangle.getArea() + "met vuong");
//        System.out.println(" chu vi la " + " :" + rectangle.getPerimeter() + "met");

    }


}