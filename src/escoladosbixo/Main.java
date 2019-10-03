
package escoladosbixo;

public class Main {

    public static void main(String[] args) {
        Turma t1 = new Turma();
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        
        a1.setNome("victor cornin");
        a1.setCodAluno(1);
        a1.setNota1(8);
        a1.setNota2(5);
        a1.setNota3(7);
        a1.setNota4(9);
        
        a2.setNome("jonata cornin");
        a2.setCodAluno(2);
        a2.setNota1(9);
        a2.setNota2(6);
        a2.setNota3(5);
        a2.setNota4(9);
        
        a3.setNome("matheus cornin");
        a3.setCodAluno(3);
        a3.setNota1(4);
        a3.setNota2(6);
        a3.setNota3(8);
        a3.setNota4(7);
        
        a4.setNome("negueba cornin");
        a4.setCodAluno(1);
        a4.setNota1(1);
        a4.setNota2(1);
        a4.setNota3(2);
        a4.setNota4(3);
        
        a5.setNome("lula cornin");
        a5.setCodAluno(1);
        a5.setNota1(5);
        a5.setNota2(6);
        a5.setNota3(7);
        a5.setNota4(9);
        
        t1.setNomeTurma("turma dos cornin");
        
        t1.addAluno(a1);
        t1.addAluno(a2);
        t1.addAluno(a3);
        t1.addAluno(a4);
        t1.addAluno(a5);
        
        
        
        Turma t2 = new Turma();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        Aluno a10 = new Aluno();
        
        a6.setNome("paula tejando");
        a6.setCodAluno(1);
        a6.setNota1(10);
        a6.setNota2(10);
        a6.setNota3(10);
        a6.setNota4(10);
        
        a7.setNome("marcos bigulin");
        a7.setCodAluno(2);
        a7.setNota1(6);
        a7.setNota2(2);
        a7.setNota3(4);
        a7.setNota4(7);
        
        a8.setNome("joao maria");
        a8.setCodAluno(3);
        a8.setNota1(1);
        a8.setNota2(2);
        a8.setNota3(8);
        a8.setNota4(7);
        
        a9.setNome("cesar iana");
        a9.setCodAluno(1);
        a9.setNota1(1);
        a9.setNota2(1);
        a9.setNota3(2);
        a9.setNota4(3);
        
        a10.setNome("ricardo eletro");
        a10.setCodAluno(1);
        a10.setNota1(5);
        a10.setNota2(6);
        a10.setNota3(7);
        a10.setNota4(9);
        
        t2.setNomeTurma("turma dos mads");
        
        t2.addAluno(a6);
        t2.addAluno(a7);
        t2.addAluno(a8);
        t2.addAluno(a9);
        t2.addAluno(a10);
        
        Escola e = new Escola();
        e.setNomeEscola("Etec cornin");
        e.addTurma(t1);
        e.addTurma(t2);
        
        
        System.out.println("Escola: "+e.getNomeEscola());
        e.exibirTurma();
    }
    
}
