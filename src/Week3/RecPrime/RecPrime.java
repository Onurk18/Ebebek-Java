package Week3.RecPrime;

import java.util.Scanner;

public class RecPrime {
    static boolean isPrime(int x,int count){
        if(count*count<=x){
            return x%count!=0 && isPrime(x,count+1);
        }
        else {
            return true;
        }

    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int x= input.nextInt();
        System.out.println(x+" sayısı "+(isPrime(x,2)?"asaldır":"asal değildir"));
    }
}
