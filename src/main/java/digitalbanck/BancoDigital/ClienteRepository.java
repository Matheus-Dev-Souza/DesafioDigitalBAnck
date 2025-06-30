package digitalbanck.BancoDigital;

import java.util.*;

public interface ClienteRepository {
    Optional<Cliente> findByCpf(String cpf);
    Cliente save(Cliente cliente);
    void deleteByCpf(String cpf);
    List<Cliente> findAll();
}