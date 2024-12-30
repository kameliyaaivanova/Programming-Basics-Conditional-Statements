import com.sun.jdi.connect.Connector;

import java.util.Scanner;

public class _7_1_Area {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeFigure = scanner.nextLine();

        if ( typeFigure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            double area = side * side ;
            System.out.println(area);
        } else if (typeFigure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = a * b ;
            System.out.println(area);
        } else if (typeFigure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double area = radius * radius * Math.PI ;
            System.out.println(area);
        } else if (typeFigure.equals("triangle")) {
            double base = Double.parseDouble(scanner.nextLine());
            double hight = Double.parseDouble(scanner.nextLine());
            double area = base * hight / 2 ;
            System.out.println(area);
        }


    }
}
