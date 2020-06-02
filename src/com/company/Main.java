package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        double average;
        ArrayList <Double> list = new ArrayList<>();
        list.add(2.2);
        list.add(3.3);
        list.add(4.4);


        average = list.get(0)+list.get(1)+list.get(2);
        System.out.println("Srednia liczb 2.2, 3.3, 4.4 to: " + average + " a mediana tych liczb wynosi: ");
    }
}
