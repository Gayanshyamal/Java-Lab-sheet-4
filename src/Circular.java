import java.util.Scanner;

public class Circular {

    public int ri,ro;
    final double PI = 3.14;

    public void setRaduis(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter inner circular radius:");
        ri = scanner.nextInt();
        System.out.print("Enter outer circular radius:");
        ro = scanner.nextInt();
    }

    public void computeArea(){
        double AI = PI * Math.pow(ri,2);
        double AO = PI * Math.pow(ro,2);

        System.out.println("Inner circular Area is : "+AI);
        System.out.println("Outer circular Area is : "+AO);
        System.out.println("Area of circular region : "+(AO - AI));
    }

    public void computeCircumference(){
        double CI = 2 * PI * ri;
        double CO = 2 * PI * ro;

        System.out.println("Inner circular Circumference is : "+CI);
        System.out.println("Outer circular Circumference is : "+CO);
    }






}
