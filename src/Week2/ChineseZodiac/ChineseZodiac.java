package Week2.ChineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        int birth;//değişken tanımlama
        String zodiac;
        Scanner input= new Scanner(System.in);//Scanner nesnesi oluşturuldu

        System.out.print("Doğum yılınız: ");
        birth= input.nextInt();

        birth=birth%12;//Doğumun kalanı alınır.

        zodiac = switch (birth) {//Switch case ile zodiaca atama yapılır.
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Köpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavşan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            default -> "Koyun";
        };
        System.out.println("Çin zodyağı burcunuz: "+ zodiac);

    }
}
