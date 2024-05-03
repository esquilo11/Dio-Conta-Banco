// Importação do ulitlitario scanner para entrada de dados
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        // Instanciação do scanner para que possa ser ulitlizado
        Scanner scan = new Scanner(System.in);

        ContaTerminal conta = new ContaTerminal();

        System.out.println("Insira o numero de sua conta ");
        conta.setNumero(scan.nextInt());

        System.out.println("Insira saldo existente ");
        conta.setSaldo(scan.nextDouble());

        // Ao ulitlizar o scanner para nextLine Após a ulitlização para qualquer outro tipo
        // deve-se realizar a limpeza do cache do scanner inserindo o metodo de entrada para que 
        // a proxima leitura não seja ignorada. isso pode ser feito iniciando o scanner como nextLine
        // antes da proxima leitura ou ultilizando o scanner apenas como leitura de string "nextLine"
        // e convertendo os dados de entrada para o tipo desejado no momento da atribuição do valor

          
        scan.nextLine();
        System.out.println("Insira o numero de sua agencia ");
        conta.setAgencia(scan.nextLine());

        System.out.println("Insira seu nome ");
        conta.setNomeCliente(scan.nextLine());


        System.out.println("-------------------------- \n");
        System.out.println(conta.numero);
        System.out.println(conta.agencia);
        System.out.println(conta.nomeCliente);
        System.out.println(conta.saldo);
    }
}
