package listas_exercicios.lista01;

import java.util.Scanner;

public class INSS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario;
        double aliquota;
        double desconto;
        double salarioFinal;

        System.out.print("\nDigite o salário: R$ ");
        salario = scanner.nextDouble();

        if (salario <= 1518.00) {
            aliquota = 0.075;
        } else if (salario <= 2793.88) {
            aliquota = 0.09;
        } else if (salario <= 4190.83) {
            aliquota = 0.12;
        } else {
            aliquota = 0.14;
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
