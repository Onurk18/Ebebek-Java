package Week4.Frequency;

import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20}; //dizi tanımlaması

        Arrays.sort(arr);//dizi sıralandı

        System.out.println("Dizi : " + Arrays.toString(arr));
        System.out.println("Tekrar Sayilari : ");

        for (int i = 0; i < arr.length;){
            int count = 1, current = arr[i];
            while ((count + i) < arr.length && current == arr[i+count]){
                count++;
            }
            i += count;//elemanlar sayılıp bir sonraki sayıya geçildi
            System.out.println(current + " sayisi " + count+" kere tekrar edildi.");
        }


    }
}
