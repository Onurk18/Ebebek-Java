package Week3.Gcd;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val1, val2;
        int first,sec;
        System.out.print("Birinci sayýyý giriniz : ");
        val1 = first = input.nextInt();
        System.out.print("Ýkinci sayýyý giriniz : ");
        val2 = sec = input.nextInt();

        while (sec != 0)
        {
            int temp = first % sec;
            first = sec;
            sec = temp;
        }
        System.out.println("Ebob : " + first + "\nEkok : " + (val1*val2)/first);

    }

}
