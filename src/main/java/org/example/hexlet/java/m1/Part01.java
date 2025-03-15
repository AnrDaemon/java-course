package org.example.hexlet.java.m1;

// Module 1, part 1
public class Part01 {

    // Alias the App class used in module primers
    private final class App extends io.hexlet.M1p1 {
    }

    public final static void e1(String[] args) {
        System.out.println(App.getWelcomeMessage());
    }

    public static void main(String[] args) {
        e1(args);
        System.exit(0);
    }
}
