package Week3.Power;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, pow , sum = 1;

        System.out.print("Tabanı giriniz : ");
        number = input.nextInt();
        System.out.print("Üssü giriniz : ");
        pow = input.nextInt();

        for (int i = 0; i < pow; i++)
        {
            sum *= number;
        }

        System.out.println("Sonuç : " + sum);
    }
}
