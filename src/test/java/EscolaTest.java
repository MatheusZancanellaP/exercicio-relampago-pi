import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {
    private Cidade cidade;
    private Escolaridade escolaridade;
    private  Professor professor;
    private Curso curso;
    private Estado estado;
    private Escola escola;
    private Aluno aluno;
    private TipoEnsino tipoEnsino;
    @BeforeEach
    void setUp() {
        tipoEnsino = new TipoEnsino();
        estado = new Estado();
        cidade = new Cidade(estado);
        escolaridade = new Escolaridade();
        professor = new Professor(escolaridade,cidade);
        escola = new Escola(professor,cidade);
        curso = new Curso(professor,escola,tipoEnsino);
        aluno = new Aluno(escolaridade,cidade,curso);

    }
    @Test
    void deveRetornarMestrado() {
        escolaridade.setFormacao("Mestrado");
        assertEquals("Mestrado",escola.getEscolaridadeDiretor());
    }



}