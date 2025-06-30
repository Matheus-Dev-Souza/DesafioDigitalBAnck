package digitalbanck.BancoDigital;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Repositórios
        ClienteRepositoryImpl clienteRepository = new ClienteRepositoryImpl();
        ContaRepositoryImpl contaRepository = new ContaRepositoryImpl();

        // Serviços
        ClienteService clienteService = new ClienteService(clienteRepository);

        // Você pode passar null se ainda não usa transferências
        ContaService contaService = new ContaService(contaRepository, null);

        // Cliente
        Cliente cliente = new Cliente("12345678901", "João Silva");
        clienteService.cadastrarCliente(cliente);

        // Conta Corrente
        ContaCorrente conta = (ContaCorrente) contaService.criarContaCorrente(
            "0001", cliente, new BigDecimal("1000.00")
        );

        // Operações
        conta.depositar(new BigDecimal("500.00"));
        conta.sacar(new BigDecimal("200.00"));

        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}
