package listas_exercicios.lista03.exercicio03;

public class Versao {
    private int major;
    private int minor;

    public Versao(int major, int minor){
        this.major = major;
        this.minor = minor;
    }

    public void lancarNovaVersao(boolean isCritica){
        if (isCritica){
            major++;
            minor = 0;
            
        }else{
            minor++;
        }
    }

    public String mostrarVersao(){
        return major + "." + minor;
    }
}

