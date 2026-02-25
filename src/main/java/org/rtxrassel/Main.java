package org.rtxrassel;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int hours = N/3600;
        int remainining = N%3600;
        int minutes = remainining/60;
        int seconds = remainining%60;

        System.out.println(hours+":"+minutes+":"+seconds);
        input.close();


    }
    }

