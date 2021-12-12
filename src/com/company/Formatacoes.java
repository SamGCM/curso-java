package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Formatacoes {
    public static void main(String[] args) {
        String name = "Samuel";
        int age = 24;
        float height = 1.81f;

//        System.out.printf("Hello my name is %s, have %d years, my height is %.2f cm.", name, age, height);
//
//
//        System.out.println(age + height);
        System.out.println("Informe o valor:");
        Scanner sc = new Scanner(System.in);
        float value = sc.nextFloat();

        ConvertValue(value);
    }

    private static void ConvertValue(double money) {

        double contertToUDS = money / 5.65;
        double contertToEU = money / 6.39;

        System.out.printf("Em Dólar é %.2f %n", contertToUDS);
        System.out.printf("Em Euro é %.2f", contertToEU);
    }
}
