import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
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
    void deveRetornarBahia() {
        estado.setNome("Bahia");
        assertEquals("Bahia",aluno.retornaEstadoNascimento());
    }
    @Test
    void deveRetornarSP() {
        estado.setNome("SP");
        assertEquals("SP",aluno.retornaEstadoEstuda());
    }
    @Test
    void deveRetornarMarco() {
        professor.setNome("Jean");
        assertEquals("Jean",aluno.retornaCoordenador());
    }




}