package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        number = scanner.nextInt();

        for (int i = 1; i<=number; i*=4){
            System.out.println("4. Kuvvet = "+i);
        }

        for (int i= 1; i<=number; i*=5){
            System.out.println("5. Kuvvet = "+i);
        }
    }
}
