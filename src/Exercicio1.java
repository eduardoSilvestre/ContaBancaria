public class Exercicio1 {

    public static void main(String[] args) {
        Cliente clienteUm = new Cliente();
        clienteUm.setNome("Eduardo");
        clienteUm.setSobrenome("Silvestre");


        Cliente clienteDois = new Cliente ();
        clienteDois.setNome("Daniela");
        clienteDois.setSobrenome("Silvestre");

        Conta contaUm = new Conta();
        contaUm.setTitular(clienteUm);
        contaUm.setNumeroConta("123");
        contaUm.setSaldo(100.0f);

        Conta contaDois = new Conta();
        contaDois.setTitular(clienteDois);
        contaDois.setNumeroConta("123");
        contaDois.setSaldo(50.0f);

        contaUm.depositar(100.0f);
        contaUm.sacar(10.0f);
        contaDois.depositar(100.f );
        contaDois.sacar(10.0f);


    }


}
