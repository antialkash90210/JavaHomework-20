package com.company;

import java.util.Random;

public class Task_04 {
    public static void main(String[] args) {
        int days = 28;
        int mas[] = new int[days];
        int sumDays = 0;
        Random random = new Random();

        for (int i = 1; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
            System.out.print(mas[i]+" ");

            if (mas[i] == 0) {
                sumDays += 1;
            }

        }
        System.out.println();

        System.out.println("Дней без осадков : " + sumDays);
        if (sumDays == 0) {
            System.out.println("Осадки были каждый день");
        }
    }
}