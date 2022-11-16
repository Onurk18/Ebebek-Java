package Week2.Login;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String userName, password;
        String dbUserName = "patika", dbPassword = "java123";

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if(userName.equals(dbUserName) && password.equals(dbPassword))
        {
            System.out.println("Giriş Yaptınız !");
        }
        else{
            int select;
            System.out.println("Bilgileriniz Yanlış !");
            System.out.print("Şifrenizi sıfırlamak için '1'\nÇıkmak için 1'den farklı bir rakam giriniz : ");
            select = input.nextInt();

            if (select == 1) {
                while (true) {
                    input.nextLine();
                    System.out.println("Yeni şifreniz eski şifreniz ve yanlış girişiniz ile aynı olmamalıdır.");
                    System.out.print("Yeni şifrenizi giriniz : ");
                    String newPassword = input.nextLine();

                    if (newPassword.equals(password) || newPassword.equals(dbPassword)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                        break;
                    }
                }
            } else {
                System.out.println("Programadan çıkılıyor.");
            }

        }
    }
}
