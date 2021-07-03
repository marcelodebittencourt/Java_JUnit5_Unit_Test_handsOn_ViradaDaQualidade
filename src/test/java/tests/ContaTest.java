package tests;

import org.junit.jupiter.api.*;
import principal.Cliente;
import principal.Conta;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ContaTest {

    static Cliente ciclano;
    static Conta corrente;

    @BeforeAll
    static void setup(){
        System.out.println("Antes de todos os testes");
        ciclano = new Cliente("Ciclano");
        corrente = new Conta(ciclano, 1, 67, 0.0);
    }

    @BeforeEach
    void antesDeCadaTeste() {
        System.out.println("Antes de cada teste");
    }

    @DisplayName("Teste da conta simples validando saldo zerado")
    @Test
    void TestaContaSimples_ValidaSaldoZeradoInicial() {
        assertThat(corrente.getSaldo()).isEqualTo(0.0);
    }
    @Test
    void TestaContaSimples_ValidaAgenciaOk() {
        assertThat(corrente.getAgencia()).isEqualTo(1);
    }

    @AfterEach
    void depoisDeCadaTeste() {
        System.out.println("Depois de cada teste");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("Depois de todos os testes");
    }
}
