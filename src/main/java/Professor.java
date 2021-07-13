public class Professor extends Pessoa{
    Curso curso;
    public Professor(Escolaridade escolaridade, Cidade naturalidade){
        super(escolaridade,naturalidade);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public String retornaGrauAtuacao(){
        return curso.getTipoEnsino().getGrau();
    }
    public String retornaDiretor(){
        return curso.getEscola().getDiretor().getNome();
    }
    public String retornaCoordenador(){
        return curso.getCoordenador().getNome();
    }
}
