package Week3.FourFivePower;

import java.util.Scanner;

public class FourFivePower {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int i,j,target= input.nextInt();
        System.out.println(1);
        for(i=4,j=5;i<target;i*=4,j*=5){
            System.out.println(i);
            System.out.println(j<target?j:"");
        }

    }
}
