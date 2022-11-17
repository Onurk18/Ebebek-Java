package Week3.Armstrong;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int value = input.nextInt(), sum = 0;

        while (value != 0) {
            sum += value % 10;
            value /= 10;
        }

        System.out.println(sum);
    }
}
