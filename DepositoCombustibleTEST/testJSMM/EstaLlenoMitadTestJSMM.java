import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;//importaciones necesarias
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;;

@RunWith(Parameterized.class)
public class EstaLlenoMitadTestJSMM {
	private double depMax;//tantas propiedades como parametros
	private double depActual;
	
	//constructor necesario para la prueba
	public  EstaLlenoMitadTestJSMM(double max,double actual) {
		depMax=max;
		depActual=actual;
	}
	
	@Parameters //en este método introducimos la bateria de pruebas
	public static Collection<Object[]> numeros(){
		//Bateria de pruebas a realizar
		return Arrays.asList(new Object[][]{
			{60.5,30.25},{40.0,20.0}
		});
	}
	//creamos el test parametrizado
	@Test
	public void testEstaLlenoMitad() {
		DepositoCombustible dep=new DepositoCombustible(depMax,depActual);
		boolean depositoLlenoAMitad = dep.estaLlenoMitad();
		assertEquals(true,depositoLlenoAMitad);//valor esperado y el devuelto
	}
}