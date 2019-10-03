
package escoladosbixo;
import java.util.ArrayList;
import java.util.List; 


public class Escola {
    private String nomeEscola;
    private List<Turma> turmas = new ArrayList<Turma>();

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNome(String nome) {
        this.nomeEscola = nomeEscola;
    }

    public void exibirTurma(){
        for(Turma t : turmas){
            System.out.println("Nome Turma: "+this.getNomeEscola()+"  Turma: " + t.getNomeTurma());
    }
    }

    public void addTurma(Turma t) {
        turmas.add(t);
    }
    
}
