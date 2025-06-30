package digitalbanck.BancoDigital;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {
    private final BigDecimal taxaRendimento;

    public ContaPoupanca(String agencia, String numero, Cliente cliente, BigDecimal taxaRendimento) {
        super(agencia, numero, cliente);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        BigDecimal rendimento = super.getSaldo().multiply(taxaRendimento);
        super.depositar(rendimento);
    }

    @Override
    public String getTipoConta() {
        return "POUPANCA";
    }
}