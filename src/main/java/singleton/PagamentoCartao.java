package singleton;

public class PagamentoCartao implements IPagamento {

    public String processar() {
        String mensagem = "Pagamento cartão efetuado";
        RegistroTransacoes.getInstance().registrar(mensagem);
        return mensagem;
    }
}
