package imc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MulherTest {

    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Mulher();
    }

    @Test
    void deveRetornarFemininoAbaixoPeso() {
        pessoa.setPeso(40.0f);
        pessoa.setAltura(1.6f);
        assertEquals("abaixo do peso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarFemininoPesoNormal() {
        pessoa.setPeso(60.0f);
        pessoa.setAltura(1.75f);
        assertEquals("no peso normal", pessoa.calcularImc());
    }

    @Test
    void deveRetornarFemininoMarginalmenteAcimaPeso() {
        pessoa.setPeso(19.0f);
        pessoa.setAltura(1.0f);
        assertEquals("marginalmente acima do peso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarFemininoAcimaPesoIdeal() {
        pessoa.setPeso(75.0f);
        pessoa.setAltura(1.7f);
        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }

    @Test
    void deveRetonarFemininoObeso() {
        pessoa.setPeso(90.0f);
        pessoa.setAltura(1.75f);
        assertEquals("obeso", pessoa.calcularImc());
    }

}