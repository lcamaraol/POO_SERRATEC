package listas_exercicios.lista03.exercicio01;

public class Funcionario {
    
    private String nome;
    private String cpf; ///É string pois o CPF ira seguir o padrão 000.000.000-00
    private double salario;

    private static final double SALARIO_MINIMO = 1621.00;

    public Funcionario(String nome, String cpf, double salario) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: O nome não pode ser nulo ou vazio.");
            return;
        }

        if (cpf == null || cpf.trim().isEmpty() || (cpf.length() != 11 && cpf.length() != 14)) {
            System.out.println("Erro: o CPF deve ter 11 caracteres sem pontuação ou 14 com formatação.");
            return;
        }

        if (salario < SALARIO_MINIMO) {
            System.out.println("Erro: O salário não pode ser menor que o salário mínimo atual ( R$ " + SALARIO_MINIMO + " ).");
            return;
        }
        
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    public void exibirDados() {
        if (nome == null || cpf == null || salario == 0) {
            System.out.println("Funcionário inválido. Dados não atribuídos.");
        } else {
            System.out.println("\n======= FICHA DO FUNCIONARIO =======");
            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + cpf);
            System.out.println("Salário: R$ " + salario);
            System.out.println("====================================");
        }
    }
}

