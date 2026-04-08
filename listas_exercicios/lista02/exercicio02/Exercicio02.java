package listas_exercicios.lista02.exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int antecessor;
        int sucessor;

        System.out.print("\nDigite um número inteiro: ");
        numero = scanner.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.println("\nNúmero digitado: " + numero);
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor + "\n");

        scanner.close();
    }
}
