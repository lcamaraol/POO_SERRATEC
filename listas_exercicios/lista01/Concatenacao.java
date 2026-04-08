package listas_exercicios.lista01;

import java.util.Scanner;

public class Concatenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        double altura;
        String nome;
        boolean estudante;

        System.out.print("\nDigite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.print("Digite sua altura (exemplo 1,90): ");
        altura = scanner.nextDouble();

        System.out.print("Você é estudante? (true/false): ");
        estudante = scanner.nextBoolean();

        System.out.println();
        System.out.println("Ficha:");
        System.out.println("Nome: " + nome + ", idade: " + idade +
                ", altura: " + altura + ", estudante: " + estudante +"\n");

        scanner.close();
    }
}
