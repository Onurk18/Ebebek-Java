package Week3.Foursum;

import java.util.Scanner;

public class Foursum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int value,sum=0;
        do {
            value= input.nextInt();
            sum+=value%4==0? value: 0;

        }while (value%2!=1);
        System.out.println(sum);




    }
}
