package ru.archibald.javacore2.lesson1;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        System.out.println("New array:");
        Mas<?> m = new Mas<>(new Cat(), new Dog());
        m.info();

        System.out.println("\nExchange array items:");
        m.massElementsExchange();
        m.info();

        System.out.println("\nArrayList:");
        ArrayList<?> list = m.arrayToArrayList();
        for (Object o : list) System.out.println(o.getClass().getName());

    }
}
