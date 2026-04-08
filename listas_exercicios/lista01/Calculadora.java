package listas_exercicios.lista01;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, media;
        System.out.println("======== CALCULADORA ========");
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2;
        System.out.println("============================");
        System.out.println("Média: " + media);
        
        if (media == 10) {
            System.out.println("Aprovado\n");
        } else if (media >= 7) {
            System.out.println("Aprovado\n");
        } else {
            System.out.println("Reprovado\n");
        }

        scanner.close();
    }
}