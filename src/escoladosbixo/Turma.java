package escoladosbixo;
import java.util.ArrayList;
import java.util.List;
        
public class Turma {
    private String nomeTurma;
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno t) {
        alunos.add(t);
    }
    
    public void exibirALunos(){
        for(Aluno a: alunos){
            System.out.println("nome turma"+this.getNomeTurma()+" Alunos :"+ a.getNome()+ " cod aluno: "+ a.getCodAluno());
        }
    }
    
    
}
