package org.example;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Function<String, Integer> function = s -> Integer.parseInt(s);
        Predicate<String> predicate = s -> s.length()>4;
        Consumer<String> consumer = System.out::println;
        consumer.accept("patel");
//        System.out.println(predicate.test("chintan"));
//        System.out.println(function.apply("1234"));

        Shirt s1 = new Shirt(45.0,ShirtSize.S);
        System.out.println(s1);
    }
}