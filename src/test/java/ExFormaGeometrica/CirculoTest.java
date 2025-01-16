package ExFormaGeometrica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    Circulo circulo;

    @BeforeEach
    void setUp(){
        circulo = new Circulo();
    }

    @Test
    void deveRetornarArea(){
        circulo.setRaio(2.0f);
        assertEquals(12.5664f, circulo.calcularArea());
    }

    @Test
    void deveRetornarPerimetro(){
        circulo.setRaio(2.0f);
        assertEquals(12.5664f, circulo.calcularPerimetro());
    }

}