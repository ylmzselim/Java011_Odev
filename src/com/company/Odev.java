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

    // s2- 3 sayı alan bir method yazın bu method üç sayıdan en büyük olanı dönsün
    // 1. yol
    public int buyukSayi(int s1, int s2, int s3) {
        int buyuksayi = s1;
        if (buyuksayi < s2) {
            buyuksayi = s2;
        }
        if (buyuksayi < s3) {
            buyuksayi = s3;
        }
        return buyuksayi;
    }

    // 2. yol
    int enBuyukSayi() {
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

    // s3- bir öğrenciye ait, vize ve final notlarını alan method yazın
    // bu method öğrencinin notunu harf olarak dönsün
    public String ogrenciSonuc(int vizenotu, int finalnotu) {
        int ortalama = (vizenotu + finalnotu) / 2;
        String harfnotu = "";
        String[] birler = {"sıfır", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
        String[] onlar = {"on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};
        if (ortalama == 0) {
            harfnotu = "Sıfır";
        } else if (ortalama == 100) {
            harfnotu = "Yüz";
        } else if (ortalama > 0 && ortalama < 10) {
            harfnotu = birler[ortalama];
        } else if (ortalama > 9 && ortalama < 100) {
            int birlerbasamagi = ortalama % 10;
            int onlarbasamagi = ortalama / 10;
            harfnotu = onlar[onlarbasamagi - 1] + " " + birler[birlerbasamagi];
        } else {
            harfnotu = "GECERSIZ NOT GIRISI";
        }
        return harfnotu;
    }
}
