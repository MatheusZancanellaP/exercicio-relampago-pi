import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarSuperior(){
        Professor professor = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setFormacao("Superior");
        professor.setEscolaridade(escolaridade);
        assertEquals("Superior",professor.getEscolaridade().getFormacao());
    }
    @Test
    void deveRetornarValinhos() {
        Professor professor = new Professor();
        Cidade cidade = new Cidade();
        cidade.setNome("Valinhos");
        professor.setNaturalidade(cidade);
        assertEquals("Valinhos",professor.getNaturalidade().getNome());
    }
    @Test
    void deveRetornarFundamental() {
        Professor professor = new Professor();
        Curso curso = new Curso();
        TipoEnsino tipoEnsino = new TipoEnsino();
        tipoEnsino.setGrau("Fundamental");
        professor.setCurso(curso);
        curso.setTipoEnsino(tipoEnsino);
        assertEquals("Fundamental",professor.getCurso().getTipoEnsino().getGrau());


    }


}