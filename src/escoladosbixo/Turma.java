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
            System.out.println(" nome: "+a.getNome()+ " cod aluno: "+ a.getCodAluno()+"\r\n Notas:"+a.getNota1()+","+a.getNota2()+","+a.getNota3()+","+a.getNota4()+"\r\n situação:"+a.exibirSituaçao()+"\r\n_______________________________");
        }
    }
    
    
}
