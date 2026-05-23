import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your temperature(Celsius):");
        double c = scanner.nextDouble();

        Temperature temp = new Temperature();

        temp.setFahrenheit(c);
        System.out.println(temp.getFahrenheit());

    }
}
