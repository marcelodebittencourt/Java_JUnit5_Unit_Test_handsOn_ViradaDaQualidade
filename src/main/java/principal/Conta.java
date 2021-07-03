package principal;

public class Conta {

    principal.Cliente titular;
    int agencia;
    int numero;
    double saldo;

    public Conta(principal.Cliente titular, int agencia, int numero, double saldo){
        setTitular(titular);
        setAgencia(agencia);
        setNumero(numero);
        setSaldo(saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public principal.Cliente getTitular() {
        return titular;
    }

    public void setTitular(principal.Cliente titular) {
        this.titular = titular;
    }

}
