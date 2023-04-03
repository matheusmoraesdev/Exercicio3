package lista03_03.src;

import java.util.Scanner;

public class ex03 {
  
  public static void main(String[] args) throws Exception {
    // Declaração das variáveis
    int numero1;
    int numero2;
    int total;
    // Passo 1: fazer a entrada dos dados
    Scanner reader = new Scanner(System.in);
      System.out.print("Digite um número: ");
        numero1 = reader.nextInt();
      System.out.print("Digite um número: ");
        numero2 = reader.nextInt();  

    // Passo 2: Calcular
    total = numero1 + numero2;
 
    // Passo 3: exibir a resposta para o usuário

    System.out.println("A soma de seus números é: " + total);



  }
}
