package kosul;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int sayi1, sayi2, sonuc, islem;

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Sayiyi Giriniz : ");
        sayi1 = scanner.nextInt();

        System.out.print("2. Sayiyi Giriniz : ");
        sayi2 = scanner.nextInt();

        System.out.print("(1)Toplama, (2)Cikarma, (3)Carpma, (+)Bolme : ");
        islem = scanner.nextInt();

        switch(islem) {
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println(sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println(sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println(sonuc);
            case 4:
                sonuc = sayi1 / sayi2;
                System.out.println(sonuc);
                break;
            default :
                System.out.println("Gecersiz giris");
        }    }
}
