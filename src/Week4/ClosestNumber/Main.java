package Week4.ClosestNumber;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[] numbers={15,12,788,1,-1,-778,2,0};
        System.out.println("Dizi: "+Arrays.toString(numbers));

        System.out.print("Sayı giriniz: ");
        int max,min,key= input.nextInt();
        Arrays.sort(numbers);
        int loc=Arrays.binarySearch(numbers,key);

        if(loc>0){
            max=loc< numbers.length-1?loc+1:-1;
            min=loc-1;
        }
        else if(loc==0){
            max=loc+1;
            min=-1;
        }
        else {//olmayan küçük,olmayan büyük, olan arada

            max=-loc>numbers.length? -1: -loc-1;
            min=-loc-2;
        }
        System.out.println((min==-1)? "Girilen sayıdan küçük en yakın sayı: Yok": "Girilen sayıdan küçük en yakın sayı: "+numbers[min] );
        System.out.println((max==-1)? "Girilen sayıdan büyük en yakın sayı: Yok": "Girilen sayıdan büyük en yakın sayı: "+numbers[max] );






    }
}
