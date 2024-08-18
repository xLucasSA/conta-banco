import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da CONTA:");
        numero = scanner.nextInt();

        System.out.println("Digite a AGÊNCIA:");
        agencia = scanner.next();

        System.out.println("Digite o seu NOME:");
        nomeCliente = scanner.next();

        System.out.println("Digite o SALDO da conta:");
        saldo = scanner.nextDouble();
        
        String resposta = "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque";
        System.out.println(String.format(resposta, nomeCliente, agencia, numero, saldo));

    }
}
