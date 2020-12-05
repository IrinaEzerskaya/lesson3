package com.task2;

public class MainTask2 {

    public static void main(String[] args) {

        int salary=Integer.parseInt(args[0]);
        double ndfl=0.13;
        double net;
        if (salary >0) {
            net=salary-(ndfl*salary);
            System.out.println("Зарплата на руки " + net + " руб");
        } else
            System.out.println("Введено некорректное число");
    }
}
