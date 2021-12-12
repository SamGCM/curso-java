package com.company;

public class Main {
    static final float weight = 2.20462f;
    public static void main(String[] args) {

        int n1 = 7;
        int n2 = 5;
        int n3 = 10;

        double media = (n1 + n2 + n3) / 3.0;

        int base = 10;
        int alt = 37;

        double mediaT = (base * alt) / 2.0;

        float baseQ = 17.53f;

        double mediaQ = baseQ * baseQ;


//        System.out.printf("Hello, %s.", args[0]);
//        System.out.printf("'%15s' %n", "baeldung");;
//        System.out.printf("%2.2s", "Hi there!");

        int KG = 100;
        float multiple = KG * weight;
        System.out.printf("100kg é igual a %.2f lb", multiple);
    }
}
