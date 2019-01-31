import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;//importaciones necesarias
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;;

@RunWith(Parameterized.class)
public class LlenarDepositoTestJSMM {
	private double depMax;//tantas propiedades como parametros
	private double depActual;
	private double depALlenar;
	
	//constructor necesario para la prueba
	public  LlenarDepositoTestJSMM(double max,double actual,double llenar) {
		depMax=max;
		depActual=actual;
		depALlenar=llenar;
	}
	
	@Parameters //en este método introducimos la bateria de pruebas
	public static Collection<Object[]> numeros(){
		//Bateria de pruebas a realizar
		return Arrays.asList(new Object[][]{
			{60.5,30.5,15.0},{40.5,20.0,15.0},{30.0,5.5,5.0},{50.5,30.5,15.5}
		});
	}

	@Test
	public void testLlenarCombustible() {
		DepositoCombustible dep=new DepositoCombustible(depMax,depActual);
		double deposito = dep.consumir(depALlenar);
		double depositoTotal = deposito;
		assertEquals(depositoTotal,deposito,0.1);//valor esperado y el devuelto
	}
}