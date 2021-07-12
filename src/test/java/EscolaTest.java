import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarBangu() {
        Escola escola = new Escola();
        Professor diretor = new Professor();
        Cidade cidade = new Cidade();
        escola.setDiretor(diretor);
        cidade.setNome("Bangu");
        diretor.setNaturalidade(cidade);
        assertEquals("Bangu",escola.getDiretor().getNaturalidade().getNome());
    }
   @Test
    void deveRetornarCarlos(){
        Escola escola = new Escola();
        Professor professor = new Professor();
        professor.setNome("Carlos");
        escola.setDiretor(professor);
        assertEquals("Carlos",escola.getDiretor().getNome());
    }
}