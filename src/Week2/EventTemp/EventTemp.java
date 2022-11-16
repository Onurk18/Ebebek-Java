package Week2.EventTemp;

import java.util.Scanner;

public class EventTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp;

        System.out.print("Hava sıcaklığını giriniz : ");
        temp = input.nextInt();

        if (temp <= 5)
            System.out.println("Kayak yapabilirsin!");
        else if (temp <= 15) {
            System.out.println("Sinemaya gidebilirsin!");
        } else if (temp <= 25) {
            System.out.println("Pikniğe gidebilirsin!");
        } else
            System.out.println("Yüzmeye gidebilirsin!");
    }
}
