package singleton;

import java.util.ArrayList;
import java.util.List;

public class RegistroTransacoes {

    private RegistroTransacoes() {};
    private static RegistroTransacoes instance = new RegistroTransacoes();
    public static RegistroTransacoes getInstance() {
        return instance;
    }

    private List<String> transacoes = new ArrayList<>();

    public void registrar(String transacao) {
        this.transacoes.add(transacao);
    }

    public List<String> getTransacoes() {
        return transacoes;
    }

    public void limpar() {
        this.transacoes.clear();
    }
}
