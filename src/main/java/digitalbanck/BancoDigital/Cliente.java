package digitalbanck.BancoDigital;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString
public class Cliente {
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private List<Conta> contas = new ArrayList<>();

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
}