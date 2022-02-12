// Leke Obayemi
// 2/12/22
// Exercise 4


package com.company;

import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    static HashMap<String, Double> cities = new HashMap<String, Double>();
    static String cityNames = "";
     public static void main(String[] args) {
        
        while (!(cityNames.equalsIgnoreCase("END"))){       //always asks for city name and daily temps until user enters "end"
            prompt();       //prompts user for city name
            getAvgTemp();   //prompt user for temps for the next 5 days and gives an average
        }
        results();      //prints out all reults in HashMap
    }


    static void prompt(){
        System.out.println("Enter a city name");
        input.nextLine();   //nextLine method is bugged, calling a temporary nextLine before calling a real nextLine
        String cityNames1 = input.nextLine();
        cityNames = cityNames1;
    }

    static void getAvgTemp(){
        ArrayList<Double> temp = new ArrayList<>();
        double sum = 0;
        double avgTemp = 0;

        if(!(cityNames.equalsIgnoreCase("END"))){       //will ask for daily temps as long as if the user doessn't enter "end"
            for (int i = 0; i < 5 ; i++) {
                System.out.println("Enter in a temperature");    
                temp.add(input.nextDouble());

            }

            for (int i = 0; i < temp.size() ; i++) {        //sums up doubles in arrayList and divides by 5
                sum = sum + temp.get(i);
                avgTemp = sum/5;
                
            }

            cities.put(cityNames, avgTemp);
        }  
    }

    static void results(){
        System.out.println("\nCities and Average Temperatures:\n");
        for (String i : cities.keySet()) {
            System.out.println("Cities: " + i + "\nAverage Temperature: " + cities.get(i));     //prints both city names and average temps
        }
    }
}
