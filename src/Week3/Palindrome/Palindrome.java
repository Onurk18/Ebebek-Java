package Week3.Palindrome;

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(int value){
        int reversed = 0, remainder, original = value;

        while (value != 0)
        {
            remainder = value % 10;
            reversed = reversed * 10 + remainder;
            value /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int value = input.nextInt();

        System.out.println("Sayı " + ((isPalindrome(value)) ? "palindromdur." : "palindrom değildir."));
    }
}
