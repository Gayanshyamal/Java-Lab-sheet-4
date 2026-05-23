public class Temperature {

    private static double celsius,fahrenheit;

    public Temperature(){

    };
    public Temperature(double celsius){

    };

    public double getCelsius() {
        return celsius;
    };

    public double getFahrenheit() {
        return fahrenheit;
    };

    public double setCelsius(double fahrenheit) {
        Temperature.celsius = (fahrenheit - 32)* 5/9;
        return celsius;
    }

    public double setFahrenheit(double celsius) {
        Temperature.fahrenheit = celsius * 9/5 + 32;
        return fahrenheit;
    }
}