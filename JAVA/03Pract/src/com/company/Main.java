package com.company;

public class Main {


    public static void main(String[] args) {
	    System.out.println("bla");
    }
    public static void first() {
        int min = 5;
        int max = 10;
        int n = (int) (Math.random() * max + min);
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        System.out.println(result);
    }

    public static void second() {
        int min = -10;
        int max = 10;
        int n = (int) (Math.random() * max + min);

    }

}
