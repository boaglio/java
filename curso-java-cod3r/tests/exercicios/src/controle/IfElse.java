package controle;

import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe a media: ");
    double media = entrada.nextDouble();

    if (media >= 7.0) {
      System.out.println("Aprovado!");
    } else {
      System.out.println("Reprovado!");
    }

    entrada.close();
  }
}
