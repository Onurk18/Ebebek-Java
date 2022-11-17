package Week3.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// scanner nesnesi oluşturuldu
        System.out.print("Eleman sayısını girin : ");
        int n = input.nextInt();

        int a = 0,b = 1;
        for (int i = 0; i < n; i++)
        {
            System.out.println(a); //a ve b değişkenleri kullanılarak fibonacci dizisi oluşturuldu
            b = b + a;
            a = b - a;
        }
    }
}
