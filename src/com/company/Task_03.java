package com.company;


public class Task_03 {
    public static void Chet(int mas[]) {
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 != 0) {
                System.out.print(mas[i] + " ");
            }
        }
    }

    public static void Nechet(int mas[]) {
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                System.out.print(mas[i] + " ");
            }
        }
    }
    public static void PrintEnter(){
        System.out.println();
    }
    public static void PrintChet(){
        System.out.println("Элементы, стоящие на четных местах: ");
    }
    public static void PrintNechet(){
        System.out.println("Элементы, стоящие на нечетных местах: ");
    }

    public static void main(String[] args) {

        int mas[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        PrintChet();
        Chet(mas);
        PrintEnter();
        PrintNechet();
        Nechet(mas);


    }
}