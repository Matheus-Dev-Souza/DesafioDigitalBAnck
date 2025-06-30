package digitalbanck.BancoDigital;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ContaCorrente extends Conta {
    private BigDecimal limiteChequeEspecial;

    public ContaCorrente(String agencia, String numero, Cliente cliente, BigDecimal limiteChequeEspecial) {
        super(agencia, numero, cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(BigDecimal valor) {
        BigDecimal saldoDisponivel = super.getSaldo().add(limiteChequeEspecial);
        if (saldoDisponivel.compareTo(valor) >= 0) {
            super.sacar(valor);
        } else {
            throw new IllegalStateException("Saldo + cheque especial insuficiente");
        }
    }

    @Override
    public String getTipoConta() {
        return "CORRENTE";
    }
}