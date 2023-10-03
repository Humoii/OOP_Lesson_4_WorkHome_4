package org.example;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        MyLinked<String> stringLinked = new MyLinked<>();
//        stringMyLinked.addLast("ssss");
        stringLinked.addLast("asd");
        stringLinked.addLast("avd");
        stringLinked.addLast("ast");
        stringLinked.addLast("zsd");
//        stringLinked.addFirst("asd");
//        stringLinked.addFirst("avd");
//        stringLinked.addFirst("ast");
//        stringLinked.addFirst("zsd");
        for (int i = 0; i < stringLinked.size(); i++){ // без итератора Iterable<E>
            System.out.println(stringLinked.getElementByIndex(i));
        }
        System.out.println(stringLinked.size());
        System.out.println("\n");

        for (String s : stringLinked){ // с итератором Iterable<E> идет по порядку
            System.out.println(s);
        }
        System.out.println("\n");

        Iterator iterator = stringLinked.descendingIterator();// с итератором DescendingIterator<E> идет с конца
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}