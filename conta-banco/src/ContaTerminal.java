import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner

        
        // obter pela Scanner os valores digitados no terminal

        // exibir a mensagem conta criada

        // Exibir as mensagens do usuario

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por favor diga seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor diga seu numero: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor diga seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
        

    }
}
