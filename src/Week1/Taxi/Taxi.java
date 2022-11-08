package Week1.Taxi;

import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        double km,tl;

        Scanner input=new Scanner(System.in);

        System.out.print("Gidilen km'yi giriniz: ");
        km=input.nextDouble();
        tl=10+2.2*km;
        System.out.printf("Toplam Tutar: %.2f TL",(tl<20? 20:tl));
    }
}
