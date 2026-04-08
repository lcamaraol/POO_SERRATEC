package listas_exercicios.lista01;

import java.util.Scanner;

public class INSS2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario;
        double aliquota = 0;
        double desconto;
        double salarioFinal;
        int faixa;

        System.out.print("\nDigite o salário: R$ ");
        salario = scanner.nextDouble();

        if (salario <= 1518.00) {
            faixa = 1;
        } else if (salario <= 2793.88) {
            faixa = 2;
        } else if (salario <= 4190.83) {
            faixa = 3;
        } else {
            faixa = 4;
        }

        switch (faixa) {
            case 1:
                aliquota = 0.075;
                break;
            case 2:
                aliquota = 0.09;
                break;
            case 3:
                aliquota = 0.12;
                break;
            case 4:
                aliquota = 0.14;
                break;
            default:
                System.out.println("Faixa inválida.");
                scanner.close();
                return;
        }

        desconto = salario * aliquota;
        salarioFinal = salario - desconto;

        System.out.println("=============================");
        System.out.println("Salário bruto: R$ " + salario);
        System.out.println("Desconto INSS: R$ " + desconto);
        System.out.println("Salário final: R$ " + salarioFinal);
        System.out.println("=============================");
        scanner.close();
    }
}
