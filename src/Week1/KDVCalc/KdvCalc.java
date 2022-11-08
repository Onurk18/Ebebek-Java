package Week1.KDVCalc;

import java.util.Scanner;

public class KdvCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double fiyat, kdvliTutar, kdvTutar;

        System.out.print("Tutarı giriniz : ");
        fiyat = input.nextDouble();

        kdvTutar = fiyat* ((fiyat>1000)? 0.08:0.18);
        kdvliTutar = fiyat + kdvTutar;

        System.out.println("Kdv'siz Fiyat : "+fiyat);
        System.out.println("Kdv Tutarı : " + kdvTutar);
        System.out.println("Kdv'li Tutar : " + kdvliTutar);

    }
}
