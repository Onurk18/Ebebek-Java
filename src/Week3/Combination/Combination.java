package Week3.Combination;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int sum = 1, n,r;
        Scanner input = new Scanner(System.in);

        System.out.print("n?: ");
        n = input.nextInt();
        System.out.print("r?: ");
        r = input.nextInt();

        for(int i = n; i > 0; i--)
        {
            sum *= i;

            if((n-r) >= i)
                sum /= i;
            if(r >= i)
                sum /= i;
        }

        System.out.println(sum);
    }

}
