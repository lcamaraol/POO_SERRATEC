package listas_exercicios.lista03.exercicio04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        String nome;
        String matricula;
        int opcao;

        do {
            System.out.println("\n1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Mostrar quantidade de alunos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();  // Por algum motivo, apos dar enter na opção o cadastro pulava a parte do nome, parece que o Enter 
                            /// conta como uma entrada de valor, então ele fica na "fila", tendo esse sc.nextLine() ele consume esse caracter fantasma :D

            switch (opcao) {
                case 1:
                    System.out.print("\033[H\033[2J");      /// Esses dois aqui são codigos estranhos mas eles "limpao" e sobem o terminal para ficar mais organizado e bonitinho
                    System.out.flush();
                    System.out.println("\n======= CADASTRO ALUNO =======");
                    System.out.print("Digite o nome do aluno: ");
                    nome = sc.nextLine();
                    System.out.print("Digite a matrícula do aluno: ");
                    matricula = sc.nextLine();
                    System.out.println("==============================\n");
                    Aluno aluno = new Aluno(nome, matricula);

                    if (aluno.getNome() != null && aluno.getMatricula() != null) {
                        alunos.add(aluno);
                        System.out.println("\nAluno cadastrado.");
                    }
                    break;

                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\n======= LISTAGEM DE ALUNOS =======");
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Aluno a : alunos) {
                            System.out.println(a.getNome() + " - " + a.getMatricula());
                        }
                    }
                    System.out.println("==================================");
                    break;

                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    Aluno.imprimirQuantidadeAlunos();
                    break;

                case 0:
                    System.out.println("Controle de Alunos encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}