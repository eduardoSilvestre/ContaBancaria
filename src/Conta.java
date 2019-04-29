public class Conta {

    private String numeroConta;
    private float saldo = 0.0f;
    private Cliente titular;

    public void depositar (Float deposito){
        saldo = saldo + deposito;
        System.out.println(saldo);
    }
    public void sacar (Float saque){
        if(saque <= saldo){
            saldo = saldo - saque;
            System.out.println("Você acabou de efetuar um saque, e ainda possui:" + saldo );
        }
        else{
            System.out.println("Saldo insuficiente");
        }

    }

    public Conta(){

    }

    public Conta(String numeroConta, Float saldo, Cliente titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
