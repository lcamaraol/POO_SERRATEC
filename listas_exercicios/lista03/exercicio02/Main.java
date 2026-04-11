package listas_exercicios.lista03.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Reserva[] quartos = new Reserva[4];

        quartos[0] = new Reserva(101, "Simples", "Ocupado");
        quartos[1] = new Reserva(102, "Luxo", "Reservado");
        quartos[2] = new Reserva(103, "Simples", "Livre");
        quartos[3] = new Reserva(104, "Luxo", "Livre");

        for (int i = 0; i < quartos.length; i++) {
            quartos[i].exibirDados();
            System.out.println();
        }

        System.out.print("Digite o número do quarto que deseja selecionar: ");
        int numeroEscolhido = sc.nextInt();

        Reserva quartoSelecionado = null;

        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i].getNumeroQuarto() == numeroEscolhido) {
                quartoSelecionado = quartos[i];
                break;
            }
        }

        if (quartoSelecionado == null) {
            System.out.println("\nQuarto não encontrado.\n");
        } else {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("\nQuarto selecionado:\n");
            quartoSelecionado.exibirDados();

            System.out.println("\n1 - Reservar");
            System.out.println("2 - Confirmar Check-in");
            System.out.print("\nEscolha uma opção: ");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                quartoSelecionado.reservar();
            } else if (opcao == 2) {
                quartoSelecionado.confirmarCheckIn();
            } else {
                System.out.println("Opção inválida.");
            }

            quartoSelecionado.exibirDados();
        }

        sc.close();
    }
}