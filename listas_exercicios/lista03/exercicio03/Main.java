package listas_exercicios.lista03.exercicio03;

public class Main{
    public static void main(String[] args) {
        Versao versao = new Versao(1,0);
        
        System.out.println("\nVersão atual: " + versao.mostrarVersao());

        versao.lancarNovaVersao(false);
        System.out.println("Após atualização comum: " + versao.mostrarVersao());
    
        versao.lancarNovaVersao(false);
        System.out.println("Após outra atualização comum: " + versao.mostrarVersao());
        
        versao.lancarNovaVersao(true);
        System.out.println("Após atualização critica: " + versao.mostrarVersao() + "\n");

    }
}
