package digitalbanck.BancoDigital;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter 
@Setter
public class Banco {
    private String nome;
    private String codigo;
    private List<Conta> contas;
    
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }
}