package estructuras;

/**
 * Implementación de Pila (Stack) basada en arreglos.
 * 
 */
public class PilaSobreArreglos<T> implements Pila<T> {

	private T[] elementos;
	private int cantidad;
	
	public PilaSobreArreglos(int capacidadInicial) {
	
		elementos = crearArreglo(capacidadInicial);
		cantidad = 0;
	}
	
	@SuppressWarnings("unchecked")
	private T[] crearArreglo(int capacidad) {
		
		return (T[]) new Object[capacidad];
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