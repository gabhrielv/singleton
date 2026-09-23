package singleton;

public class PagamentoBoleto implements IPagamento {

    public String processar() {
        String mensagem = "Pagamento boleto efetuado";
        RegistroTransacoes.getInstance().registrar(mensagem);
        return mensagem;
    }
}
