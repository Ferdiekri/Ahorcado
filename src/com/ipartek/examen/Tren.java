package com.ipartek.examen;

/*
 * @author Eder Ib�nez Rojo
 */
public class Tren {

	private static final int MAXIMOS_PASAJEROS = 400;
	private static final int ANNOS_ACTIVO = 40;

	// atributos

	private String tipo; // Mercanc�as, pasajeros, tur�stico...
	private int referencia; // n�mero identificativo XXXXX
	private int asientosOcupados; // n�mero entero
	private int annosActivo; // n�mero entero

	// constructores

	public Tren() {
		super();
		this.tipo = "Tren b�sico";
		this.referencia = 00000;
		this.asientosOcupados = 0;
		this.annosActivo = 0;
	}

	public Tren(String tipo, int referencia, int asientosOcupados, int annosActivo) {
		this();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.annosActivo = annosActivo;
	}

	// getters & setters

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) throws Exception {
		this.tipo = tipo;
	}

	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int referencia) throws Exception {
		this.referencia = referencia;
	}

	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}

	public int getAnnosActivo() {
		return annosActivo;
	}

	public void setAnnosActivo(int annosActivo) {
		this.annosActivo = annosActivo;
	}

	// resto de funciones

	@Override
	public String toString() {
		return "\n*************************************\nDatos del tren:" + "\n\tTipo: " + tipo + "\n\tReferencia="
				+ referencia + "\n\tAsientos Ocupados=" + asientosOcupados + "\n\tA�os Activo=" + annosActivo
				+ "\n************************************";
	}

	/**
	 * Funci�n que calcula si el tren tiene todas las plazas ocupadas.
	 * 
	 * @see MAXIMOS_PASAJEROS
	 * @return (boolean) - verdadero si el tren est� lleno.
	 */
	public boolean trenLleno() {
		boolean plazas = false;

		if (this.asientosOcupados >= MAXIMOS_PASAJEROS) {
			plazas = true;
		}

		return plazas;
	}

	/**
	 * Funci�n que calcula si el tren es demasiado viejo para circular.
	 * 
	 * @see ANNOS_ACTIVO
	 * @return (boolean) - verdadero si el tren es viejo.
	 */
	public boolean demasiadoViejo() {
		boolean viejo = false;

		if (this.annosActivo >= ANNOS_ACTIVO) {
			viejo = true;
		}

		return viejo;
	}

}
