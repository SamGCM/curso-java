package com.company;

public class Avatar {
    public static void main(String[ ] args) {
        Elements []vetor = Elements.values();
        for (Elements i : vetor) {
            System.out.println(i);
        }
        System.out.println(vetor[1].toString());
    }

}
