package Week2.LeapYear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int leapYear; //değişken tanımlaması
        Scanner input= new Scanner(System.in);//Scanner nesnesi oluşturuldu
        System.out.print("Yıl giriniz: ");
        leapYear= input.nextInt();
        if(leapYear%4==0&&leapYear%100!=0||(leapYear%100==0&&leapYear%400==0)){//ya 4'e tam bölünüp 100'e bölünmezse ya da hem 100'e hem de 400'e bölünürse ife girer.
            System.out.println(leapYear+" bir artık yıldır !");
        }
        else {
            System.out.println(leapYear+ " bir artık yıl değildir !");
        }


    }
}
