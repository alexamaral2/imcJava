package imc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Mulher();
    }


    @Test
    void deveRetornarPesoValido() {
        pessoa.setPeso(65.5f);
        assertEquals(65.5f, pessoa.getPeso());
    }

    @Test
    void deveRetornarPesoInvalido() {
        try {
            pessoa.setPeso(0.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Peso inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarAlturaValida() {
        pessoa.setAltura(1.75f);
        assertEquals(1.75f, pessoa.getAltura());
    }

    @Test
    void deveRetornarAlturaInvalida() {
        try {
            pessoa.setAltura(0.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Altura inválida", e.getMessage());
        }
    }
}