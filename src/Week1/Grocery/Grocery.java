package Week1.Grocery;

import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);//Scanner nesnesi oluşturuldu
        double sum=0; //Toplam tanımlandı

        //Armut tutarı toplama eklendi
        System.out.print("Armut kaç kilo? :");
        sum+=2.14*input.nextDouble();

        //Elma tutarı toplama eklendi
        System.out.print("Elma kaç kilo? :");
        sum+=3.67*input.nextDouble();

        //Domates tutarı toplama eklendi
        System.out.print("Domates kaç kilo? :");
        sum+=1.11*input.nextDouble();

        //Muz tutarı toplama eklendi
        System.out.print("Muz kaç kilo? :");
        sum+=0.95*input.nextDouble();

        //Patlıcan tutarı toplama eklendi
        System.out.print("Patlıcan kaç kilo? :");
        sum+=5*input.nextDouble();

        System.out.println("Toplam Tutar: "+sum +" TL"); //Toplam yazdırıldı

    }
}
