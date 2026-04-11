package listas_exercicios.lista03.exercicio01;

import java.util.Scanner;

public class Cadastro {
    
    public static void main(String[] args) {
        String nome;
        String cpf; 
        double salario;
        Scanner sc = new Scanner(System.in);
        

        System.out.println("\n======= CADASTRO FUNCIONARIO =======");
        System.out.print("Digite o nome do funcionário: ");
        nome = sc.nextLine();
        System.out.print("Digite o CPF do Funcionario: ");
        cpf = sc.nextLine();
        System.out.print("Digite o salário do Funcionario: ");
        salario = sc.nextDouble();
        Funcionario funcionario = new Funcionario(nome, cpf, salario);
        
        System.out.println();
        funcionario.exibirDados();

        sc.close();
    }
}
