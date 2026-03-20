package org.rtxrassel;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int money = input.nextInt();

        int thousand = money / 1000;
        money %= 1000;

        int fiveHundred = money / 500;
        money %= 500;

        int twoHundred = money / 200;
        money %= 200;

        int hundred = money / 100;
        money %= 100;

        int fifty = money / 50;
        money %= 50;

        int twenty = money / 20;
        money %= 20;

        int ten = money / 10;
        money %= 10;

        System.out.println("Note Breakdown:");

        System.out.println("1000 taka note = " + thousand);
        System.out.println("500 taka note = " + fiveHundred);
        System.out.println("200 taka note = " + twoHundred);
        System.out.println("100 taka note = " + hundred);
        System.out.println("50 taka note = " + fifty);
        System.out.println("20 taka note = " + twenty);
        System.out.println("10 taka note = " + ten);

    }
    }

