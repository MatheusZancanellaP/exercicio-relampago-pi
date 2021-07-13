public class Escola {
    private  Cidade cidade;
    private Professor diretor;

    public Escola(Professor diretor,Cidade cidade) {
    this.diretor = diretor;
    this.cidade = cidade;
    }


    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Professor getDiretor() {
        return diretor;
    }

    public void setDiretor(Professor diretor) {
        this.diretor = diretor;
    }

    public String getEscolaridadeDiretor(){
        return diretor.getDescricaoEscolaridade();
    }

    public String retornaEstadoLocalizacao(){
        return cidade.getNomeEstado();
    }
}
