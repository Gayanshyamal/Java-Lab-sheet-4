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

    public void setCelsius(double fahrenheit) {
        Temperature.celsius = (fahrenheit - 32)* 5/9;
    }

    public void setFahrenheit(double celsius) {
        Temperature.fahrenheit = celsius * 9/5 + 32;
    }
}