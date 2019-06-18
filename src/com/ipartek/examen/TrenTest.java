package com.ipartek.examen;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TrenTest {

	Tren tren;
	static final String TIPO = "Locomotora";
	static final int REFERENCIA = 12345;
	static final int ASIENTOS = 5;
	static final int ANNOS = 3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tren = new Tren(TIPO, REFERENCIA, ASIENTOS, ANNOS);
	}

	@After
	public void tearDown() throws Exception {
		tren = null;
	}

	@Test
	public void testTren() {
		assertEquals(TIPO, tren.getTipo());
		assertEquals(REFERENCIA, tren.getReferencia());
		assertEquals(ASIENTOS, tren.getAsientosOcupados());
		assertEquals(ANNOS, tren.getAnnosActivo());
		
		Tren tNull = new Tren(null, 0, 0, 0);
		assertEquals(null, tNull.getTipo());
		assertEquals(0, tNull.getReferencia());
		assertEquals(0, tNull.getAnnosActivo());
		assertEquals(0, tNull.getAnnosActivo());
	}

	@Test
	public void testTrenStringIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTipo() {
		assertEquals(TIPO, tren.getTipo());
	}

	@Test
	public void testSetTipo() {
		tren.setTipo("algo");
		assertEquals("algo", tren.getTipo());
		
		tren.setTipo(null);
		assertEquals(null, tren.getTipo());
	}

	@Test
	public void testGetReferencia() {
		assertEquals(REFERENCIA, tren.getReferencia());
	}

	@Test
	public void testSetReferencia() {
		tren.setReferencia(528);
		assertEquals(528, tren.getReferencia());
	}

	@Test
	public void testGetAsientosOcupados() {
		assertEquals(ASIENTOS, tren.getAsientosOcupados());
	}

	@Test
	public void testSetAsientosOcupados() {
		tren.setAsientosOcupados(Tren.MAXIMOS_PASAJEROS+1);
		assertEquals(Tren.MAXIMOS_PASAJEROS+1, tren.getAsientosOcupados());
		
		tren.setAsientosOcupados(528);
		assertEquals(528, tren.getAsientosOcupados());
		
		tren.setAsientosOcupados(-12);
		assertEquals(-12, tren.getAsientosOcupados());
	}

	@Test
	public void AnnosActivo() {
		assertEquals(ANNOS, tren.getAsientosOcupados());
	}

	@Test
	public void testSetAnnosActivo() {
		tren.setAnnosActivo(Tren.ANNOS_ACTIVO+1);
		assertEquals(Tren.ANNOS_ACTIVO+1, tren.getAnnosActivo());
		
		tren.setAnnosActivo(528);
		assertEquals(528, tren.getAnnosActivo());
		
		tren.setAnnosActivo(-16);
		assertEquals(-16, tren.getAnnosActivo());
	}

	@Ignore
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testTrenLleno() {
		assertFalse(tren.trenLleno()); //5 pasajeros
		
		tren.setAsientosOcupados(Tren.MAXIMOS_PASAJEROS);
		assertTrue(tren.trenLleno());
		
		tren.setAsientosOcupados(Tren.MAXIMOS_PASAJEROS+1);
		assertTrue(tren.trenLleno());
	}

	@Test
	public void testDemasiadoViejo() {
		assertFalse(tren.demasiadoViejo()); // 3 años
		tren.setAnnosActivo(40);
		assertTrue(tren.demasiadoViejo());
		tren.setAnnosActivo(41);
		assertTrue(tren.demasiadoViejo());
	}

}
