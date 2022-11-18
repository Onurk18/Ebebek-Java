package Week3.RecPow;

import java.util.Scanner;

public class RecPow { //üs alma metodu tanımı
    static int pow(int base, int pw){
        if(pw!=0){//eğer üs 0 değilse pw base üsün bir düşük olduğula çarpılır
            return base*pow(base,pw-1);
        }


        else {//eğer üs 0 sa 1 döner
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int base= input.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int pw= input.nextInt();

        System.out.println("Sonuç: "+ pow(base,pw));

    }
}
