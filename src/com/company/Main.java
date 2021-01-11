package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("1. The smallest value is "+nejmensi(25, 37, 29));
        System.out.println("2. The average value is "+prumer(25, 45, 65));
        System.out.println("3. The middle character in the string: "+prostredni("350"));
        System.out.println("4. Number of Vowels in the string: "+samohlasky("w3resource"));
        System.out.println("5. Number of words in the string: "+pocetSlov("The quick brown fox jumps over the lazy dog."));
        System.out.println("6. The sum is "+soucet(25));
    }

    public static int nejmensi (int a, int b, int c){
        int mezi = Math.min(a, b);
        return Math.min(mezi, c);
    }

    public static int prumer(int a, int b, int c) {
        return (a+b+c)/3;
    }

    public static String prostredni(String a) {
        int zbytek = a.length()%2;
        String x = "";
        if(zbytek == 0) {
            x += a.charAt(a.length()/2 -1);
            x += a.charAt(a.length()/2);
            return x;
        } else {
            return x += a.charAt(a.length()/2);
        }
    }

    public static int samohlasky(String a ) {
        int pocet = 0;
        a = a.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' ||a.charAt(i) == 'i' ||a.charAt(i) == 'o' ||a.charAt(i) == 'u' ) {
                pocet++;
            }
        }
        return pocet;
    }

    public static int pocetSlov(String veta) {
        return veta.split(" ").length;
    }

    public static int soucet(int a) {
        int vysledek = 0;
        while(a > 0) {
            vysledek += a % 10;
            a /= 10;
        }
        return vysledek;
    }


}
