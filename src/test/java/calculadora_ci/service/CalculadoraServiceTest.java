package calculadora_ci.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class CalculadoraServiceTest {

    private final CalculadoraService service = new CalculadoraService();

    @Test
    void deveSomar() {
        assertEquals(8, service.somar(5, 3)); // valor errado propositalmente
    }

    @Test
    void deveSomarNumerosNegativos() {
        assertEquals(3, service.somar(-2, 5));
    }

    @Test
    void deveSubtrair() {
        assertEquals(5, service.subtrair(8, 3));
    }

    @Test
    void deveMultiplicar() {
        assertEquals(24, service.multiplicar(4, 6));
    }

    @Test
    void deveMultiplicarPorZero() {
        assertEquals(0, service.multiplicar(15, 0));
    }

    @Test
    void deveDividir() {
        assertEquals(5, service.dividir(10, 2));
    }

    @Test
    void deveSomarComZero() {
        assertEquals(9, service.somar(9, 0));
    }

    @Test
    void naoPermiteDivisaoPorZero() {

        IllegalArgumentException excecao = assertThrows(
                IllegalArgumentException.class,
                () -> service.dividir(5, 0)
        );

        assertEquals("Não é possível dividir por zero", excecao.getMessage());
    }}
