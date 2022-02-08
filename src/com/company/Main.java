package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String cityNames;
    public static void main(String[] args) {
        System.out.println("Enter a city name");
        cityNames = input.nextLine();
        while (cityNames.toUpperCase() != "END"){

            System.out.println("Enter a city name");
            cityNames = input.nextLine();


        }
    }
}
