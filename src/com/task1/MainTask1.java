package com.task1;

public class MainTask1 {

    public static void main(String[] args) {

		int price=43;
		int liters=Integer.parseInt(args[0]);
		int amount;
		if (liters >0) {
			amount = price*liters;
			System.out.println("За бензин необходимо заплатить " + amount + " руб");
		} else {
			System.out.println("Введено некорректное число");
		}

    }
}
