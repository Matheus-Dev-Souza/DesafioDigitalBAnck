package digitalbanck.BancoDigital;

public class CpfValidator {
    public static boolean isValid(String cpf) {
        if (cpf == null || cpf.length() != 11 || !cpf.matches("\\d{11}")) {
            return false;
        }
        
        // Implementação do algoritmo de validação de CPF
        // ... (código de validação completo)
        
        return true;
    }
}