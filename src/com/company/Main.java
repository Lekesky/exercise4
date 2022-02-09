package com.company;

import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    static HashMap<String, Double> avgTemp(HashMap<String ,Double> a){
        System.out.println("Please enter a city name: ");
        String city = input.nextLine();
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Please enter the temp: ");
//            double temp = input.nextDouble();
//
//        }
        System.out.println("Please enter the temp:");
        double temp1 = input.nextDouble();
        System.out.println("Please enter the temp:");
        double temp2 = input.nextDouble();

        double total = temp1 + temp2;
        double avg = total/5;
        System.out.println(avg);

        return a;
    }


    public static void main(String[] args) {
        Map<String, Double> cities = new TreeMap<String, Double>();
//        ArrayList<String> city = new ArrayList<>();

        System.out.println("Enter a city name");
        var cityNames = input.nextLine();
        cities.put(cityNames, 68.0);
        System.out.println(cities);

        while (!(cityNames.equalsIgnoreCase("END"))){
            System.out.println("Enter a city name");
            cityNames = input.nextLine();
        }
        avgTemp();

    }

}
