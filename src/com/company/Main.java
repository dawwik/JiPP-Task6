package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add((double)i);
        }
        Collections.shuffle(list);

        System.out.println("Losowa kolejność liczb z przedzialu [ 0 - 10 ] to: ");
        System.out.println(list);


        double sum = 0;
        Collections.sort(list);
        for (Double numbers : list) {
            sum += numbers;
        }
        System.out.println("Posortowane liczby to: ");
        System.out.println(list);

        double avgerage = sum / list.size();

        double median;
        if (list.size() % 2 == 1)
            median = (list.get(list.size() / 2) + list.get(list.size() / 2 +1))/2;
         else
            median = list.get(list.size() / 2);
            System.out.println(median);

        System.out.println("Suma tych liczb wynosi: " + sum);
        System.out.println("Srednia wynosi: " + avgerage);
        System.out.println("Mediana wynosi: " + median);
   }
}
