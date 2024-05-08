import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) throws Exception {
     String conta =" 24670-3";
     double saldo = 256.34;     
    // Chamando o Scanner
    
    Scanner scanner = new Scanner(System.in);
    // Obtendo nome do Cliente
        System.out.println("Olá Senhor,digite seu nome?");
        String nome = scanner.nextLine();
        
    // Obtendo o numero da agencia
        System.out.println("Digite o numero da agencia que deseja cadastrar Senhor?");
        int numeroAgencia = scanner.nextInt();
        System.out.println("A agencia do Senhor é " + numeroAgencia);
    
    // Criando numero da conta com digito automatico(padrao)
        System.out.println("o numero da sua conta é " + conta);
    
    // Demostrativo da conta
        System.out.println("Olá " + nome + ",obrigado por criar uma conta em nosso banco,sua agência é " + numeroAgencia +
         ",conta" + conta + " e seu saldo " + "R$"+ saldo + " já está disponível para saque!");



        scanner.close();


    }
}
