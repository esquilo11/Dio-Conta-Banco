import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();


        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc1 = new ContaCorrente(venilton);
        Conta poupanca1 = new ContaPoupanca(venilton);

        Cliente andre = new Cliente();
        andre.setNome("Andre");

        Conta cc2 = new ContaCorrente(andre);
        Conta poupanca2 = new ContaPoupanca(andre);

        Cliente caio = new Cliente();
        caio.setNome("Caio");

        Conta cc3 = new ContaCorrente(caio);
        Conta poupanca3 = new ContaPoupanca(caio);

        Conta conta1 = new ContaCorrente(venilton);
        Conta conta2 = new ContaCorrente(andre);
        Conta conta3 = new ContaCorrente(caio);

        List<Conta> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        banco.setContas(contas);
        banco.listarClientes();
    }

}