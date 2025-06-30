package digitalbanck.BancoDigital;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ContaService {

    private final ContaRepository contaRepository;
    private final Transacao transacao;

    public ContaService(ContaRepository contaRepository, Transacao transacaoService) {
        this.contaRepository = contaRepository;
        this.transacao = transacaoService;
    }

    public ContaService(ClienteRepositoryImpl contaRepository2, Object transacaoService) {
        this.contaRepository = null;
       
        this.transacao = null;
    }

    public Conta criarContaCorrente(String agencia, Cliente cliente, BigDecimal limiteChequeEspecial) {
        String numero = gerarNumeroConta();
        Conta conta = new ContaCorrente(agencia, numero, cliente, limiteChequeEspecial);
        return contaRepository.save(conta);
    }

    public Optional<Conta> buscarPorNumero(String numero) {
        return contaRepository.findByNumero(numero);
    }

    public List<Conta> listarContasPorCliente(String cpf) {
        return contaRepository.findByClienteCpf(cpf);
    }

    public void transferir(String contaOrigem, String contaDestino, BigDecimal valor) {
        Conta origem = buscarPorNumero(contaOrigem)
                .orElseThrow(() -> new IllegalArgumentException("Conta origem não encontrada"));

        Conta destino = buscarPorNumero(contaDestino)
                .orElseThrow(() -> new IllegalArgumentException("Conta destino não encontrada"));

        origem.sacar(valor);
        destino.depositar(valor);

        transacao.registrarTransferencia(origem, destino, valor);
    }

    private String gerarNumeroConta() {
        return String.format("%08d", (long) (Math.random() * 100000000L));
    }
}
