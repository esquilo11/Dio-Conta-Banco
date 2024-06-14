import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void listarClientes(){
        List<String> clientes = new ArrayList<>();

        clientes = contas.stream().map(Conta::getCliente).collect(Collectors.toList());
        System.out.println(clientes);
    }

}