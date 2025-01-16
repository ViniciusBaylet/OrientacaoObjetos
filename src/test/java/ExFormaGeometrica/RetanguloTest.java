package ExFormaGeometrica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    Retangulo retangulo;

    @BeforeEach
    void setUo(){
        retangulo = new Retangulo();
    }

    @Test
    void deveRetornarArea(){
        retangulo.setBase(2.0f);
        retangulo.setAltura(3.0f);
        assertEquals(6.0f, retangulo.calcularArea());
    }

    @Test
    void deveRetornarPerimetro(){
        retangulo.setBase(2.0f);
        retangulo.setAltura(3.0f);
        assertEquals(10.0f, retangulo.calcularPerimetro());
    }

}