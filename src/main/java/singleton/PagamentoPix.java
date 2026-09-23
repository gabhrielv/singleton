package singleton;

public class PagamentoPix implements IPagamento {

    public String processar() {
        String mensagem = "Pagamento Pix efetuado";
        RegistroTransacoes.getInstance().registrar(mensagem);
        return mensagem;
    }
}
