package digitalbanck.BancoDigital;

import lombok.Getter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
public class Transacao {
    private final String tipo;
    private final BigDecimal valor;
    private final LocalDateTime data;
    private final String descricao;

    public Transacao(String tipo, BigDecimal valor, LocalDateTime data) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.descricao = String.format("%s de R$%.2f", tipo, valor);
    }

    public void registrarTransferencia(Conta origem, Conta destino, BigDecimal valor2) {
        throw new UnsupportedOperationException("Unimplemented method 'registrarTransferencia'");
    }
}