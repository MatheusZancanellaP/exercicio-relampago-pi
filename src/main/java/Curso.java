public class Curso {
    private TipoEnsino tipoEnsino;

    public Curso(Professor coordenador, Escola escola, TipoEnsino tipoEnsino) {
        this.coordenador = coordenador;
        this.escola = escola;
        this.tipoEnsino = tipoEnsino;
    }

    private Escola escola;
    private Professor coordenador;
    private Professor professor;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public Escola getEscola() {
        return escola;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public String getEscolaridadeCoordenador(){
        return coordenador.getDescricaoEscolaridade();
    }

}
