package Week3.Harmonic;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N değerini giriniz : ");
        int value = input.nextInt();

        double sum = 0d;

        for (int i = 1; i <= value; i++)
            sum += 1d/i;

        System.out.println("Sonuç : " + sum);
    }

}
