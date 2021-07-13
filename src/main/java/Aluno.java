public class Aluno extends Pessoa{
    private Curso curso;



    public Aluno(Escolaridade escolaridade, Cidade naturalidade,Curso curso){
        super(escolaridade,naturalidade);
        this.curso = curso;
    }
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public String retornaEstadoEstuda(){
        return curso.getEscola().retornaEstadoLocalizacao();
    }
    public String retornaCoordenador(){
        return curso.getCoordenador().getNome();
    }
}
