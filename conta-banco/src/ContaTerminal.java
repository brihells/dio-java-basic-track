import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = (new Scanner(System.in)).useLocale(Locale.US);
 
        System.out.println("Bem vindo ao Seu Nosso Banco!!");
        System.out.println("Para criar sua conta digite o seu Nome Completo: ");
        String nomeCompleto = scanner.nextLine();
 
        System.out.println("Por favor digite seu numero de conta");
        int conta = scanner.nextInt();
        scanner.nextLine();
 
        System.out.println("Agora sua agencia, por favor. ");
        String agencia = scanner.nextLine();
        
        System.out.println("Qual seu saldo atual? ");
        Double saldo = scanner.nextDouble();

        //Exibir as mensagens ao usuario
 
        // Obter pela classe scanner os valores editados no terminal
 
        System.out.println("Olá, " + nomeCompleto + " obrigado por criar uma conta em nosso banco!!");
        System.out.println("Sua agencia é: " + agencia);
        System.out.println("Sua conta: " + conta);
        System.out.println("Seu saldo atual: " + saldo + " já está disponível para saque.");
        //Exibir a mensagem da conta criada
 
        scanner.close();
     }
 }

