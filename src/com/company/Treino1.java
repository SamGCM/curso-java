package com.company;

public class Treino1 {
    public static void main (String[] args) {
        int[] ages;

        ages = new int[3];

        ages[0] = 1;
        ages[1] = 2;
        ages[2] = 3;

        System.out.println("Element at index 0: " + ages[0]);
        System.out.println("Element at index 1: " + ages[1]);
        System.out.println("Element at index 2: " + ages[2]);

        String[] copyFrom = {
                "Um", "Dois", "Três"
        };

        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2,3);

        System.out.println(copyTo);
        System.out.println(copyFrom[0]);
    }

}
