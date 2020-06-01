package estructuras;

import java.util.LinkedList;

/**
 * Implementación de Pila (Stack) basada en una ListaEnlazada.
 * 
 */
public class PilaSobreListaEnlazada<T> implements Pila<T> {

	private LinkedList<T> elementos;
	
	public PilaSobreListaEnlazada() {

		elementos = new LinkedList<T>();
	}
	
	@Override
	public boolean estaVacia() {

		return false;
	}

	@Override
	public void apilar(T nuevoElemento) {
		
	}

	@Override
	public T desapilar() {

		return null;
	}

	@Override
	public T obtenerTope() {

		return null;
	}
}