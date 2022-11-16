package Week2.Zodiac;

import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day, month, sumDay = 0;
        String result;

        System.out.print("Doğduğunuz ayı giriniz : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz : ");
        day = input.nextInt();

        if(month==3&&day>20||month==4&&day<21){
            System.out.println("Koç");
        }
        else if(month==4&&day>20||month==5&&day<22){
            System.out.println("Boğa");
        }
        else if (month==5&&day>21||month==6&&day<23){
            System.out.println("İkizler");
        }
        else if (month==6&&day>22||month==7&&day<23){
            System.out.println("Yengeç");
        }
        else if (month==7&&day>22||month==8&&day<23){
            System.out.println("Aslan");
        }
        else if (month==8&&day>22||month==9&&day<23){
            System.out.println("Başak");
        }
        else if (month==9&&day>22||month==10&&day<23){
            System.out.println("Terazi");
        }
        else if (month==10&&day>22||month==11&&day<22){
            System.out.println("Akrep");
        }
        else if (month==11&&day>21||month==12&&day<22){
            System.out.println("Yay");
        }
        else if (month==12&&day>21||month==1&&day<22){
            System.out.println("Oğlak");
        }
        else if (month==1&&day>21||month==2&&day<20){
            System.out.println("Kova");
        }
        else {
            System.out.println("Balık");
        }
    }
}