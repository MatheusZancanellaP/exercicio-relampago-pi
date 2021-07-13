public class Pessoa {
    private Escolaridade escolaridade;
    String nome;
    Cidade naturalidade;

    public Pessoa(Escolaridade escolaridade,Cidade naturalidade) {
        this.escolaridade = escolaridade;
        this.naturalidade = naturalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Cidade getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getDescricaoEscolaridade(){
        return escolaridade.getFormacao();
    }


    public String retornaEstadoNascimento(){
        return naturalidade.getNomeEstado();
    }
    public String retornaCidadeNascimento(){
        return naturalidade.getNome();
    }
}
