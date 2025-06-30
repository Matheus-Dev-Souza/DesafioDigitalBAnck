package digitalbanck.BancoDigital;

import java.util.*;

public interface ContaRepository {
    Optional<Conta> findByNumero(String numero);
    Conta save(Conta conta);
    List<Conta> findByClienteCpf(String cpf);
    List<Conta> findAll();
}