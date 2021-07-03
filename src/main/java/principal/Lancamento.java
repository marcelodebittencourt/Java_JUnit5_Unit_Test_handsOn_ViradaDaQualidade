package principal;

import principal.Conta;

import java.util.Date;

public class Lancamento {

    Conta conta;
    char debitoCredito;
    Date data;
    double valor;
    String historico;

    public Lancamento(Conta conta, char debitoCredito, Date data, double valor, String historico){
        setConta(conta);
        setDebitoCredito(debitoCredito);
        setData(data);
        setValor(valor);
        setHistorico(historico);
        if (debitoCredito == 'D') {
            conta.setSaldo(conta.getSaldo() - valor);
        } else {
            conta.setSaldo(conta.getSaldo() + valor);
        }
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public char getDebitoCredito() {
        return debitoCredito;
    }

    public void setDebitoCredito(char debitoCredito) {
        this.debitoCredito = debitoCredito;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void print(){
        System.out.println("*** Lançamento ***");
        System.out.println("principal.Cliente Titular: " + conta.getTitular().getNome());
        System.out.println("principal.Conta agência / número: " + conta.getAgencia() + " / " + conta.getNumero());
        System.out.println("principal.Conta saldo: " + conta.getSaldo());
        System.out.println("D/C: " + getDebitoCredito());
        System.out.println("Data: " + getData());
        System.out.println("Valor: " + getValor());
        System.out.println("Histórico: " + getHistorico());
    }
}
