import java.security.cert.CertPathValidatorException;
import java.util.Scanner;

public class _7_AreaOfFigures {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        double area = 0 ;


        if (type.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
             area = side * side ;


        } else if (type.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
             area = a*b ;


        }else if (type.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
             area = radius * radius * Math.PI ;


        } else if (type.equals("triangle")) {
            double base = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
             area = base * height / 2 ;

        }

        System.out.printf( "%.3f", area );
    }
}