package com.ipartek.examen;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
		fail("Not yet implemented");
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
		fail("Not yet implemented");
	}

	@Test
	public void testGetReferencia() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetReferencia() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAsientosOcupados() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAsientosOcupados() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAnnosActivo() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAnnosActivo() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testTrenLleno() {
		fail("Not yet implemented");
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
