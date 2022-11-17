package Week3.RecPow;

import java.util.Scanner;

public class RecPow { //üs alma metodu tanımı
    static int pow(int floor, int pw){
        if(pw==0){//eğer üs 0 sa 1 döner
            return 1;
        }
        if(pw!=1){// üs 1 değilse pow çağırılır
            return floor*pow(floor,pw-1);
        }
        else {//1 se taban değeri döner
            return floor;
        }
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int floor= input.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int pw= input.nextInt();

        System.out.println("Sonuç: "+ pow(floor,pw));

    }
}
