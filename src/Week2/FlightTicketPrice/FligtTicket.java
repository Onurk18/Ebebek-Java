package Week2.FlightTicketPrice;

import java.util.Scanner;

public class FligtTicket {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); //Scanner nesne oluşturuldu

        double km,price; // Mesafe, fiyat değişkeni
        int age,type; //Yaş,yön değişkeni

        System.out.print("Mesafeyi Km türünden giriniz: ");
        km= input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        age= input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type= input.nextInt();

        if((type==1||type==2)&&age>0&&km>0){ //Hata yoksa ife girer
            price=km*0.10; //km başına 0.10TL ile fiyat hesaplar
            price =(age<12)? price*0.5 : (age<24)? price*0.9 : (age>65)? price*0.7 : price; //kişinin yaşına göre indirim yapar.

            price =(type==2)? price*0.8 : price; //Yolculuk tipine göre indirim yapar.

            System.out.println("Toplam tutar: "+ price);

        }
        else { //hata varsa çalışır
            System.out.println("Hatalı veri girdiniz!");
        }
    }
}
