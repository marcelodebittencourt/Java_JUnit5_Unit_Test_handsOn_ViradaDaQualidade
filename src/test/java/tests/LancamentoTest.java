package tests;

import org.junit.jupiter.api.Test;
import principal.Cliente;
import principal.Conta;
import principal.Lancamento;

import java.util.Date;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LancamentoTest {

    @Test
    void TestaLancamento_ValidaSaldoContaModificado() {
        Cliente ana = new Cliente("Ana");
        Conta contaDaAna = new Conta(ana, 1, 96, 0.0);
        Lancamento depositoDinheiro = new Lancamento(contaDaAna, 'C', new Date(2021, 07, 03), 150.0, "Depósito em dinheiro");
        assertThat(contaDaAna.getSaldo()).isGreaterThan(0.0);
        assertThat(contaDaAna.getSaldo()).isEqualTo(150.0);
        Lancamento pagtoContaAgua = new Lancamento(contaDaAna, 'D', new Date(2021, 07, 04), 100.50, "Pagto de conta de luz");
        assertThat(contaDaAna.getSaldo()).isEqualTo(49.5);
    }
}
