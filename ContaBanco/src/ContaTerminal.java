import java.util.Scanner;

public class ContaTerminal {
    public static void main(String [] args) throws Exception {
       //Conhecer a classe scanner 
            Scanner scanner = new Scanner (System.in);

        // Exibir a mensagem para nosso usuário 
            System.out.println("Digite o numero da conta: ");
            String Numero = scanner.nextLine(); //Lendo o número da conta
           
             System.out.println("Digite sua agência: " );
            String Agencia = scanner.nextLine(); //Lendo o número da agência
           
             System.out.println("Digite seu nome: " ); 
            String Cliente = scanner.nextLine(); //Lendo o nome do usuário
            
             System.out.println("Digite seu saldo: " );
            double Saldo = scanner.nextDouble(); //Lendo saldo
         
       

        //Exibir a mensagem da conta criada
            System.out.println("Olá " + Cliente + "! O número da sua conta é: " + Numero + ". Sua agênci é: " + Agencia + ". Seu saldo total disponivel para saque é de: " + Saldo);
    }
}
