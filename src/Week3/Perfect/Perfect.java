package Week3.Perfect;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// Scanner nesnesi oluşturuldu
        int value, sum;
        System.out.print("Bir sayı giriniz : ");
        value = input.nextInt();
        sum = (value == 1) ? 0 : 1;//1 kontrol edildi

        for (int i = 2; i < value; i++)
        {
            sum+=(value%i==0)? i:0;//çarpanlar toplandı
        }

        if(value == sum)
            System.out.println(value + " Mükemmel sayıdır");
        else
            System.out.println(value + " Mükemmel sayı değildir");
    }

}
