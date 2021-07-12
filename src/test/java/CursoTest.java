import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
     void deveRetornarSuperior() {
        Professor coordenador = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setFormacao("Superior");
        coordenador.setEscolaridade(escolaridade);
        Curso curso = new Curso();
        curso.setCoordenador(coordenador);
        assertEquals("Superior",curso.getCoordenador().getEscolaridade().getFormacao());
    }
    @Test
    void deveRetornarJeff(){
        Professor coordenador = new Professor();
        Curso curso = new Curso();
        coordenador.setNome("Jeff");
        curso.setCoordenador(coordenador);
        assertEquals("Jeff",curso.getCoordenador().getNome());
    }

}