package Week1.BMICalc;

import java.util.Scanner;

public class BmiCalc {
    public static void main(String[] args) {
        // Variables
        double height, weight, bmi;

        Scanner input = new Scanner(System.in); //Scanner object

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        height = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = input.nextDouble();

        bmi = weight / (height * height); // Body mass index formula

        System.out.println("Vücut Kitle İndeksiniz : " + bmi); //BMI printed.
    }
}