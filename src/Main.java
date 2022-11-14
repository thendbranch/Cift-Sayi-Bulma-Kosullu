// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

        Ödev
            Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
            ortalamasını hesaplayan programı yazınız.
         */

        Scanner input = new Scanner(System.in);

        // Kullanıcının girdiği sayıya kadar çift olan sayıyı bulan program.

        /*
        System.out.print("Lütfen Sayı Giriniz : ");
        int sayi = input.nextInt();

        for (int i = 0; i < sayi; i++) {
            if (i%2==0){
                System.out.println("Çift olan sayı : " + i);
            }
        }
         */

        // Ödev :
        // Kullanıcıdan sayı girmesini isteyelim.
        System.out.print("Lütfen Sayi Giriniz : ");
        int sayim = input.nextInt();

        int toplam = 0;
        int sayOrt = 0;
        // Döngü oluşturalım.
        for (int i = 1; i < sayim ; i++) {
            // ilk koşulumuz 3'e bölünme.
            if (i % 3 == 0){
                // İkinci koşulumuz 4'e bölünme.
                if (i % 4 == 0){
                    toplam += i;
                    sayOrt++;
                }
            }
        }
        // Ortalamanın Hesaplanması.
        double sonuc = toplam / sayOrt;
        System.out.println("Koşullara göre sayıların ortalaması : " + sonuc);

    }
}