package Week1.CircleArea;

import java.util.Scanner;

public class CircleArea {

    public static final double PI=3.14;

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("Yaricap: ");
        double r= input.nextDouble();
        System.out.print("Açi: ");
        double a= input.nextDouble();

        double alan= PI*r*r*a/360;
        System.out.printf("Alan: %.2f",alan );

    }
}
