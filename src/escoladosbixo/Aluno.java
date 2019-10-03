
package escoladosbixo;

public class Aluno {
   private int codAluno;
   private String nome;
   private int nota1;
   private int nota2;
   private int nota3;
   private int nota4;

    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }
    public String exibirSituaçao(){
        String retorno="";
        if((nota1>10)||(nota2>10)||(nota3>10)||(nota4>10)){
            retorno = "erro, as notas nao são validas";
        }
        else{
            int media=(nota1+nota2+nota3+nota4)/4;
            if(media>7){
                retorno=this.nome+"foi aprovado";
            }
            else{
                retorno=this.nome+"foi reprovado";
            }
        }
        return retorno;
    }
}
