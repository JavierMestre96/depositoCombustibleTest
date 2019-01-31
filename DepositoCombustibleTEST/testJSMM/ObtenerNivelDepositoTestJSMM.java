import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;//importaciones necesarias
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;;

@RunWith(Parameterized.class)
public class ObtenerNivelDepositoTestJSMM {
	private double depMax;//tantas propiedades como parametros
	private double depActual;
	
	//constructor necesario para la prueba
	public  ObtenerNivelDepositoTestJSMM(double max,double actual) {
		depMax=max;
		depActual=actual;
	}
	
	@Parameters //en este método introducimos la bateria de pruebas
	public static Collection<Object[]> numeros(){
		//Bateria de pruebas a realizar
		return Arrays.asList(new Object[][]{
			{60.5,30.5},{40.5,30.0},{30.0,5.5},{50.5,30.5}
		});
	}
	//creamos el test parametrizado
	@Test
	public void testNivelDepositoTest() {
		DepositoCombustible dep=new DepositoCombustible(depMax,depActual);
		double deposito = dep.getDepositoNivel();
		assertEquals(depActual,deposito,0.1);//valor esperado y el devuelto
	}
}