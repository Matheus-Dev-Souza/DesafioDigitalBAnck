package digitalbanck.BancoDigital;

import java.util.*;

public class ClienteRepositoryImpl implements ClienteRepository {
    private final Map<String, Cliente> clientes = new HashMap<>();

    @Override
    public Optional<Cliente> findByCpf(String cpf) {
        return Optional.ofNullable(clientes.get(cpf));
    }

    @Override
    public Cliente save(Cliente cliente) {
        clientes.put(cliente.getCpf(), cliente);
        return cliente;
    }

    @Override
    public void deleteByCpf(String cpf) {
        clientes.remove(cpf);
    }

    @Override
    public List<Cliente> findAll() {
        return new ArrayList<>(clientes.values());
    }
}
