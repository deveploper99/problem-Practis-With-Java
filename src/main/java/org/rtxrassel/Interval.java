package org.rtxrassel;

import java.util.Scanner;

public class Interval {
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      float number = input.nextFloat();

      if (number < 0 || number > 100) {
          System.out.println("Fora de intervalo");
      }
      else if (number <= 25) {
          System.out.println("Intervalo [0,25)");
      }
      else if (number <= 50) {
          System.out.println("Intervalo (25,50]");
      }
      else if (number <= 75) {
          System.out.println("Intervalo (50,75]");
      }
      else {
          System.out.println("Intervalo (75,100]");
      }
    }
}
