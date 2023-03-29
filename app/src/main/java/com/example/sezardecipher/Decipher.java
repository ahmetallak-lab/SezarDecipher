package com.example.sezardecipher;

import java.util.Scanner;

public class Decipher {
    public static void main(String[] args) {
        Scanner taryici = new Scanner(System.in);
        System.out.println("Deşifrelemek için bir metin giriniz");
        String sifreliMetin = taryici.next();
        int anahtar = 3;
        String metin = desifrele(sifreliMetin, anahtar);
        System.out.println("Metin: " + metin);
    }

    public static String desifrele(String sifreliMetin, int anahtar) {
        String metin = "";
        for (int i = 0; i < sifreliMetin.length(); i++) {
            char karakter = sifreliMetin.charAt(i);
            if (karakter >= 'a' && karakter <= 'z') {
                karakter = (char) (karakter - anahtar);
                if (karakter < 'a') {
                    karakter = (char) (karakter + 26);
                }
            } else if (karakter >= 'A' && karakter <= 'Z') {
                karakter = (char) (karakter - anahtar);
                if (karakter < 'A') {
                    karakter = (char) (karakter + 26);
                }
            }
            metin += karakter;
        }
        return metin;
    }
}
