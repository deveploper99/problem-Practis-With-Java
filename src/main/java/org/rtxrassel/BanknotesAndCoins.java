package org.rtxrassel;

import java.util.Scanner;

public class BanknotesAndCoins {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n = input.nextDouble();
        int money = (int) Math.round(n * 100);

        int oneH = money / 10000;
        money %= 10000;

        int fifty = money / 5000;
        money %= 5000;

        int twenty = money / 2000;
        money %= 2000;

        int ten = money / 1000;
        money %= 1000;

        int five = money / 500;
        money %= 500;

        int two = money / 200;
        money %= 200;

        int one = money / 100;
        money %= 100;

        int fiftyC = money / 50;
        money %= 50;

        int twentyFive = money / 25;
        money %= 25;

        int tenC = money / 10;
        money %= 10;

        int fiveC = money / 5;
        money %= 5;

        int oneC = money / 1;

        System.out.println("NOTAS:");
        System.out.println(oneH + " nota(s) de R$ 100.00");
        System.out.println(fifty + " nota(s) de R$ 50.00");
        System.out.println(twenty + " nota(s) de R$ 20.00");
        System.out.println(ten + " nota(s) de R$ 10.00");
        System.out.println(five + " nota(s) de R$ 5.00");
        System.out.println(two + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(one + " moeda(s) de R$ 1.00");
        System.out.println(fiftyC + " moeda(s) de R$ 0.50");
        System.out.println(twentyFive + " moeda(s) de R$ 0.25");
        System.out.println(tenC + " moeda(s) de R$ 0.10");
        System.out.println(fiveC + " moeda(s) de R$ 0.05");
        System.out.println(oneC + " moeda(s) de R$ 0.01");










    }
}
