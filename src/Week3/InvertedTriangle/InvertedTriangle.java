package Week3.InvertedTriangle;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int column= input.nextInt();

        for (int i=0;i<column;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");

            }
            for (int j=0;j<(column-i)*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
