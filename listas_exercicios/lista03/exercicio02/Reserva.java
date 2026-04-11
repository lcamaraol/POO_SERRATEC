package listas_exercicios.lista03.exercicio02;

public class Reserva {
    private int numeroQuarto;
    private String tipo;
    private String status;

    public Reserva(int numeroQuarto, String tipo, String status) {
        this.numeroQuarto = numeroQuarto;
        this.tipo = tipo;

        if (status.equals("Livre") || status.equals("Reservado") || status.equals("Ocupado")) {
            this.status = status;
        } else {
            this.status = "Livre";
        }
    }

    public void reservar() {
        if (status.equals("Livre")) {
            status = "Reservado";
            System.out.println("\nQuarto reservado com sucesso.\n");
        } else {
            System.out.println("\nErro: O quarto está indisponivel para reserva.\n");
        }
    }

    public void confirmarCheckIn() {
        if (status.equals("Reservado")) {
            status = "Ocupado";
            System.out.println("\nCheck-in confirmado com sucesso.\n");
        } else {
            System.out.println("\nErro: só é possível fazer check-in de um quarto Reservado.\n");
        }
    }

    public void exibirDados() {
        System.out.println("======== QUARTO ========");
        System.out.println("Quarto: " + numeroQuarto);
        System.out.println("Tipo: " + tipo);
        System.out.println("Status: " + status);
        System.out.println("========================");
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public String getStatus() {
        return status;
    }

    public String getTipo() {
        return tipo;
    }
}