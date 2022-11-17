package Week3.Avg34;

import java.util.Scanner;

public class Avg34 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sum=0, count=0, target= input.nextInt();



        for (int i=0;i<=target;i++){
            if(i%4==0&&i%3==0){
                sum+=i;
                count++;
                System.out.println(count);
            }
        }
        double avg=(double)sum/count;
        System.out.println("Ortalama: "+avg);
    }
}
