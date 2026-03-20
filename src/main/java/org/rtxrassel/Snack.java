package org.rtxrassel;

import java.util.Scanner;

public class Snack {
 public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     int x = input.nextInt();
     int y = input.nextInt();
     double price = 0;

     if (x==1){
         price = 4.00;
     } else if (x==2) {
         price = 4.50;

     } else if (x==3) {
         price = 5.00;
     } else if (x==4) {
         price = 2.00;

     } else if (x==5) {
         price = 1.50;
     }

    double total = price*y;

     System.out.printf("Total: R$ %.2f\n", total);


 }
}
