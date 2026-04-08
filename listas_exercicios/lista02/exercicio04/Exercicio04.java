package listas_exercicios.lista02.exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        int fatorial = 1;

        System.out.println("\n======= FATORIAL 1 A 10 =======");
        for (int i = 1; i <= 10; i++) {
            fatorial *= i;
            System.out.println("O Fatorial de " + i + " é : " + fatorial);
        }
        System.out.println("==============================\n");
    }
}