import java.util.Vector;

public class StackVector<E> implements Stack<E> {
	protected Vector<E> datos;
	
	/*Constructor de la clase*/
	public StackVector() {
		datos = new Vector<E>();
	}
	
	@Override
	public void push(E item) {
		/*Añadimos datos al stack*/
		datos.addElement(item);
		
	}

	@Override
	public E pop() {
		/*Elimina el ultimo dato*/
		return datos.remove(size() - 1);
	}

	@Override
	public E peek() {
		/*Devuelve el ultimo dato*/
		return datos.get(size() - 1);
	}

	@Override
	public boolean empty() {
		/*Devuelve si esta lleno o no*/
		return size() == 0;
	}

	@Override
	public int size() {
		/*El tamaño del vector*/
		return datos.size();
	}

}
