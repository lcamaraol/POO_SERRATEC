package listas_exercicios.lista01;

public class Tabuada {
    
    public static void main(String[] args) {
        int numero = 5;

        System.out.println("\n\n");
        System.out.println("======== TABUADA do "+ numero + " ========");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println("=============================");
    }
}