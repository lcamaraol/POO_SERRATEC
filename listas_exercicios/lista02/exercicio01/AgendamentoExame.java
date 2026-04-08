package listas_exercicios.lista02.exercicio01;

public class AgendamentoExame {
    String nomePaciente;
    String tipoExame;
    String dataExame;
    String horarioExame;
    String medicoResponsavel;

    void exibirAgendamento() {
        System.out.println("\n=== AGENDAMENTO DE EXAME ===");
        System.out.println("Paciente: " + nomePaciente);
        System.out.println("Exame: " + tipoExame);
        System.out.println("Data: " + dataExame);
        System.out.println("Horário: " + horarioExame);
        System.out.println("Médico responsável: " + medicoResponsavel);
        System.out.println("============================\n");
    }
}