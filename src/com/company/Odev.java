package com.company;

import java.util.Scanner;

public class Odev {

    int yas() { // s1- Kişi doğum yılını girdiğinde kişinin yaşını veren method u yazınız
        int dogumyili = 0, kisiyas = 0, buyil = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("GUNUMUZ...: ");
        buyil = sc.nextInt();
        System.out.print("DOGUM YILI: ");
        dogumyili = sc.nextInt();
        System.out.println("YAŞINIZ...: " + (buyil - dogumyili));
        return kisiyas;
    }

    int enBuyukSayi() { // s2- 3 sayı alan bir method yazın bu method üç sayıdan en büyük olanı dönsün
        int sayi1 = 100, sayi2 = 50, sayi3 = 60, enbuyuk = 0;
        for (int i = enbuyuk; i < 1; i++) {
            if (sayi1 > sayi2 && sayi1 > sayi3) {
                System.out.println("EN BUYUK SAYI: " + sayi1);
            } else if (sayi2 < sayi1 && sayi2 > sayi3) {
                System.out.println("EN BUYUK SAYI: " + sayi2);
            } else {
                System.out.println("EN BUYUK SAYI: " + sayi3);
            }
        }
        return enbuyuk;

    }

    void ogrenciSonuc(int vizenotu, int finalnotu) {
        // s3- bir öğrenciye ait, vize ve final notlarını alan method yazın
        // bu method öğrencinin notunu harf olarak dönsün
        int ortalama = (vizenotu + finalnotu) / 2;
        System.out.println("OGRENCI NOTU: " + ortalama); // ortalamayı harfe çeviremedim
    }
}
