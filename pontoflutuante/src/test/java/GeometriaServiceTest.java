import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.GeometriaService;

public class GeometriaServiceTest {
    @Test
    public void DeveCalculcularAreaTrianguloComSucesso(){
        GeometriaService geometriaService = new GeometriaService();
        double resultado = geometriaService.CalcularAreaTringulo(2.0, 2.0);
       assertEquals(2, resultado);
    }

    @Test
    public void DeveCalcularAreaQuadradoComsucesso(){
        GeometriaService geometriaService = new GeometriaService();
        double resultado = geometriaService.CalcularAreaQuadrado(2);
        assertEquals(4, resultado);
    }

    @Test
    public void DeveCalcularArearRetanguloComSucesso(){
        GeometriaService geometriaService = new GeometriaService();
        double resultado = geometriaService.CalcularAreaRetangulo(2, 3);
        assertEquals(6, resultado);
    }

    @Test
    public void DeveCalcularAreaCircunferenciaComSucesso(){
        GeometriaService geometriaService = new GeometriaService();
        double resultado = geometriaService.CalcularAreaCircunferencia(2);
        assertEquals(12.5, resultado, 0.1);
    }

    @Test
    public void DeveCalcularVolumeEsfera(){
        GeometriaService geometriaService = new GeometriaService();
        double resultado = geometriaService.CalcularVolumeEsfera(2);
        assertEquals(33.5, resultado, 0.1);
    }

}
