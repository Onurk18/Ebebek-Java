package Week2.Grade;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int mat, fiz, turk, kim, muz;
        double avg;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = (mat = input.nextInt()) < 101 && mat > -1 ? mat : 0;
        System.out.print("Fizik notunuzu giriniz : ");
        fiz = (fiz = input.nextInt()) < 101 && fiz > -1 ? fiz : 0;
        System.out.print("Türkçe notunuzu giriniz : ");
        turk = (turk = input.nextInt()) < 101 && turk > -1 ? turk : 0;
        System.out.print("Kimya notunuzu giriniz : ");
        kim = (kim = input.nextInt()) < 101 && kim > -1 ? kim : 0;
        System.out.print("Müzik notunuzu giriniz : ");
        muz = (muz = input.nextInt()) < 101 && muz > -1 ? muz : 0;

        avg = (mat + fiz + turk + kim + muz) / 5.0;

        if(avg < 55)
        {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        }
        else
        {
            System.out.println("Tebrikler, sınıfı geçtiniz !");
        }

        System.out.println("Ortalamanız : " + avg);
    }
}
