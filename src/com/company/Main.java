package com.company;

public class Main {

    public static void main(String[] args) {

        Odev cevaplar = new Odev();
        cevaplar.yas();
        System.out.println("EN BUYUK SAYI: " + cevaplar.buyukSayi(30, 50, 20));
        cevaplar.enBuyukSayi();
        System.out.println("HARF NOTU: " + cevaplar.ogrenciSonuc(60, 70));

    }
}
