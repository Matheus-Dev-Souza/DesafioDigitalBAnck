package digitalbanck.BancoDigital;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class Conta {
    private final String agencia;
    private final String numero;
    private BigDecimal saldo;
    private final Cliente cliente;
    private final List<Transacao> transacoes = new ArrayList<>();

    public Conta(String agencia, String numero, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = BigDecimal.ZERO;
    }

    public void depositar(BigDecimal valor) {
        this.saldo = saldo.add(valor);
        registrarTransacao("DEPOSITO", valor);
    }

    public void sacar(BigDecimal valor) {
        if (saldo.compareTo(valor) >= 0) {
            this.saldo = saldo.subtract(valor);
            registrarTransacao("SAQUE", valor);
        } else {
            throw new IllegalStateException("Saldo insuficiente");
        }
    }

    protected void registrarTransacao(String tipo, BigDecimal valor) {
        transacoes.add(new Transacao(tipo, valor, LocalDateTime.now()));
    }

    public abstract String getTipoConta();
}