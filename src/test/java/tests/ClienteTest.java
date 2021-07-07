package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import principal.Cliente;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClienteTest {

    @Disabled
    @Test
    void TestaNomeCliente_ValidaNomeCorreto() {
        Cliente clienteVip = new Cliente("Fulano de Tal");
        assertTrue("Fulano de Tal" == clienteVip.getNome());
    }

    @Test
    void TestaNomeCliente_ValidaNomeCorretoComAssertJ() {
        Cliente clienteVip = new Cliente("Fulano de Tal");
        assertThat(clienteVip.getNome()).isEqualTo("Fulano de Tal");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/nomes.csv", numLinesToSkip = 1, delimiter = ';')
    void TestaNomeCliente_ValidaMultiplosNomes(String nome) {
        Cliente cliente1 = new Cliente(nome);
        System.out.println("Nome: " + nome);
        assertThat(cliente1.getNome()).isEqualTo(nome);
    }
}
