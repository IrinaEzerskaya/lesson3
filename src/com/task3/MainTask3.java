package com.task3;

public class MainTask3 {

    public static void main(String[] args) {
        int sec=Integer.parseInt(args[0]);
        int h;
        if (sec >0) {
            h=sec/3600;
            System.out.println("Часы " + h );
        } else
            System.out.println("Введено некорректное число");
    }
}
