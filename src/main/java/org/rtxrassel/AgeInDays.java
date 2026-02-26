package org.rtxrassel;

import java.util.Scanner;

public class AgeInDays {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int years = N/365;
        int remaining = N%365;
        int month = remaining/30;
        int day = remaining%30;

        System.out.println(years+" ano(s)");
        System.out.println(month+" mes(es)");
        System.out.println(day+" dia(s)");
    }
}
