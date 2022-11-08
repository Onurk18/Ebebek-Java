package Week1.AvarageGrade;
import java.util.Scanner;

public class AvarageGrade {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Matematik: ");
        float mat=input.nextFloat();

        System.out.print("Fizik: ");
        float fiz=input.nextFloat();

        System.out.print("Kimya: ");
        float kim=input.nextFloat();

        System.out.print("Turkce: ");
        float tur=input.nextFloat();

        System.out.print("Tarih: ");
        float tar=input.nextFloat();

        System.out.print("Muzik: ");
        float muz=input.nextFloat();

        float avg=(muz+mat+kim+fiz+tur+tar)/6;

        System.out.println("Ortalamanız: "+avg);

        System.out.println(avg>60? "Sınıfı Geçti":"Sınıfta Kaldı");
    }
}


