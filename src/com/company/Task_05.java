package com.company;

import java.util.Random;

public class Task_05 {
    public static void main(String[] args) {
        int month = 12;
        int rab = 18;
        int sumPayJune = 0;


        Random random = new Random();
        int pay[][] = new int[rab][month];


        for (int i = 0; i < rab; i++) {
            for (int j = 0; j < month; j++) {
                pay[i][j] = random.nextInt(1000);

                System.out.printf("%-5d", pay[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Общая зарплата за июнь: ");
        for (int i = 0; i < rab; i++) {
            sumPayJune += pay[i][6-1];

        }
        System.out.printf("%-5d", sumPayJune);

    }
}