
package escoladosbixo;
import java.util.ArrayList;
import java.util.List; 


public class Escola {
    private String nomeEscola;
    private List<Turma> turmas = new ArrayList<Turma>();

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public void exibirTurma(){
        for(Turma t : turmas){
            System.out.println(" Turma: " + t.getNomeTurma()+"\r\n|||||||||||||||||||||||||||||||||||||||||||");
            t.exibirALunos();
            System.out.println("\r\n|||||||||||||||||||||||||||||||||||||||||||");
    }
    }

    public void addTurma(Turma t) {
        turmas.add(t);
    }
    
}
