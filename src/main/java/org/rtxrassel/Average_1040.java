package org.rtxrassel;

import java.util.Scanner;

public class Average_1040 {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      float n1 = input.nextFloat();
      float n2 = input.nextFloat();
      float n3 = input.nextFloat();
      float n4 = input.nextFloat();
      float average = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;


      if (average>7.0){
          System.out.printf("Media: %.1f\n",average);
          System.out.println("Aluno aprovado.");

      } else if (average >= 5.0 && average <= 6.9) {
          System.out.printf("Media: %.1f\n",average);
          System.out.println("Aluno em exame.");
          float exame_score = input.nextFloat();
          System.out.println("Nota do exame: "+exame_score);
          double pre_score = (average+exame_score) /2;
          if (pre_score >= 5.0){
              System.out.println("Aluno aprovado.");
          }else {
              System.out.println("Aluno reprovado.");
          }

          System.out.printf("Media final: %.1f\n", pre_score);

      } else if (average<5.0) {
          System.out.printf("Media: %.1f\n",average);
          System.out.println("Aluno reprovado.");
      }



  }
}
