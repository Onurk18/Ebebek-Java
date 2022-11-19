package Week4.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size;//dizinin boyutu alınır
        System.out.print("Dizinin boyutu : ");
        size = input.nextInt();
        int[] arr = new int[size]; //dizi tanımlanır

        for (int i = 0; i < size; i++){
            System.out.print(i+1 + ". Elemanı: ");
            arr[i] = input.nextInt();//dizi elemanları alınır
        }

        for (int i = 0; i < size-1; i++){
            int index = i;
            for (int j = i+1; j < size; j++){
                if (arr[j] < arr[index]){ //en küçük elemanı bulur
                    index = j;
                }
            }
            int temp = arr[i];// yer değiştirir
            arr[i] = arr[index];
            arr[index] = temp;
        }

        System.out.println("Siralama : "+ Arrays.toString(arr));
    }
}
