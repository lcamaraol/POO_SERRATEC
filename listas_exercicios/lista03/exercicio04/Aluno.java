package listas_exercicios.lista03.exercicio04;

public class Aluno {
    private String nome;
    private String matricula;
    private static int contAlunos = 0;

    public Aluno(String nome, String matricula) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: o nome não pode ser nulo ou vazio.");
            return;
        }

        if (matricula == null || matricula.trim().isEmpty()) {
            System.out.println("Erro: a matrícula não pode ser nula ou vazia.");
            return;
        }

        this.nome = nome;
        this.matricula = matricula;
        contAlunos++;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public static void imprimirQuantidadeAlunos() {
        System.out.println("Quantidade de alunos criados: " + contAlunos);
    }
}