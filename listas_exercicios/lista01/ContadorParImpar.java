package listas_exercicios.lista01;

public class ContadorParImpar {
    public static void main(String[] args) {
        int pares = 0;
        int impares = 0;

        System.out.println();

        for (int i = 0; i <= 30; i++) {
            System.out.print(i);

            if (i < 30) {
                System.out.print(", ");
            }

            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\n=================================");
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
        System.out.println("=================================");
    }
}