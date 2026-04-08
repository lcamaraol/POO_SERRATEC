package listas_exercicios.lista02.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendamentoExame exame1 = new AgendamentoExame();

        System.out.print("Digite o nome do paciente: ");
        exame1.nomePaciente = scanner.nextLine();

        System.out.print("Digite o tipo de exame: ");
        exame1.tipoExame = scanner.nextLine();

        System.out.print("Digite a data do exame: ");
        exame1.dataExame = scanner.nextLine();

        System.out.print("Digite o horário do exame: ");
        exame1.horarioExame = scanner.nextLine();

        System.out.print("Digite o nome do médico responsável: ");
        exame1.medicoResponsavel = scanner.nextLine();

        exame1.exibirAgendamento();

        scanner.close();
    }
}