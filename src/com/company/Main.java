package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Geben Sie den Radius ein: ");
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();
        System.out.println("Die Kreisfläche beträgt: " + radius * radius * Math.PI);
    }
}
