package exercicio2;

import java.util.Scanner;

public class Exercicio2 {
       
    public static void main(String[] args) {
        System.out.println("Digite uma palavra:");
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n");
        String palavra = teclado.next();
        String linha = teclado.nextLine().trim();
        
        letraA.resultado(palavra);
        letraB.resultado(linha);
    }
}
