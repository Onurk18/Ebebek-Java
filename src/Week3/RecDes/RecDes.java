package Week3.RecDes;

import java.util.Scanner;

public class RecDes {
    static void des(int x){
        if (x<1){ //eğer sayı 0 veya negatifse sadece bir kere yazılıp geri döner
            System.out.print(x+" ");
            return;

        }
        System.out.print(x+" ");
        des(x-5); // Bir iç katmana girilir
        System.out.print(x+" ");
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("N sayısı: ");
        int n= input.nextInt();
        des(n);

    }
}
