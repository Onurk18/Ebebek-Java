package Week3.Diamond;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz: ");
        int n = input.nextInt();
        System.out.println();

        for(int i = n; i > 0; i--)
        {
            for(int j = n-i; j > 0; j--)
                System.out.print(" ");

            for (int j = 2*i - 1; j > 0; j--)
                System.out.print("*");

            System.out.println();
        }
    }

}
