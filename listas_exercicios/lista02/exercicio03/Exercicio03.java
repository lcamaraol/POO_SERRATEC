package listas_exercicios.lista02.exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        String nomeMaiorPeso = "";
        String nomeMaiorAltura = "";

        double peso;
        double altura;
        double maiorPeso = 0;
        double maiorAltura = 0;
        double somaPesos = 0;
        double somaAlturas = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Digite o nome: ");
            nome = scanner.nextLine();

            System.out.print("Digite o peso: ");
            peso = scanner.nextDouble();

            System.out.print("Digite a altura: ");
            altura = scanner.nextDouble();
            scanner.nextLine();

            somaPesos += peso;
            somaAlturas += altura;

            if (i == 1 || peso > maiorPeso) {
                maiorPeso = peso;
                nomeMaiorPeso = nome;
            }

            if (i == 1 || altura > maiorAltura) {
                maiorAltura = altura;
                nomeMaiorAltura = nome;
            }

            System.out.println();
        }

        double mediaPeso = somaPesos / 4;
        double mediaAltura = somaAlturas / 4;

        System.out.println("Pessoa com maior peso: " + nomeMaiorPeso);
        System.out.println("Pessoa com maior altura: " + nomeMaiorAltura);
        System.out.println("Média de peso: " + mediaPeso);
        System.out.println("Média de altura: " + mediaAltura);
        System.out.println();

        scanner.close();
    }
}
