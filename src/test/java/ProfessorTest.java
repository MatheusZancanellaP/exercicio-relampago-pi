import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
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
        assertEquals("Mestrado",professor.getDescricaoEscolaridade());
    }
    @Test
    void deveRetornarIapoque() {
        cidade.setNome("Iapoque");
        assertEquals("Iapoque",professor.retornaCidadeNascimento());
    }
    @Test
    void deveRetornarMedio() {
        professor.setCurso(curso);
        tipoEnsino.setGrau("Medio");
        assertEquals("Medio",professor.retornaGrauAtuacao());
    }
    @Test
    void deveRetornarPassini() {
        professor.setCurso(curso);
        professor.setNome("Passini");
        assertEquals("Passini",professor.retornaDiretor());
    }
    @Test
    void deveRetornarMarco() {
        professor.setCurso(curso);
        professor.setNome("Marco");
        Professor coordenador = new Professor(escolaridade, cidade);
        coordenador.setNome("Jean");
        curso.setCoordenador(coordenador);
        assertEquals("Jean",professor.retornaCoordenador());
    }



}