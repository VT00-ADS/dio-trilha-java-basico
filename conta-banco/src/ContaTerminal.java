import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        
int numero = 1021;
String agencia = "067-9";
double saldo = 237.48;

Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

System.out.println("Por favor, digite seu nome: ");
String nomeCliente = scanner.next();

System.out.println("Por favor, Digite seu CPF: ");
String CPF = scanner.next();

System.out.println("Olá "+ nomeCliente + 
", obrigado por criar uma conta em nosso banco, sua agencia é: " +
 agencia+
", conta: " +
 numero + " e seu saldo: "+
  saldo + " já está disponivel para saque.");

   }
}