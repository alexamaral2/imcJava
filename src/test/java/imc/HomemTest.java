package imc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomemTest {

    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Homem();
    }

    @Test
    void deveRetornarMasculinoAbaixoPesoLimiteInferior() {
        pessoa.setPeso(18.5f);
        pessoa.setAltura(1.0f);
        assertEquals("abaixo do peso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarMasculinoAbaixoPesoLimiteSuperior() {
        pessoa.setPeso(20.5f);
        pessoa.setAltura(1.0f);
        assertEquals("abaixo do peso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarMasculinoPesoNormalLimiteInferior() {
        pessoa.setPeso(20.7f);
        pessoa.setAltura(1.0f);
        assertEquals("no peso normal", pessoa.calcularImc());
    }

    @Test
    void deveRetornarMasculinoPesoNormalLimiteSuperior() {
        pessoa.setPeso(26.2f);
        pessoa.setAltura(1.0f);
        assertEquals("no peso normal", pessoa.calcularImc());
    }

    @Test
    void deveRetornarMasculinoMarginalmenteAcimaPesoLimiteInferior() {
        pessoa.setPeso(26.4f);
        pessoa.setAltura(1.0f);
        assertEquals("marginalmente acima do peso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarMasculinoMarginalmenteAcimaPesoLimiteSuperior() {
        pessoa.setPeso(27.6f);
        pessoa.setAltura(1.0f);
        assertEquals("marginalmente acima do peso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarMasculinoAcimaPesoIdealLimiteInferior() {
        pessoa.setPeso(27.8f);
        pessoa.setAltura(1.0f);
        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }

    @Test
    void deveRetornarMasculinoAcimaPesoIdealLimiteSuperior() {
        pessoa.setPeso(30.9f);
        pessoa.setAltura(1.0f);
        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }

    @Test
    void deveRetonarMasculinoObesoLimiteInferior() {
        pessoa.setPeso(31.0f);
        pessoa.setAltura(1.0f);
        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }

    @Test
    void deveRetonarMasculinoObesoLimiteSuperior() {
        pessoa.setPeso(40.0f);
        pessoa.setAltura(1.0f);
        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }
}