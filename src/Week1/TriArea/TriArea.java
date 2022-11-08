package Week1.TriArea;

import java.util.Scanner;

public class TriArea {
    public static void main(String[] args) {
        double a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı giriniz : ");
        a = input.nextDouble();
        System.out.print("2. Kenarı Giriniz : ");
        b = input.nextDouble();
        System.out.print("3. Kenarı Giriniz : ");
        c = input.nextDouble();


        double u =(a+b+c)/2;
        System.out.println("ALan: " +Math.sqrt(u*(u-a)*(u-b)*(u-c)));
    }
}

