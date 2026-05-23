import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Temperature temp = new Temperature();

        System.out.println("Enter temperature in Fahrenheit:");
        double f = scanner.nextDouble();

        temp.setCelsius(f);
        System.out.println(temp.getCelsius());
    }
}
