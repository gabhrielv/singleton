package singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistroTransacoesTest {

    @BeforeEach
    void setUp() {
        RegistroTransacoes.getInstance().limpar();
    }

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        assertSame(RegistroTransacoes.getInstance(), RegistroTransacoes.getInstance());
    }

    @Test
    void deveRegistrarPagamentoCartao() {
        new PagamentoCartao().processar();
        assertEquals("Pagamento cartão efetuado", RegistroTransacoes.getInstance().getTransacoes().get(0));
    }

    @Test
    void deveRegistrarPagamentoPix() {
        new PagamentoPix().processar();
        assertEquals("Pagamento Pix efetuado", RegistroTransacoes.getInstance().getTransacoes().get(0));
    }

    @Test
    void deveRegistrarPagamentoBoleto() {
        new PagamentoBoleto().processar();
        assertEquals("Pagamento boleto efetuado", RegistroTransacoes.getInstance().getTransacoes().get(0));
    }

    @Test
    void deveCompartilharRegistroEntrePagamentos() {
        new PagamentoCartao().processar();
        new PagamentoPix().processar();
        new PagamentoBoleto().processar();
        assertEquals(3, RegistroTransacoes.getInstance().getTransacoes().size());
    }

}
