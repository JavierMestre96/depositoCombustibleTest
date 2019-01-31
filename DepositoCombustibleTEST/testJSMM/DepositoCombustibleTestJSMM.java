
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;//necesario para utilizar @Before y @After
import org.junit.Before;

public class DepositoCombustibleTestJSMM {
	private DepositoCombustible dep;
	private double deposito;
	private boolean vacio;
	private boolean lleno;

	@After
	public void inicioPruebas(){
		dep=new DepositoCombustible(50.0,15.5);
	}
	
	@Before
	public void finPruebas(){
		dep=null;
	}

	@Test
	public void testGetDepositoNivel() {
		dep=new DepositoCombustible(50.0,15.5);
		deposito = dep.getDepositoNivel();
		assertEquals(15.5,deposito,0.1);
	}

	@Test
	public void testGetDepositoMax() {
		dep=new DepositoCombustible(50.0,15.5);
		deposito = dep.getDepositoMax();
		assertEquals(50.0,deposito,0.1);
	}

	@Test
	public void testEstaVacio() {
		dep=new DepositoCombustible(50.0,15.5);
		vacio = dep.estaVacio();
		assertEquals(false,vacio);
	}

	@Test
	public void testEstaLleno() {
		dep=new DepositoCombustible(50.0,15.5);
		lleno = dep.estaLlenoMitad();
		assertEquals(false,lleno);
	}

	@Test
	public void testFill() {
		dep=new DepositoCombustible(50.0,25.5);
		deposito = dep.fill(10.0);
		assertEquals(35.5,deposito,0.1);
	}

	@Test
	public void testConsumir() {
		dep=new DepositoCombustible(50.0,15.5);
		deposito = dep.consumir(10.0);
		assertEquals(5.5,deposito,0.1);
	}
	

}
