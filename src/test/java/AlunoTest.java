import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarSP() {
        Aluno aluno = new Aluno();
        Cidade cidade = new Cidade();
        Estado estado = new Estado();
        cidade.setEstado(estado);
        estado.setNome("SP");
        aluno.setNaturalidade(cidade);
        assertEquals("SP",aluno.getNaturalidade().getEstado().getNome());
    }

    @Test
    void deveRetornarMG() {
        Aluno aluno = new Aluno();
        Escola escola = new Escola();
        Cidade cidade = new Cidade();
        Estado estado = new Estado();
        Curso curso = new Curso();
        curso.setEscola(escola);
        aluno.setCurso(curso);
        escola.setCidade(cidade);
        cidade.setEstado(estado);
        estado.setNome("MG");
        assertEquals("MG",aluno.getCurso().getEscola().getCidade().getEstado().getNome());
    }
    @Test
    void deveRetornarElias() {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Curso curso = new Curso();
        professor.setNome("Elias");
        aluno.setCurso(curso);
        curso.setCoordenador(professor);
        assertEquals("Elias",aluno.getCurso().getCoordenador().getNome());
    }


}