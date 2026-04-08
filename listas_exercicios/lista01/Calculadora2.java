package listas_exercicios.lista01;

import java.util.Scanner;

public class Calculadora2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, media;
        String resultado;

        System.out.println("======== CALCULADORA ========");
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.println("============================");
        media = (nota1 + nota2) / 2;

        resultado = (media == 10) ? "Aprovado Parabéns\n"
                  : (media >= 7) ? "Aprovado\n"
                  : "Reprovado\n";

        System.out.println("Média: " + media);
        System.out.println(resultado);

        scanner.close();
    }
}
