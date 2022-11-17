package Week3.MaxMin;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);//scanner nesnesi oluşturuldu

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n= input.nextInt(), max, min;// kaç sayı girilceği alındı

        System.out.print("1. sayıyı giriniz: ");
        int number=input.nextInt();
        max=number;//ilk sayı alınıp max ve mine atandı
        min=number;

        for (int i=2;i<=n;i++){//for dongusuyle dizi sonraki sayıları aldı ve max veya minliği kontrol etti
            System.out.print(i+". sayıyı giriniz: ");
            number=input.nextInt();
            max=number>max? number: max;
            min=number<min? number: min;

        }
        System.out.println("En büyük sayı:"+max);
        System.out.println("En küçük sayı:"+min);


    }
}
