package digitalbanck.BancoDigital;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ContaRepositoryImpl implements ContaRepository {

    private final Map<String, Conta> contas = new ConcurrentHashMap<>();

    @Override
    public Conta save(Conta conta) {
        contas.put(conta.getNumero(), conta);
        return conta;
    }

    @Override
    public Optional<Conta> findByNumero(String numero) {
        return Optional.ofNullable(contas.get(numero));
    }

    @Override
    public List<Conta> findByClienteCpf(String cpf) {
        List<Conta> contasDoCliente = new ArrayList<>();
        for (Conta conta : contas.values()) {
            if (conta.getCliente().getCpf().equals(cpf)) {
                contasDoCliente.add(conta);
            }
        }
        return contasDoCliente;
    }

    @Override
    public List<Conta> findAll() {

        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
}
