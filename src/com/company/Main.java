package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        double next = 0;
        boolean numberOfNumbers = true;
        int licznik = 0;
        System.out.println("Podaj 10 liczb ");
        while (numberOfNumbers) {
            next = scanner.nextDouble();

            if (licznik <4) {
                list.add(next);
                licznik++;
            } else
                numberOfNumbers = false;
        }


        double sum = 0;
        for (Double numbers : list) {
            sum += numbers;
        }
        double avgerage = sum / list.size();

        System.out.println("Suma tych liczb wynosi: " + sum);
        System.out.println("Srednia wynosi: " + avgerage);
    }
}
